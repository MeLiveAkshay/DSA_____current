public class RotateArray {
    public static void main(String[] args) {
        // Example usage:
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;

        RotateArray ra = new RotateArray();
        ra.rotate(nums, k);

        // Print rotated array
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    // Rotate array nums to the right by k steps
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;  // handle if k > n

        // Reverse the entire array
        reverse(nums, 0, n - 1);
        // Reverse first k elements
        reverse(nums, 0, k - 1);
        // Reverse remaining elements
        reverse(nums, k, n - 1);
    }

    // Helper method to reverse elements in nums between start and end indices
    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
