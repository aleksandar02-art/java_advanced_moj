package org.example.two.file;

import org.example.two.exception.TextFileNotFoundException;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TxtFileReader {

    private String fileName;

    public TxtFileReader(){
        this.fileName = fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public void readFile(String filePath) throws TextFileNotFoundException{
        File file = new File(filePath);
        if (!file.exists()){
            throw new TextFileNotFoundException("Fajl na putanji '%s' ne postoji".formatted(filePath));
        }
        System.out.println("Fajl je pronadjen i mozes poceti sa citanjem..");
        try {
            Scanner scanner = new Scanner(file);
            while(scanner.hasNextLine()){
                String line = scanner.nextLine();
                System.out.println(line);
            }
        }catch (FileNotFoundException exception){
            System.err.println(exception.getMessage());
        }
    }


}
