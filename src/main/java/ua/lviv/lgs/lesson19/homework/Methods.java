package ua.lviv.lgs.lesson19.homework;

import java.io.*;

public class Methods implements Serializatorable {
    @Override
    public void serialize(File file, Serializable object) throws IOException {
        OutputStream outputStreams = new FileOutputStream(file);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStreams);
        objectOutputStream.writeObject(object);
        objectOutputStream.close();
        outputStreams.close();
    }

    @Override
    public Serializable deserialize(File file) throws IOException, ClassNotFoundException {
        InputStream inputStream = new FileInputStream(file);
        ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
        Serializable serializable = (Serializable) objectInputStream.readObject();
        objectInputStream.close();
        inputStream.close();
        return serializable;
    }
}
