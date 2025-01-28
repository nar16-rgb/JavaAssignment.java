# javaAssignment.java
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workhours.and.payment.calculator;

import java.util.*;
 

public class WorkhoursAndPaymentCalculator {

 
    public static double calculateEarnings(int hoursWorked, double hourlyRate) {
        return hoursWorked * hourlyRate;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        double hourlyRate;
        int totalHoursWorked = 0;
        double totalEarnings = 0;

        System.out.println("Welcome to the Work Hours and Payment Calculator!");
        
        
        System.out.print("Enter your hourly rate (Tsh per hour): ");
        hourlyRate = scanner.nextDouble();

        while (true) {
            
            System.out.println("\nMenu:");
            System.out.println("1. Log Hours Worked");
            System.out.println("2. Calculate Total Earnings");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1: 
                    System.out.print("Enter hours worked today: ");
                    int hoursWorked = scanner.nextInt();
                    totalHoursWorked += hoursWorked;
                    System.out.println("Hours logged successfully!");
                    break;

                case 2: 
                    totalEarnings = calculateEarnings(totalHoursWorked, hourlyRate);
                    System.out.println("\n--- Earnings Summary ---");
                    System.out.println("Total Hours Worked: " + totalHoursWorked + " hours");
                    System.out.println("Hourly Rate: Tsh " + hourlyRate + " per hour");
                    System.out.println("Total Earnings: Tsh " + totalEarnings);
                    break;

                case 3: 
                    System.out.println("Exiting the application. Thank you!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        }
    }
}

    
    

