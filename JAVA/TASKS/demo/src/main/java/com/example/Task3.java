package com.example;

public interface Task3 {

    public static void main(String[] args) {

        byte age = 16;
        String statement = "Adebola's age is ";
        String HowOldIsShe =statement + age;

        System.out.println(HowOldIsShe);
        System.out.println(statement.concat(age+""));
        }
    

}