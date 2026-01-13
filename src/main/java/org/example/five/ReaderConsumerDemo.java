package org.example.five;

import org.example.four.io.reader.Reader;
import org.example.four.io.reader.ReaderException;
import org.example.four.io.reader.ReaderFactory;
import org.example.four.io.reader.ReaderType;

public class ReaderConsumerDemo {
    public static void main(String[] args) {
        ReaderType readerType = ReaderType.LINE;
        Reader lineReader = ReaderFactory.createReader(readerType);
        try {
            String  result = lineReader.read("data.txt");
            System.out.println(result);
        }catch (ReaderException e){
            System.err.println(e.getMessage());
        }
    }
}
