public class MergeSort {

    // Main function that sorts the array using mergeSort
    public void sort(int[] array, int left, int right) {
        if (left < right) {
            // Find the middle point
            int middle = (left + right) / 2;

            // Recursively sort first and second halves
            sort(array, left, middle);
            sort(array, middle + 1, right);

            // Merge the sorted halves
            merge(array, left, middle, right);
        }
    }

    // Function to merge two halves of the array
    private void merge(int[] array, int left, int middle, int right) {
        // Find sizes of two subarrays to be merged
        int n1 = middle - left + 1;
        int n2 = right - middle;

        // Create temporary arrays
        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        // Copy data to temporary arrays
        for (int i = 0; i < n1; ++i)
            leftArray[i] = array[left + i];
        for (int j = 0; j < n2; ++j)
            rightArray[j] = array[middle + 1 + j];

        // Merge the temp arrays back into the original array
        int i = 0, j = 0;
        int k = left;
        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                array[k] = leftArray[i];
                i++;
            } else {
                array[k] = rightArray[j];
                j++;
            }
            k++;
        }

        // Copy any remaining elements of leftArray
        while (i < n1) {
            array[k] = leftArray[i];
            i++;
            k++;
        }

        // Copy any remaining elements of rightArray
        while (j < n2) {
            array[k] = rightArray[j];
            j++;
            k++;
        }
    }

    // Utility function to print the array
    public void printArray(int[] array) {
        for (int value : array)
            System.out.print(value + " ");
        System.out.println();
    }

    // Main method to run the program
    public static void main(String[] args) {
        int[] arr = { 12, 11, 13, 5, 6, 7 };

        MergeSort ms = new MergeSort();
        System.out.println("Given Array:");
        ms.printArray(arr);

        ms.sort(arr, 0, arr.length - 1);

        System.out.println("Sorted Array:");
        ms.printArray(arr);
    }
}
