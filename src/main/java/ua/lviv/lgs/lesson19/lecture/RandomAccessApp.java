package ua.lviv.lgs.lesson19.lecture;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessApp {
    public static void main(String[] args) throws IOException {

        File file = new File("Basic3.txt");
        writeToFile(file, " Test 3 ",0);
        System.out.println(readFromFile(file, 3 ,5));
        writeToFile(file,"4", 7);
        System.out.println(readFromFile(file , 0,10));
    }

    public static void writeToFile(File file,String data, int position) throws IOException {
        RandomAccessFile raf = new RandomAccessFile(file,"rw");
        raf.seek(position);
        raf.write(data.getBytes());
        raf.close();
    }

    public static String readFromFile(File file,int position,int size) throws IOException {
        RandomAccessFile raf = new RandomAccessFile(file,"rw");
        raf.seek(position);
        byte[] array = new byte[size];
        raf.read(array);
        raf.close();
        StringBuilder sb = new StringBuilder();
        for (byte b : array ) {
            sb.append((char)b);
        }
        return sb.toString();
    }
}
