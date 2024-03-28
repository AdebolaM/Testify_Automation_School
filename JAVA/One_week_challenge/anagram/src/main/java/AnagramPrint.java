import java.util.*;
public class AnagramPrint {
   

    
        public static void main(String[] args) {
            String[] input = {"akka", "akak", "baab", "baba", "bbaa"};
            Map<String, List<String>> anagramBuckets = createAnagramBuckets(input);
            for (List<String> bucket : anagramBuckets.values()) {
                System.out.println(bucket);
            }
        }
    
        public static Map<String, List<String>> createAnagramBuckets(String[] words) {
            Map<String, List<String>> anagramBuckets = new HashMap<>();
    
            for (String word : words) {
                // Sort the characters of the word
                char[] charArray = word.toCharArray();
                Arrays.sort(charArray);
                String sortedWord = new String(charArray);
    
                // Add the word to the corresponding bucket
                if (!anagramBuckets.containsKey(sortedWord)) {
                    anagramBuckets.put(sortedWord, new ArrayList<>());
                }
                anagramBuckets.get(sortedWord).add(word);
            }
    
            return anagramBuckets;
        }
    
    
}
