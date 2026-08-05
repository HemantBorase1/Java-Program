import java.util.Arrays;

class Problem27 {
    public static void main(String[] args) {
        int arr[] = {4, 2, 4, 7, 2, 9, 7};
        int newarr[] = new int[arr.length];

        int size = 0;

        for (int i = 0; i < arr.length; i++) {
            boolean isDuplicate = false;

            // Check if element already exists in newarr
            for (int j = 0; j < size; j++) {
                if (arr[i] == newarr[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            // Add only first occurrence
            if (!isDuplicate) {
                newarr[size] = arr[i];
                size++;
            }
        }

        // Print only filled elements
        for (int i = 0; i < size; i++) {
            System.out.print(newarr[i] + " ");
        }
    }
}