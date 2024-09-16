import java.util.Scanner;

public class BubbleSort {

    static void bubbleSort(int[] arr){
        for(int i = 0; i < (arr.length - 1); i++){
            for(int j = i + 1; j < arr.length; j++){
                if(arr[i] > arr[j]){
                    arr[i] = arr[i] ^ arr[j];
                    arr[j] = arr[i] ^ arr[j];
                    arr[i] = arr[i] ^ arr[j];
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
