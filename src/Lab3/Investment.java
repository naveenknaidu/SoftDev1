package Lab3;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by: Naveen Krishna
 * Created on:28/02/2019
 * This programs displays the investment made and interest calculated for the interest
 */

public class Investment {
    public static void main(String[] args){
        double investment, totalinvestment, noofyears, totalinterest;
        final double interest = 0.05;
        Scanner keyboard = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("00.00");
        System.out.println("Please enter how much investment you would like to make: ");
        investment = keyboard.nextDouble();
        System.out.println("Please enter number of years you would like to make investment: ");
        noofyears = keyboard.nextDouble();
        totalinterest = investment*interest;
        totalinvestment = (totalinterest*noofyears)+investment;
        System.out.println("The total investment you have made is: " + df.format(investment));
        System.out.println("The interest per annum is: " + interest);
        System.out.println("The total number of years you made is: " + df.format(noofyears) + " Years");
        System.out.println("The total interest calculated by the end of term is: " + df.format(totalinterest));
        System.out.println("The total you will get by the term end is: " + df.format(totalinvestment));

    }//main
}//class
