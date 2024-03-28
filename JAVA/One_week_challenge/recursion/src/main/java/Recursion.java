public class Recursion {
    
        public static void main(String[] args) {
            String sentence = "I am the best AutomationTester";
            String reversedSentence = reverseWords(sentence);
            System.out.println(reversedSentence);
        }
    
        public static String reverseWords(String sentence) {
            // Base case: if the sentence is empty or contains only one word
            if (sentence == null || sentence.isEmpty() || !sentence.contains(" ")) {
                return sentence;
            } else {
                // Find the index of the first space
                
                int spaceIndex = sentence.indexOf(" ");
                // Extract the first word
                String firstWord = sentence.substring(0, spaceIndex);
                // Extract the remaining sentence
                String remainingSentence = sentence.substring(spaceIndex + 1);
                // Recursively reverse the remaining sentence
                String reversedRemaining = reverseWords(remainingSentence);
                // Concatenate the reversed remaining sentence with the first word
                return reversedRemaining + " " + firstWord;
            }
        }
    
    
}
