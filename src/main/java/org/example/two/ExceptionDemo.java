package org.example.two;

import org.example.one.animal.Bird;

public class ExceptionDemo {
    public static void main(String[] args) {


        int[] numbers = new int[2];
        numbers[0] = 23;
        numbers[1] = 24;
        try {
            System.out.println(numbers[2]);
            System.out.println(numbers[0]);
        }catch (Exception e){
            System.out.println("Nema dovoljno mesta u nizu");
        }

        Bird bird = null;
        bird.fly();
        System.out.println(bird);
    }
}
