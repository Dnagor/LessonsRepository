package ua.lviv.lgs.lesson19.lecture;

import java.io.*;

public class ApplicationSerialization  {
    public static void main(String[] args) throws Exception {
        File file = new File("ObjectSerialization.txt");
        Person p = new Person("Ben", "Hulk", 20);
        writeObject(file,p);
        Person p2 = (Person) readObject(file);
        System.out.println(p2);
    }
    public static void writeObject(File file, Serializable object) throws IOException {
        OutputStream os= new FileOutputStream(file);
        ObjectOutputStream oos = new ObjectOutputStream(os);
        oos.writeObject(object);
        oos.close();
        os.close();
    }
    public static Serializable readObject(File file) throws IOException, ClassNotFoundException {
        InputStream is = new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(is);
        Serializable o = (Serializable) ois.readObject();
        ois.close();
        is.close();
        return o;
    }
}
