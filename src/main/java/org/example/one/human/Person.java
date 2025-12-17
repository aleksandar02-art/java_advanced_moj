package org.example.one.human;

import org.example.one.animal.Animal;

public class Person {
    private String name;
    //TESNA VEZA -> losa veza
//    private Bird bird;
    //SLABE VEZE - konkretna klasa ili abstract klasa ?
    //apstraktna klasa -> KOMPOZICIJA je zavisnost od apstraktne klase = SLABA VEZA(dobro)
    private Animal animal;

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }
}
