package Lab4;

import java.util.Scanner;

/**
 * Created by: Naveen Krishna
 * Created on: 05/03/2019
 * This program year and month and days
 */

public class DaysInMonth1 {
    public static void main(String[] args) {
        int noofdays, months;
        boolean validmonth = true;
        int year;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter year:");
        year = keyboard.nextInt();
        System.out.println("Please enter a month:");
        months = keyboard.nextInt();

        switch (months) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                noofdays = 31;
                System.out.println("There are " + noofdays + " days in the month " + months + ", " + year);
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                noofdays = 30;
                System.out.println("There are " + noofdays + " days in the month " + months + ", " + year);
                break;
            case 2:
                if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
                    noofdays = 29;
                }//if
                else
                    noofdays = 28;
                System.out.println("There are " + noofdays + " days in the month " + months + ", " + year);
                break;
            default:
                System.out.println("You have entered invalid month");


        }//switch
    }//main

}//class
