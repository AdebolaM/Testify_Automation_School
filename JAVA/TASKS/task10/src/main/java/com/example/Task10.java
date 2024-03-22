package com.example;

import java.util.Scanner;


//Create a method that verify that visitors on the slack channel are coming fot testify Trainings. 
//If they write" Testify" then print out a  welcome messsage if not , the user should be shown rejection message. 
//after creating this method,then invoke the created method in your main method#

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt user for input
        System.out.print("Enter your purpose of visiting this site: ");
        String userInput = scanner.nextLine();
        
        // Invoke the verifyVisitor method with user input
        verifyVisitor(userInput);
        
        scanner.close();
    }
    
    public static void verifyVisitor(String input) {
        if (input.equalsIgnoreCase("Testify")) {
            System.out.println("Welcome to Testify Trainings!");
        } else {
            System.out.println("Sorry, you are not here for Testify Trainings.");
        }
    }
}
