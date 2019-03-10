package Lab5;

import java.util.Scanner;

/**
 * Created by: Naveen Krishna
 * Created on: 09/03/2019
 * This program reads the number and calculates the user entered numbers with math random numbers
 */

public class Dice {
    public static void main(String[] args) {
        int dice1, dice2;
        char response;
        Scanner keyboard = new Scanner(System.in);
        do {
            dice1 = (int) (Math.random() * 6 + 1);
            dice2 = (int) (Math.random() * 6 + 1);
            System.out.println("Your dice numbers are " + dice1 + dice2);
            System.out.println("Do you want to continue Y/N");
            response = keyboard.nextLine().charAt(0);
        } while (response == 'Y');

    }//main
}//class
