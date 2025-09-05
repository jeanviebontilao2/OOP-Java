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
public class Question9 {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
          System.out.print("Enter First Number: ");
	  int a = sc.nextInt();
          System.out.print("Enter Second Number: ");
	  int b = sc.nextInt();
          System.out.print("Enter third number: ");
          int c = sc.nextInt();
         
         int average = (a + b + c)/3;
         System.out.println("Average" + " : " + average);
     }
}
