package org.example.data;

import java.nio.file.Path;
import java.util.Vector;

public class CollectionManager {
    private static final Vector<String> vector = new Vector<>();

    public static void add(Path path){
        vector.add(path.toAbsolutePath().toString());
    }

    public static boolean inSet(Path path){
        return vector.contains(path.toAbsolutePath().toString());
    }

    public static void remove(Path path){
        vector.remove(path.toAbsolutePath().toString());
    }
}
