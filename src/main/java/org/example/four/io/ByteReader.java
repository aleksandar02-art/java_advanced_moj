package org.example.four.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

// ByteReader obj = new ByteReader()
// ibj.read();
public class ByteReader implements Reader {
    @Override
    public String read(String path) throws ReaderException {
        try (FileInputStream fis = new FileInputStream(path)){
            StringBuilder stringBuilder = new StringBuilder();

            return "";
        } catch (IOException e) {
            throw new ReaderException(e.getMessage());
        }

    }
}
