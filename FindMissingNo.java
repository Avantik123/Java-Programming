public class MissingNumberFinder {

    // Method to find the missing number
    public static int findMissingNumber(int[] nums) {
        int n = nums.length; // Length of the array (which is n, since one number is missing)
        int expectedSum = n * (n + 1) / 2; // Sum of numbers from 0 to n
        int actualSum = 0;
        
        // Calculate the sum of elements in the array using a for loop
        for (int i = 0; i < nums.length; i++) {
            actualSum += nums[i];
        }
        
        // The missing number is the difference between expectedSum and actualSum
        return expectedSum - actualSum;
    }

    // Main method for testing
    public static void main(String[] args) {
        int[] nums = {0, 1, 3}; // Example input where the missing number is 2
        int missingNumber = findMissingNumber(nums);
        System.out.println("The missing number is: " + missingNumber);
    }
}
