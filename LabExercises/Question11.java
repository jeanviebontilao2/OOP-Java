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
public class Question11 {
     
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.println("Enter Name: ");
         String name = sc.nextLine();
         System.out.println("Enter Date of Birth: ");
         String name1 = sc.nextLine();
         System.out.println("Address: ");
         String name2 = sc.nextLine();
         System.out.println("Age: ");
         String name3 = sc.nextLine();
         System.out.println("Course: ");
         String name4 = sc.nextLine();
         System.out.println("Year Level: ");
         String name5 = sc.nextLine();
         System.out.println("Secondary School Graduated: ");
         String name6 = sc.nextLine();
         System.out.println("Year: ");
         String name7 = sc.nextLine();
         
         System.out.println("==================== PERSONAL INFO ====================");
         System.out.printf("%-20s : %s\n", "NAME:" ,name);
         System.out.printf("%-20s : %s\n", "DATE OF BIRTH:" ,name1);
         System.out.printf("%-20s : %s\n", "ADDRESS:" ,name2);
         System.out.printf("%-20s : %s\n", "AGE:" ,name3);
         System.out.printf("%-20s : %s\n", "COURSE:" ,name4);
         System.out.printf("%-20s : %s\n", "YEAR LEVEL:" ,name5);
         System.out.println("==================== EDUCATIONAL INFO ====================");
         System.out.printf("%-20s : %s\n", "SECONDARY LEVEL:" ,name6);
         System.out.printf("%-20s : %s\n", "YEAR:" ,name7);
         
         
    }
}