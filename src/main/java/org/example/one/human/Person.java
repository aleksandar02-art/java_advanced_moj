package org.example.one.human;

import org.example.one.animal.Animal;

import java.io.Serializable;
import java.time.LocalDate;

public class Person implements Serializable {
    private String name;
    private String surname;
    //TESNA VEZA -> losa veza
//    private Bird bird;
    //SLABE VEZE - konkretna klasa ili abstract klasa ?
    //apstraktna klasa -> KOMPOZICIJA je zavisnost od apstraktne klase = SLABA VEZA(dobro)
    private Animal animal;
    private LocalDate localDate;

    public Person(String name,String surname,LocalDate localDate){
        this.name = name;
        this.surname = surname;
        this.localDate = localDate;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
}
