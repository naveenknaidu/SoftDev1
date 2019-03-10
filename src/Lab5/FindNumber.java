package Lab5;

import java.util.Scanner;

/**
 * Created by: Naveen Krishna
 * Created on: 09/03/2019
 * This program reads the user entered number until the user enters right number
 */


public class FindNumber {
    public static void main(String[] args) {
        int enternumber;
        final int constant = -999;
        Scanner keyboard = new Scanner(System.in);
        do {
            System.out.println("Please enter your number: ");
            enternumber = keyboard.nextInt();
            if (enternumber == constant) {
                System.out.println("You have entered right number");
            }//if
            else
                System.out.println("You have entered wrong number: " + enternumber);
        } while (enternumber != constant);

    }//main
}//class
