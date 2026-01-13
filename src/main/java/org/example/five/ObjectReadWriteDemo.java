package org.example.five;

import org.example.four.io.reader.*;
import org.example.four.io.writer.ObjectWriter;
import org.example.four.io.writer.WriterException;
import org.example.one.human.Person;

import java.time.LocalDate;

public class ObjectReadWriteDemo {
    public static void main(String[] args) throws ReaderException {
        Person person = new Person("Milica", "Ivan Rajic", LocalDate.now());
        ObjectWriter objectWriter = new ObjectWriter();
        try {
            objectWriter.write("persona.ser",person);
        } catch (WriterException e) {
            System.err.println(e.getMessage());
        }
        ObjectReader objectReader = new ObjectReader();
        Person readedPerson = (Person) objectReader.read("persona.ser", 23);
        System.out.println(readedPerson.getSurname());
    }
}
