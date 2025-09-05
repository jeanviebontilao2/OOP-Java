/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datatypes;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Question1 {
    
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.print("Degree in Fahrenheit: ");
         float degree = sc.nextFloat();
         float f1 = (degree-32);
         float f2 = (f1*5);
         float Celsius = (f2/9);
         System.out.println(degree + " degrees Fahrenheit is equal to " + Celsius + " in Celsius");
    }
}
