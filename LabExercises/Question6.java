/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LabExercises;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Question6 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
          System.out.print("Input First Number: ");
	  int a = sc.nextInt();
          System.out.print("Input Second Number: ");
	  int b = sc.nextInt();
          
          int sum1 = a + b;
          int sum2 = a - b;
          int sum3 = a * b;
          int sum4 = a / b;
          int sum5 = a % b;
          
           System.out.println(a + " + " + b + " = " + sum1);
           System.out.println(a + " - " + b + " = " + sum2);
           System.out.println(a + " * " + b + " = " + sum3);
           System.out.println(a + " / " + b + " = " + sum4);
           System.out.println(a + " % " + b + " = " + sum5);
    }
}
