public class stringSorting {
    public static void main(String[] args) {
        // Sample array of strings
        String[] arr = {"banana", "apple", "orange", "grape", "cherry"};

        // Bubble sort algorithm for strings
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    // Swap the strings
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // Displaying the sorted array
        System.out.println("Sorted Array:");
        for (String str : arr) {
            System.out.println(str);
        }
    }
}
