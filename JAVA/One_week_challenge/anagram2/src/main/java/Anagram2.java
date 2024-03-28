import java.util.*;

public class Anagram2 {
    public static void main(String[] args) {
        String inputString = "Despite commuting at the peak hour, she was able to keep to time";
        List<String> anagrams = findAnagrams(inputString);
        
        if (anagrams.isEmpty()) {
            System.out.println("No anagrams found in the given string.");
        } else {
            System.out.println("Anagrams found in the given string:");
            for (String anagram : anagrams) {
                System.out.println(anagram);
            }
        }
    }

    public static List<String> findAnagrams(String input) {
        List<String> anagrams = new ArrayList<>();
        
        // Remove punctuation and convert to lowercase
        input = input.replaceAll("[^a-zA-Z ]", "").toLowerCase();
        
        // Split the input string into words
        String[] words = input.split("\\s+");
        
        // Create a map to store sorted versions of words
        Map<String, List<String>> sortedWordsMap = new HashMap<>();
        
        // Iterate through each word and add it to the corresponding bucket
        for (String word : words) {
            char[] charArray = word.toCharArray();
            Arrays.sort(charArray);
            String sortedWord = new String(charArray);
            
            if (!sortedWordsMap.containsKey(sortedWord)) {
                sortedWordsMap.put(sortedWord, new ArrayList<>());
            }
            sortedWordsMap.get(sortedWord).add(word);
        }
        
        // Check for anagrams in the buckets
        for (List<String> bucket : sortedWordsMap.values()) {
            if (bucket.size() > 1) {
                anagrams.addAll(bucket);
            }
        }
        
        return anagrams;
    }
}
