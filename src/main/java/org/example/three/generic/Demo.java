package org.example.three.generic;

import java.time.LocalDate;

public class Demo {
    public static void main(String[] args) {
        int number = 23;
        Person person = new Person("Stefan","Bantic", LocalDate.now());
        person.setSurname("Bantic Zenino");

        Box<String, Integer> boxObjekat = new Box<>();
        boxObjekat.setElement(23);
        boxObjekat.setField("Text");

        Box<Double, Integer> numberObjekat = new Box<>();
        numberObjekat.setField(23.4);
        numberObjekat.setElement(20);

   //     Box<double, int> treciObjekat = new Box<double, int>();  -->> ne moze jer su prosti parametri

        Box<Double, Integer> treciObjekat = new Box<>();

        Box<Integer, Person> personBoxObjekat = new Box<>();
        personBoxObjekat.setElement(person);
        CustomNumber customNumber = new CustomNumber();
        NumberBox<Float> numberBox = new NumberBox<>();

    }
}