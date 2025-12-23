package org.example.two.file;

import org.example.two.exception.TextFileNotFoundException;

public class ThrowDemo {
    public static void main(String[] args) {
        TxtFileReader citac = new TxtFileReader();

        try{
            citac.readFile("data.txt");
        }catch(TextFileNotFoundException e){
            System.err.println("GRESKA: %s".formatted(e.getMessage()));
        }
    }
}
