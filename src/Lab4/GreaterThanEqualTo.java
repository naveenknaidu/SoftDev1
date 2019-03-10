package Lab4;

import java.util.Scanner;

/**
 * Created by: Naveen Krishna
 * Created on: 02/03/2019
 * This program displays the user number and compares to zero
 */

public class GreaterThanEqualTo {
    public static void main(String[] args) {
        final int number = 0;
        int mynumber;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please enter your number: ");
        mynumber = keyboard.nextInt();
        if (mynumber > number) {
            System.out.println("Your number " + mynumber + " is greater than " + number);
        }//if
        else {
            if (mynumber == number) {
                System.out.println("Your number " + mynumber + " is equal to " + number);
            }//if
        }//else
        System.out.println("Your number " + mynumber + " is less than " + number);

    }//main
}//class
