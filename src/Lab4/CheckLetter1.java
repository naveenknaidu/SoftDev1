package Lab4;

import java.util.Scanner;

/**
 * Created by: Naveen Krishna
 * Created on: 04/03/2019
 * This program checks the character what user enters whether it is lowercase and between a to z
 */

public class CheckLetter1 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        char letter;
        System.out.println("Please enter a character: ");
        letter = keyboard.nextLine().charAt(0);

        if (letter >= 'a' && letter <= 'a') {
            System.out.println("You have entered '" + letter + "' is a lower case");
        }//if
        else
            System.out.println("You have entered '" + letter + "' is uppercase");
    }//main

}//class
