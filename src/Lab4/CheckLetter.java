package Lab4;

import java.util.Scanner;

/**
 * Created by: Naveen Krishna
 * Created on: 04/03/2019
 * This program checks the character what user enters whether it is
 */

public class CheckLetter {
    public static void main(String[] args) {
        char letter;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter a character: ");
        letter = keyboard.nextLine().charAt(0);

        if (letter == 'g') {
            System.out.println("The character you have entered " + letter + " is a lowercase");
        }//if
        else
            System.out.println("The character you have entered " + letter + " is not lower case");
    }//main
}//class
