package Lab5;

import java.util.Scanner;

/**
 * Created by: Naveen Krishna
 * Created on: 09/03/2019
 * This program reads the start number, end number and divisor and displays the total
 */

public class Divisor {
    public static void main(String[] args){
        int startnumber, finishnumber, divisor, total = 0;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter start number: ");
        startnumber = keyboard.nextInt();
        System.out.println("Please enter finish number: " );
        finishnumber = keyboard.nextInt();
        System.out.println("Please enter divisor: ");
        divisor = keyboard.nextInt();
        for (int count = startnumber; count<=finishnumber; count++){
            if(count%divisor==0){
                total = total+count;
                System.out.println(total);
                System.out.println(count);

            }//if
        }//for

    }//main
}//class
