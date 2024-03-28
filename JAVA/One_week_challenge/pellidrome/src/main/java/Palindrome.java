//Write  Java  code  to  check  if  racecar  and  10801  is  apalindromes.

public class Palindrome {
    
        public static void main(String[] args) {
            String word = "racecar";
            String numbers = "10801";
    
            if (isPalindrome(word)) {
                System.out.println("\"" + word + "\" is a palindrome.");
            } else {
                System.out.println("\"" + word + "\" is not a palindrome.");
            }
    
            if (isPalindrome(numbers)) {
                System.out.println("\"" + numbers + "\" is a palindrome.");
            } else {
                System.out.println("\"" + numbers + "\" is not a palindrome.");
            }
        }
    
        // Method to check if a string is a palindrome
        public static boolean isPalindrome(String str) {
            int length = str.length();
            for (int i = 0; i < length / 2; i++) {
                if (str.charAt(i) != str.charAt(length - i - 1)) {
                    return false;
                }
            }
            return true;
        }
    
    
}
