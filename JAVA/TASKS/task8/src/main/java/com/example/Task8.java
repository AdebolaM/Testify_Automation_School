package com.example;

import java.util.Scanner;

public class Task8 {
    /**
     * @param args
     */
    public static void main(String[] args){
        //Build a Simple interest calculator. 
        //Write a program to ask the user for the necessary field you need in calculating the simple interest and 
        //then communicate the simple interest back to the user is a good sentence
        //formuler for SI =rate*amount*time/100


        try (Scanner SIcalculator = new Scanner (System.in)) {
            System.out.println("Welcome, Please input the start amount");
            short Startamount = SIcalculator.nextShort();
            System.out.println("Please now input the lenght of time you'd like to borrow this amount for");
            int time = SIcalculator.nextInt();
            short rate = 5;
            double Interest = (Startamount*time*rate)/100;
            System.out.println("The interest you will pay for this loan is " + Interest);
            System.out.println("Please input 'Yes' to continue");
            SIcalculator.next();
            double Totalamount = Startamount + Interest;
            System.out.println("Your total amount to pay back is " + Totalamount);
        }


    



        
}
}
