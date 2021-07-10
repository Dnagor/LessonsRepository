package ua.lviv.lgs.lesson22.lecture;

interface StringFunc {
    String func(String str);
}

public class LambdaArgumentDemo {
    public static void main(String[] args) {
        String inStr = "Lambda expressions expand Java.";
        String outStr;
        System.out.println("Input line: " + inStr);
        StringFunc reverse = (str) -> {
            String result = "";
            for (int i = str.length() - 1; i >= 0; i--) {
                result += str.charAt(i);
            }
            return result;
        };
        outStr = changeStr(reverse, inStr);
        System.out.println("Changed line: " + outStr);

//it is correct to write this way, code is easy to read
        outStr = changeStr((str -> str.replace(" ", "-")), inStr);
        System.out.println("Line with replaced whitespaces: " + outStr);

//it is correct to write this way too, but code is hard to read.
// Extract method would be better in this case.
        outStr = changeStr(str -> {
            String result ="";
            char ch;
            for (int i = 0; i  < str.length()  ; i++) {
                ch = str.charAt(i);
                if (Character.isUpperCase(ch))
                    result+= Character.toLowerCase(ch);
                else
                    result +=Character.toUpperCase(ch);
            }
            return result;
        },inStr);
        System.out.println("Line with opposite Letter sizes: "+ outStr);

    }

    static String changeStr(StringFunc sf, String s) {
        return sf.func(s);
    }
}
