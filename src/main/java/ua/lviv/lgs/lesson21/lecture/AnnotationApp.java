package ua.lviv.lgs.lesson21.lecture;

import java.lang.reflect.Field;

public class AnnotationApp {
    public static void main(String[] args) {
        getAnnotaionValue(Any.class);
        System.out.println("---------------------------");
        getAnnotatedFieldsAndValues(User.class);
        System.out.println("---------------------------");
        getNotAnnotaionValue(Any.class);
    }

    public static void getAnnotaionValue(Class<?> customClass) {
        Field[] fields = customClass.getDeclaredFields();
        for (int i = 0; i < fields.length; i++) {
            Field field = fields[i];
            if (field.getAnnotation(Fielder.class) instanceof Fielder) {
                System.out.println(field.getName());
                System.out.println("Annotation value = " + field.getAnnotation(Fielder.class).params());
            }
        }
    }
    public static void getAnnotatedFieldsAndValues(Class<?> customClass) {
        Field[] fields = customClass.getDeclaredFields();
        for (int i = 0; i < fields.length; i++) {
            Field field = fields[i];
            if (field.getAnnotation(UserSocial.class) instanceof UserSocial) {
                System.out.println(field.getName() +" "+ field.getType());
                System.out.println("Annotation value = " + field.getAnnotation(UserSocial.class).value());
                System.out.println("Annotation type = " + field.getAnnotation(UserSocial.class).annotationType());
            }
        }
    }
    public static void getNotAnnotaionValue(Class<?> customClass) {
        Field[] fields = customClass.getDeclaredFields();
        for (int i = 0; i < fields.length; i++) {
            Field field = fields[i];
            if (!(field.getAnnotation(Fielder.class) instanceof Fielder)) {
                System.out.println(field.getName() +" "+ field.getType());
            }
        }
    }
}
