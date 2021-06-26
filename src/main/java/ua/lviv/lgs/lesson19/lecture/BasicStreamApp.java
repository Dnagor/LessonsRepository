package ua.lviv.lgs.lesson19.lecture;

import java.io.*;

public class BasicStreamApp {

    public static void main(String[] args) throws IOException {
        File file = new File("Basic.txt");
        writeUsingOS(file, "Hello World");
    }

    public static void writeUsingOS(File file, String data) throws IOException {

        OutputStream os = new FileOutputStream(file);
        os.write(data.getBytes());
        os.close();

        System.out.println(readFromIS(file));

        File file2 = new File("Basic2.txt");
        writeUsingSS(file2,"String in file 2");

        System.out.println(readUsingSS(file2,10));
    }

    public static String readFromIS(File file) throws IOException {
        InputStream is = new FileInputStream(file);
        int information = is.read();
        char data;
        StringBuilder sb= new StringBuilder();
        while (information != -1){
            data = (char) information;
            sb.append(data);
            information = is.read();
        }
        is.close();
        return sb.toString();
    }

    public static void writeUsingSS(File file, String data) throws IOException {
        Writer writer = new FileWriter(file);
        writer.write(data);
        writer.close();
    }

    public static  String readUsingSS(File file, int arrSize) throws IOException {
        Reader reader = new FileReader(file);
        char[] array = new char[arrSize];
        reader.read();
        reader.close();
        StringBuilder sb = new StringBuilder();
        for (char c : array) {
            sb.append(c);
        }
        return  sb.toString();
    }

}
