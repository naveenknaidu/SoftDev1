package Lab4;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by: Naveen Krishna
 * Created on: 03/03/2019
 * This program displays the name, hours worked and pay
 */

public class Pay2 {
    public static void main(String[] args){
        final double basicpay = 5.95, overtimepay = 8.50, basichours = 40;
        double hoursworked, pay, overtimehours;
        String name;
        Scanner keyboard = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("00.00");

        System.out.println("Please enter your name: ");
        name = keyboard.nextLine();
        System.out.println(" Please enter hours you have worked: ");
        hoursworked = keyboard.nextDouble();
        if (hoursworked<=basichours){
            pay = hoursworked*basicpay;
        }//if
        else{
           pay = ((basichours*basicpay)+(hoursworked-basichours)*overtimepay);
        }//else
        System.out.println(name + ", " + "you total pay for this week is: €" + df.format(pay));
    }//main
}//class
