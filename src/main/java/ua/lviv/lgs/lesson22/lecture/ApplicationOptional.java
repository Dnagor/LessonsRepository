package ua.lviv.lgs.lesson22.lecture;

import java.util.Optional;

public class ApplicationOptional {
    public static void main(String[] args) {
        //empty optional
        Optional<String> emptyObj = Optional.empty();
        if (!emptyObj.isPresent()) {
            System.out.println("emptyObj is empty");
        }
        //create optional
        String testName = "True";
        Optional<String> of = Optional.of(testName);
        if (of.isPresent()) {
            System.out.println("Of is : " + of);
        }
        //work with null
        testName = null;
        Optional<String> nullObj = Optional.ofNullable(testName);
        if (!nullObj.isPresent()) {
            System.out.println("nullObj is empty");
        }
        //if present
        Optional<String> optObj = Optional.of("test");
        optObj.ifPresent(o -> System.out.println(o.length()));
        //orElse
        String nameObj = Optional.ofNullable(testName).orElse("DefaultString");
        System.out.println(nameObj);
        //orElseGet
        nameObj = Optional.ofNullable(testName).orElseGet(() -> "Lorem ipsum");
        System.out.println(nameObj);
        //orElseThrow (will throw exception because testname is null)
//        try {
//            nameObj = Optional.ofNullable(testName).orElseThrow(SQLException::new);
//        } catch (SQLException throwables) {
//            throwables.printStackTrace();
//        }
        //get
        optObj = Optional.of("testName");
        System.out.println(optObj.get());
        //filter
        Integer year = 2000;
        Optional<Integer> optional = Optional.of(year);
        boolean is2000 = optional.filter(y -> y == 2000).isPresent();
        boolean is2001 = optional.filter(y -> y == 2001).isPresent();
        System.out.println(is2000 + " " + is2001  );
    }
}
