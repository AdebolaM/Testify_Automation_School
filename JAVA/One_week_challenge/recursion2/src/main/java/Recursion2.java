public class Recursion2 {
    public static void main(String[] args) {
        String input = "TestifyAutomation";
        String reversed = reverseString(input);
        System.out.println("Reversed string: " + reversed);
    }

    public static String reverseString(String str) {
        // Base case: if the string is empty or has only one character, return the string itself
        if (str.isEmpty() || str.length() == 1) {
            return str;
        } else {
            // Recursive call: reverse the substring excluding the first character, and concatenate the first character at the end
            return reverseString(str.substring(1)) + str.charAt(0);
        }
    }
}

