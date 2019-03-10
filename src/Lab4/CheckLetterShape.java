package Lab4;

import java.util.Scanner;

/**
 * Created by: Naveen Krishna
 * Created on: 04/03/2019
 * This program checks the character what user enters
 */

public class CheckLetterShape {
    public static void main(String[] args) {
        char letter;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter your caharcter: ");
        letter = keyboard.nextLine().charAt(0);

        switch (letter) {
            case 'A':
            case 'E':
            case 'F':
            case 'H':
            case 'I':
            case 'K':
            case 'L':
            case 'M':
            case 'N':
            case 'T':
            case 'V':
            case 'W':
            case 'X':
            case 'Y':
            case 'Z':
                System.out.println("You have entered a straight letter");
                break;
            case 'C':
            case 'O':
            case 'S':
                System.out.println("You have entered a curved character");
                break;
            case 'B':
            case 'D':
            case 'G':
            case 'J':
            case 'P':
            case 'Q':
            case 'R':
            case 'U':
                System.out.println("You have entered mixture letter");
                break;
            default:
                System.out.println("You have entered not an upper case letter");
                break;
        }//switch
    }//main
}//class
