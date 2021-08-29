package com.bridgelabz.line.comparision;

import java.util.Objects;
import java.util.Scanner;

public class Line_Comparision {
    public static void main(String[] args) {
        System.out.println("Welcome to line Comparision Computation Program");

        Scanner line = new Scanner(System.in);

        System.out.println("Enter the Value of x Co-ordinate 1st point: ");
        int x1 = line.nextInt();
        System.out.println("Enter the Value of y Co-ordinate  1nd point: ");
        int y1 = line.nextInt();
        System.out.println("Enter the Value of x Co-ordinate 2nd point: ");
        int x2 = line.nextInt();
        System.out.println("Enter the Value of y Co-ordinate 2nd point: ");
        int y2 = line.nextInt();

        System.out.println("Enter the Value of x Co-ordinate 3rd point: ");
        int a1 = line.nextInt();
        System.out.println("Enter the Value of y Co-ordinate 3rd point: ");
        int b1 = line.nextInt();
        System.out.println("Enter the Value of x Co-ordinate 4th point: ");
        int a2 = line.nextInt();
        System.out.println("Enter the Value of y Co-ordinate 4th point: ");
        int b2 = line.nextInt();

        double length_of_line1 =Math.sqrt((x2 - x1) *(x2 - x1) + (y2 - y1) * (y2 - y1));
        System.out.println("length_of_line1 = " + length_of_line1);

        double length_of_line2 =Math.sqrt((a2 - a1) *(a2 - a1) + (b2 - b1) * (b2 - b1));
        System.out.println("length_of_line2 = " + length_of_line2);

        boolean ans = Objects.equals(length_of_line1, length_of_line2);
        if (ans)
            System.out.println("Both line are equal");

        else
            System.out.println("Both line are not equal");
    }
}