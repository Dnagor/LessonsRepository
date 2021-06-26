package ua.lviv.lgs.lesson19.homework;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Serializer {
    public static void main(String[] args) {
        Employee employee = new Employee("Sam", "Ostapenko", 30, 45000);
        File file = new File("Employee.txt");
        Serializatorable serializatorable = new Methods();
        try {
            serializatorable.serialize(file, employee);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            System.out.println(serializatorable.deserialize(file));
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        List<Employee> employeeList = new ArrayList<Employee>();
        employeeList.add(new Employee("Sam", "Ostapenko", 30, 45000));
        employeeList.add(new Employee("Britney", "Spears", 40, 400000));
        employeeList.add(new Employee("Jack", "Sparrow", 45, 545000));
        employeeList.add(new Employee("Iron", "Man", 50, 1000000));
        employeeList.add(new Employee("Incredible", "Hulk", 50, 77000));
        File file1 = new File("EmployeeList.txt");

        try {
            OutputStream os = new FileOutputStream(file1);
            ObjectOutputStream oos = new ObjectOutputStream(os);
            oos.writeObject(employeeList);
            oos.close();
            os.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            InputStream inputStream = new FileInputStream(file1);
            ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
            Serializable serializable = (Serializable) objectInputStream.readObject();
            objectInputStream.close();
            inputStream.close();
            System.out.println(serializable);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
