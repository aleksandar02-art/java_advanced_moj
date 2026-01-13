package org.example.four.io.reader;

import java.io.FileReader;
import java.io.IOException;

 class CharacterReader implements Reader{
    @Override
    public String read(String path) throws ReaderException {
        try( FileReader fileReader = new FileReader(path);) {
            StringBuilder sb = new StringBuilder();
            int c;
            while((c = fileReader.read()) != -1){
                sb.append((char) c);
            }
            return sb.toString();
        }catch (IOException e){
            throw new ReaderException(e.getMessage());
        }


    }
}
