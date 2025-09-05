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
public class Question4 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Weight in pounds: ");
        double weight = sc.nextInt();
        System.out.print("Height in inches: ");
        double height = sc.nextInt();
        
        double BMI = weight * 0.45359237 / (height * 0.0254 * height * 0.0254);
        System.out.println("Body Mass Index is " + BMI + "\n");
    }
}
