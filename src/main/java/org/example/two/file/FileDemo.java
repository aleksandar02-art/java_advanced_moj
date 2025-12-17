package org.example.two.file;

import org.example.two.exception.TextFileNotFoundException;

import javax.swing.*;
import java.util.Scanner;

public class FileDemo {

    public static void main(String[] args) {
        System.out.println("Unesite ime fajla");
        Scanner consoleScanner = new Scanner(System.in);
        String filePath = consoleScanner.nextLine();
        TxtFileReader txtFileReader = new TxtFileReader();

        try {
            txtFileReader.readFile(filePath);
        }catch (TextFileNotFoundException e){
            //System.err.println(e.getMessage()); //->moze i ovako
            JOptionPane.showMessageDialog(null,e.getMessage()); //->staticna f-ja
        }
        System.out.println("Program zavrsio");
    }

}
