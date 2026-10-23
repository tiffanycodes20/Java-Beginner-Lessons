
package com.mycompany.helloworld;

import java.util.Scanner;

public class HelloWorld {

    public static void main(String[] args) {

        // Create a Scanner to receive keyboard input
        Scanner input = new Scanner(System.in);

        // Student information
        System.out.println("===== STUDENT INFORMATION =====");

        System.out.print("Enter student name: ");
        String studentName = input.nextLine();

        System.out.print("Enter student age: ");
        int age = input.nextInt();
        input.nextLine();

        String course = "Information Technology";
        boolean isEnrolled = true;

        // Report identification
        final String reportId = "STU001";

        // Enter and validate subject marks
        System.out.println("\n===== ENTER SUBJECT MARKS =====");

        double mathMark = readValidMark(input, "Math");
        double javaMark = readValidMark(input, "Java");
        double databaseMark = readValidMark(input, "Database");

        input.nextLine();

        // Calculate average mark
        double averageMark =
                (mathMark + javaMark + databaseMark) / 3.0;

        // Determine performance category
        String performance;

        if (averageMark >= 70) {
            performance = "Excellent";
        } else if (averageMark >= 50) {
            performance = "Good effort";
        } else {
            performance = "Keep practising";
        }

        // Determine pass or fail
        boolean hasPassed;

        if (averageMark >= 50) {
            hasPassed = true;
        } else {
            hasPassed = false;
        }

        // Determine letter grade
        String grade;

        if (averageMark >= 80) {
            grade = "A";
        } else if (averageMark >= 70) {
            grade = "B";
        } else if (averageMark >= 60) {
            grade = "C";
        } else if (averageMark >= 50) {
            grade = "D";
        } else {
            grade = "E";
        }

        // Display student profile
        System.out.println("\n==============================");
        System.out.println("      STUDENT PROFILE");
        System.out.println("==============================");

        System.out.println("Report ID: " + reportId);
        System.out.println("Name: " + studentName);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
        System.out.println("Currently enrolled: " + isEnrolled);

        // Display academic results
        System.out.println("\n==============================");
        System.out.println("      ACADEMIC RESULTS");
        System.out.println("==============================");

        System.out.println("Math mark: " + mathMark);
        System.out.println("Java mark: " + javaMark);
        System.out.println("Database mark: " + databaseMark);
        System.out.printf("Average mark: %.2f%n", averageMark);

        System.out.println("Performance: " + performance);
        System.out.println("Grade: " + grade);

        // Display pass or fail message
        if (hasPassed) {
            System.out.println(
                    "Result: Congratulations! You passed.");
        } else {
            System.out.println(
                    "Result: You did not pass. Keep practising!");
        }

        // Display academic summary
        System.out.println("\n==============================");
        System.out.println("      ACADEMIC SUMMARY");
        System.out.println("==============================");

        System.out.println("Final grade: " + grade);
        System.out.println(
                "Pass status: " + (hasPassed ? "PASS" : "FAIL"));

        System.out.println("==============================");

        // Close the Scanner
        input.close();
    }

    // Reusable method to read and validate a subject mark
    public static double readValidMark(
            Scanner input, String subject) {

        double mark;

        System.out.print(
                "Enter " + subject + " mark (0-100): ");
        mark = input.nextDouble();

        while (mark < 0 || mark > 100) {
            System.out.println(
                    "Invalid mark! Enter a value from 0 to 100.");

            System.out.print(
                    "Enter " + subject + " mark (0-100): ");
            mark = input.nextDouble();
        }

        return mark;
    }
}
