public class SumArray {
    
    
        public static void main(String[] args) {
            int[] array = {1, 5, 3, 7, 9, 2, 6};
            int[] result = maxProductNumbers(array);
            System.out.println("Two numbers with maximum product: " + result[0] + " and " + result[1]);
        }
    
        public static int[] maxProductNumbers(int[] nums) {
            if (nums == null || nums.length < 2) {
                throw new IllegalArgumentException("Array should contain at least two numbers.");
            }
    
            int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE;
            int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;
    
            for (int num : nums) {
                if (num > max1) {
                    max2 = max1;
                    max1 = num;
                } else if (num > max2) {
                    max2 = num;
                }
    
                if (num < min1) {
                    min2 = min1;
                    min1 = num;
                } else if (num < min2) {
                    min2 = num;
                }
            }
    
            // Check if the product of the two maximums is greater than the product of the two minimums
            if (max1 * max2 > min1 * min2) {
                return new int[]{max1, max2};
            } else {
                return new int[]{min1, min2};
            }
        }
    
    
}
