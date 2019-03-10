package Lab2;

/**
 * Created by: Naveen krishna
 * Created on: 23/02/2019
 * This program will swap numbers which are assigned to variables
 */

public class SwapNumbers {
    public static void main(String[] args) {
        int a = 22;
        int b = 23;
        int c;

        c = b;
        b = a;
        a = c;

        System.out.println(a);
        System.out.println(b);
    }//main
}//class
