package ua.lviv.lgs.lesson19.lecture;

import java.io.IOException;
import java.io.InputStream;

public class Echo {
    public static void main(String[] args) {
        echo(System.in);
    }
    public static void echo(InputStream inputStream){
        try{
            while (true){
                int i = inputStream.read();
                if (i==-1)
                    break;
                char c = (char) i;
                System.out.print(c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println();
    }
}
