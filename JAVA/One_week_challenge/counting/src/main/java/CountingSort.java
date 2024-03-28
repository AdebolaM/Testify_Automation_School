import java.util.Arrays;

public class CountingSort {
    public static void main(String[] args) {
        int[] collection = {3, 1, 4, 2, 5, 1, 6, 7, 9, 3, 2, 8, 4, 1, 2, 3, 7, 8, 5, 9};
        int[] sortedCollection = countingSort(collection);
        System.out.println(Arrays.toString(sortedCollection));
    }

    public static int[] countingSort(int[] arr) {
        int[] count = new int[10]; // Since the numbers range from 1 to 9, we need 10 buckets (0 to 9)
        int[] sortedArray = new int[arr.length];
        
        // Count the occurrences of each number in the array
        for (int num : arr) {
            count[num]++;
        }
        
        // Calculate the starting index for each number
        for (int i = 1; i < count.length; i++) {
            count[i] += count[i - 1];
        }
        
        // Build the sorted array
        for (int i = arr.length - 1; i >= 0; i--) {
            sortedArray[count[arr[i]] - 1] = arr[i];
            count[arr[i]]--;
        }
        
        return sortedArray;
    }
}
