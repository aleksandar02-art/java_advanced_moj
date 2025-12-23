package org.example.three.collection;

import org.example.three.generic.Person;

import java.util.*;

public class CollectionDemo {
    public static void main(String[] args) {
        int[] numbers = new int[3];
        numbers[0] = 23;
        numbers[1] = 24;
        numbers[2] = 25;

        //1. Prost tip
        int number = 23;
        //2.1 person -> SLOZENI SIROVI TIP PODATKA
        Person person = new Person();
        //2.2 nameCollection ->HashSet, Set, Collection
        //listOfNames -> ArrayList, List, SequencedCollection, Collection, Iterable
        List<String> listOfNames = new ArrayList<>();
        listOfNames.add("Stefan");
        listOfNames.add("Emir");
        listOfNames.add("Emir");
        listOfNames.add("Dragan");
//        for (int i = 0; i < listOfNames.size(); i++) {
//            String element = listOfNames.get(i);
//            System.out.println(element);
//        }
//        CustomCollection customCollection = new CustomCollection();
//        for (Person el: customCollection){
//
//        }

        //setOfNames -> HashSet, Set, Collection, Iterable
        Set<String> setOfNames = new HashSet<>();
        setOfNames.add("Stefan");
        setOfNames.add("Emir");
        setOfNames.add("Emir");
        setOfNames.add("Dragan");

        printCollection(listOfNames);
//        for (int i = 0; i < setOfNames.size(); i++) {
//            setOfNames.get(i);
//
//        }
        //ENHANCED FOR LOOP
//        for (String element : setOfNames){
//            System.out.println(element);
//        }

        System.out.println();
        printCollection(setOfNames);

        System.out.println();
        Set<String> setOfNames2 = new LinkedHashSet<>();
        setOfNames2.add("Stefan");
        setOfNames2.add("Emir");
        setOfNames2.add("Emir");
        setOfNames2.add("Dragan");
        printCollection(setOfNames2);

        System.out.println();
        Set<String> treeSet = new TreeSet<>();
        treeSet.add("Stefan");
        treeSet.add("Emir");
        treeSet.add("Emir");
        treeSet.add("Dragan");
        printCollection(treeSet);
    }

    static void printCollection(Iterable<String> stringCollection){
        for (String element : stringCollection){
            System.out.println(element);
        }
    }
}
