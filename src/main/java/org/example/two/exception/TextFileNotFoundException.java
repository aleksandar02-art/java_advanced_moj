package org.example.two.exception;

import java.io.FileNotFoundException;

public class TextFileNotFoundException extends FileNotFoundException {

    public TextFileNotFoundException(String message){
        super("TEXT:%s".formatted(message));
        System.out.println("Nedostaje tekstualni fajl");
    }
}
