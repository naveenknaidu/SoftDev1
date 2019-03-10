package Lab5;

import java.util.Scanner;

/**
 * Created by: Naveen Krishna
 * Created on: 06/03/2019
 * This program displays the adds the numbers using the for loop
 */

public class AddNumbers {
    public static void main(String[] args){
        int howmany = 5;
        int number, total = 0;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter your number: ");
        number = keyboard.nextInt();
        for (int i=0; i<=howmany; i++){
            total = total+number;
            System.out.print("\t" + total);
        }//for
        System.out.println("\nThe total of the number is: " + total);
    }//main
}//class
