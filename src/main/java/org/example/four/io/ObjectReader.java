package org.example.four.io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

 class ObjectReader implements Reader{
    @Override
    public String read(String path) throws ReaderException {

        try(ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(path));){
            Object readedObject = objectInputStream.readObject();
            return readedObject.toString();
        }catch (Exception e){
            throw new ReaderException(e.getMessage());
        }
    }
}
