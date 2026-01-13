package org.example.four.io.writer;

import org.example.four.io.reader.ReaderException;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

//java.io.FileOutputStream
class ByteWriter implements Writer {
    @Override
    public void write(String path, String content) throws WriterException {
        try(FileOutputStream fileOutputStream = new FileOutputStream(path);){
            byte[] charArray = content.getBytes();
            fileOutputStream.write(charArray);

        }catch (IOException e){
            System.err.println(e.getMessage());
        }
    }
}
