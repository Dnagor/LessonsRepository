package ua.lviv.lgs.lesson16.homework;

import java.lang.reflect.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Class doorClass = Door.class;
        System.out.println(".getName() = " + doorClass.getName());
        System.out.println(".getSimpleName() = " + doorClass.getSimpleName());
        int modifiers = doorClass.getModifiers();
        System.out.println("Modifier.toString(modifiers) = " + Modifier.toString(modifiers));
        System.out.println("Modifier.isPrivate(modifiers) = " + Modifier.isPublic(modifiers));
        System.out.println(".getClasses() = " + Arrays.toString(doorClass.getClasses()));
        System.out.println(".getClass() = " + doorClass.getClass());
        System.out.println(".getSuperclass() = " + doorClass.getSuperclass());
        System.out.println(".getPackage() = " + doorClass.getPackage());
        System.out.println(".getInterfaces() = " + Arrays.toString(doorClass.getInterfaces()));

        Constructor[] constructors = doorClass.getConstructors();
        for (Constructor c : constructors) {
            System.out.println("Constructor: " + c);
        }
        System.out.println("constructors.length = " + constructors.length);
        //see all constructors
        for (Constructor constr : constructors) {
            Class[] parameterTypes = constr.getParameterTypes();
            System.out.println("Constructor:");
            for (Class clas : parameterTypes) {
                System.out.println(clas);
            }
        }
        Constructor<Door> doorConstructor = null;
        try {
            doorConstructor = doorClass.getConstructor(String.class, double.class);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        System.out.println("doorConstructor = " + doorConstructor);

        //create object with constructor
        Door door = null;
        try {
            door = doorConstructor.newInstance("Minimal", 1.80);
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        System.out.println(door);

        //get all fields
        Field[] declaredFields = doorClass.getDeclaredFields();
        for (Field field : declaredFields) {
            System.out.println("field of class: " + field.getName());
        }
        //set parameters to created object

        for (Field field : declaredFields) {
            if( field.getName().equalsIgnoreCase("color")){
                System.out.println("Setting of color value:");
                field.setAccessible(true);
                try {
                    field.set(door,"brown");
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
        System.out.println(door+"\n");

        //call method
        Method[] methods = doorClass.getMethods();
        for (Method m : methods) {
            if (m.getName().equalsIgnoreCase("printMyMessage")){
                try {
                    m.invoke(door, "---> String parameter from main method.");
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (InvocationTargetException e) {
                    e.printStackTrace();
                }
            }
        }
        for (Method m : methods) {
            if (m.getName().equalsIgnoreCase("printManyParameters")){
                try {
                    m.invoke(door,"----> Parameters from main - S ", 23);
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (InvocationTargetException e) {
                    e.printStackTrace();
                }
            }

        }
    }
}
