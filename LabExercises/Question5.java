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
public class Question5 {
    
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.print("Input First Number: ");
	  int a = sc.nextInt();
          System.out.print("Input Second Number: ");
	  int b = sc.nextInt();
                   
          int sum = a * b;
          System.out.println(a + " x " + b + " = " + sum);
    }
}
