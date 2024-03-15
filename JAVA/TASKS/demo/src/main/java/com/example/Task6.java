package com.example;



public class Task6 {
    
    public static void main(String[] args) {

//Write a code to reverse the string DEMOCRACY and get the word COME out of it.
String Word = "deMOCRACY";
// upper and lowercase
System.out.println(Word.toUpperCase());
System.out.println(Word.toLowerCase());

// lenght 
System.out.println(Word.length());

//index
System.out.println(Word.indexOf("O"));

//char of a particular index
System.out.println(Word.charAt(5));

//Cut out a word from the string (Front)
System.out.println(Word.substring(0, 4));

// cut out word from string (back)
System.out.println(Word.subSequence(0, 5));
//Reverse the Word Democracy
StringBuilder newstring = new StringBuilder(Word);
var Reverseword = newstring.reverse();
System.out.println(Reverseword);


//bring out the word come 
var NewWord = Reverseword.substring(4,8);

System.out.println(NewWord.toLowerCase());


    }

}
