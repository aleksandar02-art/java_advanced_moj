package org.example.one.beverage;

/**
 * Tip varijabla = podaci;
 *
 * Klasom -> dizajniramo vlastit tip podatka
 *
 * Instanciranje objekata
 *
 * Person
 * p1 p2 p3 p4
 * <p>
 *
 * </p>
 */
public abstract class Beverage {
    private String name;

    public Beverage(String name){
        this.name = name;
    }

    public abstract double cost();

    public String getName(){
        return name;
    }
}
