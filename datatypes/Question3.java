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
public class Question3 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number of minutes: ");
        double minutes = sc.nextDouble();
        
        double minutesInYear = 60 * 24 * 365;
        long years = (long) (minutes / minutesInYear);
        int days = (int) (minutes / 60 / 24) % 365;
        
        System.out.println((int) minutes + " minutes is approximately " + years + " years and " + days + " days");
        
    }
}
