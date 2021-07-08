package ua.lviv.lgs.lesson21.homework;

import ua.lviv.lgs.lesson21.lecture.Fielder;
import ua.lviv.lgs.lesson21.lecture.UserSocial;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.lang.reflect.Field;

public class Order {
    public static void main(String[] args) {
        PrintStream output = null;
        try {
            output = new PrintStream(new File("A.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        //setting output from System.out to printstream
        System.setOut(output);
        getAnnotatedValues(Kozak.class);
    }

    public static void getAnnotatedValues(Class<?> customClass) {
        Field[] fields = customClass.getDeclaredFields();
        for (int i = 0; i < fields.length; i++) {
            Field field = fields[i];
            if (field.getAnnotation(Attack.class) instanceof Attack) {
                System.out.println(field.getName() +" "+ field.getType());
                System.out.println("Annotation value choice = " + field.getAnnotation(Attack.class).choice());
                System.out.println("Annotation value power= " + field.getAnnotation(Attack.class).power()+"\n");
            }
        }
    }
}
