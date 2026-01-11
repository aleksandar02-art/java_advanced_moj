package org.example.four;

import org.example.four.io.Reader;
import org.example.four.io.ReaderException;
import org.example.four.io.ReaderFactory;
import org.example.four.io.ReaderType;

public class ConsumerDemo {
    public static void main(String[] args) {

        Reader reader = ReaderFactory.createReader(ReaderType.LINE);
        try {
            String fileContent = reader.read("data.txt");
            System.out.println(fileContent);
        } catch (ReaderException e) {
            System.err.println(e.getMessage());
        }
    }
}
