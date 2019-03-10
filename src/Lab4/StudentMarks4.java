package Lab4;

import java.util.Scanner;

/**
 * Created by: Naveen Krishna
 * Created on: 05/03/2019
 * This program displays the name of the student and over all marks of a student including the grade which has distinction
 */

public class StudentMarks4 {
    public static void main(String[] args) {
        String name, grade;
        int coursework, examination, overall;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        name = keyboard.nextLine();
        System.out.println("Please enter your course work marks: ");
        coursework = keyboard.nextInt();
        System.out.println("Please enter your examination marks: ");
        examination = keyboard.nextInt();
        overall = (coursework + examination) / 2;

        if (overall >= 70) {
            grade = "Distinction";

        }//if
        else {

            if (((coursework <= 39) || (examination <= 39) || (overall <= 39))) {
                grade = "Fail";
            }//if
            else
                grade = "Pass";
        }//else

        System.out.println("Name \t\t CourseWork \t\t Examination \t\t Overall \t\tGrade");
        System.out.println(name + "  \t\t" + coursework + "\t\t\t\t\t" + examination + "\t\t\t\t\t" + overall + " \t\t\t" + grade);
    }//main
}//class
