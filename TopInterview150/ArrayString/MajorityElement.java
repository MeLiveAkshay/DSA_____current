import java.util.Scanner;

public class MajorityElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of elements
        int n = scanner.nextInt();

        // Read the array elements
        int[] nums = new int[n];
        for(int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        // Find and print the majority element
        System.out.println(majorityElement(nums));
        scanner.close();
    }

    // Function to find the majority element using Boyer-Moore Voting Algorithm
    public static int majorityElement(int[] nums) {
        int count = 0;      // Counter for the current candidate
        int candidate = 0;  // Current candidate for majority element

        // Loop through each number in the array
        for (int num : nums) {
            // If count is zero, select new candidate
            if (count == 0) {
                candidate = num;
            }

            // Increment or decrement count depending on whether
            // current number matches the candidate
            if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }

        // After the loop, candidate holds the majority element
        return candidate;
    }
}
