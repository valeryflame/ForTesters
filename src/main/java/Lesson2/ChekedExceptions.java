package Lesson2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class ChekedExceptions {
    public static void main(String[] args) throws FileNotFoundException {
        InputStream inputStream = new FileInputStream("name");

//        try {
//            InputStream inputStream = new FileInputStream("name");
//        }
//        catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        }
    }
}
