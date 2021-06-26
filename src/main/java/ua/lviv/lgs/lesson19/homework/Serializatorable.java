package ua.lviv.lgs.lesson19.homework;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Serializable;

public interface Serializatorable {
    void serialize(File file, Serializable object) throws IOException;
    Serializable deserialize(File file) throws IOException, ClassNotFoundException;
}
