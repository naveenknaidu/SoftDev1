package Lab4;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by: Naveen Krishna
 * Created on: 02/03/2019
 * This program calculates the tax based on their gross pay and displays the net income
 */

public class Tax3 {
    public static void main(String[] args) {
        final double hightaxpoint = 0.40;
        final double lowtaxpoint = 0.20;
        double totaltax = 0, grosspay, netpay;
        final double hightaxlevel = 40000.00, lowtaxlevel = 10000.00;
        Scanner keyboard = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("00.00");
        System.out.println("Please enter you gross pay: ");
        grosspay = keyboard.nextDouble();

        if (grosspay >= hightaxlevel) {
            totaltax = ((grosspay - hightaxlevel) * hightaxpoint + (hightaxlevel - lowtaxlevel) * lowtaxpoint);
        }//if
        else {
            if (grosspay >= lowtaxlevel) {
                totaltax = ((grosspay - lowtaxlevel) * lowtaxpoint);
            }//if
        }//else

        netpay = grosspay - totaltax;


        System.out.println("Your gross pay is: " + df.format(grosspay));
        System.out.println("Your tax is: " + df.format(totaltax));
        System.out.println("Your net pay is: " + df.format(netpay));

    }//main
}//class
