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
public class Question5 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Distance in meters: ");
        double meters = sc.nextDouble();
        System.out.print("Hour: ");
        int hours = sc.nextInt();
        System.out.print("Minutes: ");
        int minutes = sc.nextInt();
        System.out.print("Seconds: ");
        int seconds = sc.nextInt();
        
        double totalTimeInSeconds = hours * 3600 + minutes * 60 + seconds;
        double speedInMetersPerSecond = meters / totalTimeInSeconds;
        double speedInKmPerHour = speedInMetersPerSecond * 3.6;
        double speedInMilesPerHour = speedInMetersPerSecond * 2.23694;
        
        System.out.printf("Your speed in meters/second is %.8f%n", speedInMetersPerSecond);
        System.out.printf("Your speed in km/h is %.8f%n", speedInKmPerHour);
        System.out.printf("Your speed in miles/h is %.8f%n", speedInMilesPerHour);
    }
}
