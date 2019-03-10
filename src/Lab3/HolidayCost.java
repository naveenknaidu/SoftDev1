package Lab3;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by: Naveen Krishna
 * Created on: 26/02.2019
 * This program prints holiday cost o n number of travellers and user enters the costs, travellers etc from the
 * keyboard
 */

public class HolidayCost {
    public static void main(String[] args){
        int numberoftravellers;
        double costofflight, totalflightcost, costoftransfer, totaltransfercost, totalcost;
        final double vatrate = 0.2;
        DecimalFormat df = new DecimalFormat("00.00");

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter number of travellers: ");
        numberoftravellers = keyboard.nextInt();
        System.out.println("Please enter cost of flight: ");
        costofflight = keyboard.nextDouble();
        totalflightcost = numberoftravellers*costofflight*(1+vatrate);
        System.out.println("Please enter cost of transfer: ");
        costoftransfer = keyboard.nextDouble();
        totaltransfercost = numberoftravellers*costoftransfer*(1+vatrate);
        totalcost = totalflightcost+totaltransfercost;
        System.out.println("Total flight cost for travellers is: " + df.format(totalflightcost));
        System.out.println("Total transfer cost for travellers is: " + df.format(totaltransfercost));
        System.out.println("Total Holiday cost is: " + df.format(totalcost));


    }//main
}//class
