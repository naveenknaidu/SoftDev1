package Lab5;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by: Naveen Krishna
 * Created on: 09/03/2019
 * This program prints the average of the numbers
 */

public class Average {
    public static void main(String[] args){
        int noofnumbers,value;
        double  total = 0, averagevalue;
        Scanner keyboard = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("00.00");
        System.out.println("Please let us know how many numbers you are going enter: ");
        noofnumbers = keyboard.nextInt();
        for (int count = 0; count<noofnumbers; count++){
            System.out.println("Please enter a number: ");
            value = keyboard.nextInt();
            total = total+value;
        }//for
        averagevalue = total/noofnumbers;
        System.out.println("The average of the numbers entered are " + df.format(averagevalue));
    }//main
}//class
