import java.util.Scanner;

public class BubbleSort {

    static void bubbleSort(int[] arr) {
        int n = arr.length;
        // Outer loop: Number of passes
        for (int i = 0; i < n - 1; i++) {
            // Inner loop: Compare adjacent elements
            for (int j = 0; j < n - i - 1; j++) {
                // If current element is greater than the next, swap them
                if (arr[j] > arr[j + 1]) {
                    // Swap using a temporary variable (common practice)
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int arraySize, inputArray;
    
        System.out.print("Enter the number of array element: ");
        
        Scanner input = new Scanner(System.in);
        
        arraySize = input.nextInt();
        int arr[] = new int[arraySize];

        System.out.print("Enter array elements: ");

        for(int i = 0; i < arr.length; i++){
            inputArray = input.nextInt();
            arr[i] = inputArray;
        }

        bubbleSort(arr);

        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }

        input.close();
    }
}
