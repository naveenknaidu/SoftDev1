package Lab3;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by: Naveen Krishna
 * Created on: 27/02/2019
 * This programs reads cost of item sold and prints amount tendered and change due to customer
 */

public class Change {
    public static void main(String[] args){
        double costofitem, amounttendered, changedue;
        Scanner keyboard = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("00.00");
        System.out.println("Please enter cost of the item: ");
        costofitem = keyboard.nextDouble();
        System.out.println("Please enter amount tendered by customer: ");
        amounttendered = keyboard.nextDouble();
        changedue = amounttendered-costofitem;
        System.out.println("The cost of the item sold to customer is: " + df.format(costofitem));
        System.out.println("The amount tendered by the customer: " + df.format(amounttendered));
        System.out.println("The change due to the customer is: " + df.format(changedue));

    }//main
}//class
