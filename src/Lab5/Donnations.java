package Lab5;

import java.util.Scanner;

/**
 * Created by: Naveen Krishna
 * Created on: 09/03/2019
 * This program prints the number of donations, largest donnation and largest amount
 */

public class Donnations {
    public static void main(String[] args) {
        final int raise = 500;
        int count = 0;
        String name;
        double donnations, largestdonation=0, total = 0.00;
        Scanner keyboard = new Scanner(System.in);
        Scanner yourname = new Scanner(System.in);
        do {
            System.out.println("Please enter you donnation: ");
            donnations = keyboard.nextDouble();
            count = count + 1;
            total = total + donnations;
            System.out.println("The number of donations recieved " + count);
            if (donnations > largestdonation) {
                largestdonation = donnations;
                System.out.println("Please enter your name: ");
                name = yourname.nextLine();
                System.out.println(name + " has donated largest donation");
                System.out.println("The value of the largest donation is " + largestdonation);

            }//if
        } while (donnations != raise);
    }
}
