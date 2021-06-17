package ua.lviv.lgs.lesson16.lecture;

import java.lang.reflect.*;
import java.util.Arrays;

public class App {

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {


        Class personClass = Person.class;
        // get name of class
        System.out.println("Class name: " + personClass.getName());
        System.out.println("SimpleClass name: " + personClass.getSimpleName());

        // get modifiers
        System.out.println(".getModifiers() =" + personClass.getModifiers());
        System.out.println("Modifier.toString(personClass.getModifiers()) =" + Modifier.toString(personClass.getModifiers()));
        System.out.println("Modifier.isAbstract(personClass.getModifiers()) =" + Modifier.isAbstract(personClass.getModifiers()));
        System.out.println(".getClass() =" + personClass.getClass());
        System.out.println(".getClasses() =" + personClass.getClasses());
        System.out.println(".getPackage() = " + personClass.getPackage());

        //get superClasses
        System.out.println(".getSuperclass() =" + personClass.getSuperclass());
        //get interfaces
        System.out.println("Returns ARRAY of Class  .getInterfaces() =" + Arrays.toString(personClass.getInterfaces()));
        //get constructor
        Constructor<Person>[] constructor = personClass.getConstructors();
        for (Constructor<Person> constr : constructor) {
            System.out.println(constr);
        }
        System.out.println("constructor.length = " + constructor.length);


        //get param types of constructor
        Constructor<Person> firstConstructor = constructor[1];
        Class<?>[] parameterTypes = firstConstructor.getParameterTypes();
        for (Class<?> param : parameterTypes) {
            System.out.println(param);
        }

        //get constructor by param
        Constructor<Person> singleConstructor = null;
        try {
            singleConstructor = personClass.getConstructor(String.class, int.class);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        System.out.println("singleConstructor =" + singleConstructor);

        //create person with constructor
        Person newPerson = null;
        try {
            newPerson = singleConstructor.newInstance("Peter", 23);
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        System.out.println(newPerson);

        //get public fields
        Field[] fields = personClass.getFields();
        for (Field f : fields) {
            System.out.println("field of class = " + f);
        }
        //get all fields
        fields = personClass.getDeclaredFields();
        for (Field f : fields) {
            System.out.println("field of class = " + f);
        }
        //set parameters to field
        Field field = null;
        try {
            field = personClass.getField("age");
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
        try {
            field.set(newPerson,100);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        System.out.println(newPerson);

        //get private fields
        Field lastNameField =  fields[2];                       //personClass.getField("lastName"); ---- буде помилка
        lastNameField.setAccessible(true);                  //Дозволяє відкрити доступ до private fields
        System.out.println(lastNameField.get(newPerson));
        //get methods
        Method[] methods = personClass.getMethods();
        for (Method m :methods) {
            System.out.println("method: "+ m);

        }
        //change data in object using objects methods - не працює , бо методи кожен раз появляються в маасиві під іншим індексом
//        try {
//            methods[4].invoke(newPerson,59.3);
//        } catch (InvocationTargetException e) {
//            e.printStackTrace();
//        }

        for (Method m :methods) {
            if (m.getName().equalsIgnoreCase("setWeight")){
                try{
                    m.invoke(newPerson,59.3);
                }catch (InvocationTargetException e) {
                    e.printStackTrace();
                }
            }
        }
        System.out.println(newPerson);
    }
}
