package org.example.four.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.Buffer;

 class LineReader implements Reader{
    @Override
    public String read(String path) throws ReaderException {
        try {
            StringBuilder sb = new StringBuilder();
            BufferedReader br = new BufferedReader(new FileReader(path));
            String line;
            while((line = br.readLine()) != null ){
                String lineSeparator = System.lineSeparator();
                sb.append(line).append(System.lineSeparator());
            }
            return sb.toString();
        }catch (IOException exc){
            throw new ReaderException(exc.getMessage());
        }


    }
}
