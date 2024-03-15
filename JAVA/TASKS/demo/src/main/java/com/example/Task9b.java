package com.example;

import java.util.Scanner;

public class Task9b {
    public static void main(String[] args){
//Write a logic that takes in input from the user. It keeps printing "try again "until the user enters "testify"
  Scanner scanner = new Scanner(System.in);
        
        String input;
        do {
            System.out.print("Enter your input: ");
            input = scanner.nextLine();
            if (!input.equals("testify")) {
                System.out.println("try again");
            }
        } while (!input.equals("testify"));
        
        System.out.println("Jackpot!!!!");
        
        scanner.close();
    }
}
