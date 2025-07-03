public class SelectionSort {

    // Main method to sort an array using Selection Sort
    public void sort(int[] array) {
        int n = array.length;

        // One by one move the boundary of the unsorted subarray
        for (int i = 0; i < n - 1; i++) {
            // Assume the current index as the minimum
            int minIndex = i;

            // Find the minimum element in the unsorted part
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j; // Update index of the new minimum
                }
            }

            // Swap the found minimum element with the first element
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }

    // Utility method to print the array
    public void printArray(int[] array) {
        for (int value : array)
            System.out.print(value + " ");
        System.out.println();
    }

    // Main method to run the program
    public static void main(String[] args) {
        int[] arr = {29, 10, 14, 37, 14};

        SelectionSort ss = new SelectionSort();
        System.out.println("Given Array:");
        ss.printArray(arr);

        ss.sort(arr);

        System.out.println("Sorted Array:");
        ss.printArray(arr);
    }
}
