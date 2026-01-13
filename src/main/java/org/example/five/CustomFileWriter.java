package org.example.five;

import java.io.FileWriter;
import java.io.IOException;

public class CustomFileWriter {

    public void writeToFile(String filePath, String fileContent){
        try(FileWriter fileWriter = new FileWriter(filePath)){
            fileWriter.write(fileContent);
        }catch (IOException e){
            System.err.println(e.getMessage());
        }
    }
}
