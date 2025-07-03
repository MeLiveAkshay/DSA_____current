public class QuickSort {

    // Main function that sorts the array using Quick Sort algorithm
    public void sort(int[] array, int low, int high) {
        if (low < high) {
            // Partition the array and get the pivot index
            int pivotIndex = partition(array, low, high);

            // Recursively sort the elements before and after partition
            sort(array, low, pivotIndex - 1);
            sort(array, pivotIndex + 1, high);
        }
    }

    // Function to take last element as pivot, place it correctly, and sort elements around it
    private int partition(int[] array, int low, int high) {
        int pivot = array[high]; // Choose the last element as pivot
        int i = low - 1; // Index of smaller element

        for (int j = low; j < high; j++) {
            // If current element is smaller than or equal to pivot
            if (array[j] <= pivot) {
                i++;

                // Swap array[i] and array[j]
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        // Swap array[i + 1] and array[high] (the pivot)
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;

        return i + 1;
    }

    // Utility function to print the array
    public void printArray(int[] array) {
        for (int value : array)
            System.out.print(value + " ");
        System.out.println();
    }

    // Main method to run the QuickSort
    public static void main(String[] args) {
        int[] arr = { 10, 7, 8, 9, 1, 5 };

        QuickSort qs = new QuickSort();
        System.out.println("Given Array:");
        qs.printArray(arr);

        qs.sort(arr, 0, arr.length - 1);

        System.out.println("Sorted Array:");
        qs.printArray(arr);
    }
}
