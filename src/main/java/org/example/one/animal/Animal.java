package org.example.one.animal;

/**
 * Sustina postojanja klase:
 * <p>
 *     definiranje sablona za objekat
 * </p>
 *
 * Sustina postojanja abstract klase keste da se nametne sablon ponasanja svim klasama
 * koje su animalnog tipa
 */
public abstract class Animal {
    private String name;

    public Animal(String name){
        this.name = name;
    }

    public abstract void playSound();



    public String getName(){
        return name;
    }
}
