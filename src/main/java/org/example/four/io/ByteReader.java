package org.example.four.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

// ByteReader obj = new ByteReader()
// ibj.read();
 class ByteReader implements Reader {
    @Override
    public String read(String path) throws ReaderException {
        try (FileInputStream fis = new FileInputStream(path)){
            StringBuilder stringBuilder = new StringBuilder();
            int b;
            while((b = fis.read()) != -1){
                stringBuilder.append((char) b);
            }
            return stringBuilder.toString();
        } catch (IOException e) {
            throw new ReaderException(e.getMessage());
        }

    }
}
