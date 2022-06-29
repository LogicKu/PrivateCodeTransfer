package exceptionHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InvalidClassException;

public class ThrowEg {
    public static void findFile() throws IOException,InvalidClassException{
        File newFile = new File("test.txt");
        FileInputStream stream = new FileInputStream(newFile);
        File newFile2 = new File("test.txt");
    }

    public static void main(String[] args) {

        try {
            findFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    }
