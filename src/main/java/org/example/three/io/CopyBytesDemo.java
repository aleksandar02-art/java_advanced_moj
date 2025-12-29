package org.example.three.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Citanje fajla: FileInputStream
 * Pisanje u fajl: FileOutputStream
 *
 * <p>
 *     Exception <- IOExceptin <- FileNotFoundException
 * </p>
 */
public class CopyBytesDemo {
    public static void main(String[] args) {

        try (FileInputStream inputStream = new FileInputStream("data.txt");
             FileOutputStream outputStream = new FileOutputStream("output.txt")) {
            int c;
            while((c =inputStream.read()) != -1){
        //        System.out.print((char) c);
                outputStream.write(c);
            }
        }catch (IOException fileNotFoundException){
            System.err.println(fileNotFoundException.getMessage());
        }

    }
}
