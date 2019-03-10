package Lab4;

import java.util.Scanner;

/**
 * Created by: Naveen Krishna
 * Created on: 02/03/2019
 * This program compares the user guess number with system number
 */

public class GuessNumber {
    public static void main(String[] args){
        final double systemnumber = 25;
        double mynumber;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter your number: ");
        mynumber = keyboard.nextDouble();
        if (mynumber==systemnumber){
            System.out.println("Your number is correct guess number");
        }//if
        else
            System.out.println("You have guessed wrong number");
    }//main
}//class
