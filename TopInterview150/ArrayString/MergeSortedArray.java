import java.util.Scanner;

public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;         // Pointer for nums1
        int j = n - 1;         // Pointer for nums2
        int k = m + n - 1;     // Pointer for merged position in nums1

        // Merge from the end
        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }

        // If any elements left in nums2
        while (j >= 0) {
            nums1[k--] = nums2[j--];
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MergeSortedArray merger = new MergeSortedArray();

        // Input for nums1
        System.out.print("Enter number of initialized elements in nums1 (m): ");
        int m = sc.nextInt();

        System.out.print("Enter number of elements in nums2 (n): ");
        int n = sc.nextInt();

        int[] nums1 = new int[m + n]; // nums1 has size m+n
        int[] nums2 = new int[n];

        System.out.println("Enter " + m + " sorted elements for nums1:");
        for (int i = 0; i < m; i++) {
            nums1[i] = sc.nextInt();
        }

        // Remaining slots in nums1 are already 0 by default

        System.out.println("Enter " + n + " sorted elements for nums2:");
        for (int i = 0; i < n; i++) {
            nums2[i] = sc.nextInt();
        }

        // Perform merge
        merger.merge(nums1, m, nums2, n);

        // Output result
        System.out.print("Merged array: ");
        for (int num : nums1) {
            System.out.print(num + " ");
        }
        sc.close();
    }
}
