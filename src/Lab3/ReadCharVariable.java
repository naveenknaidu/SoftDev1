package Lab3;

import jdk.internal.util.xml.impl.Input;

import java.util.Scanner;

/**
 * Created by: Naveen Krishna
 * Created on: 26/02/2019
 * This program prints characters on the console what user enters the from the keyboard
 */

public class ReadCharVariable {
    public static void main(String[] args) {
        char character;
        String letter;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter your character in the form of string: ");
        letter = keyboard.nextLine();
        character = letter.charAt(0);
        System.out.println("The character you have entered in the form of string is: " + character);
    }//main
}//class
