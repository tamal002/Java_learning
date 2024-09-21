import java.util.Scanner;

public class MaxElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter array size: ");
        int size = input.nextInt();
        
        int[] array = new int[size]; //array initializing.

        System.out.print("enter array elemets: ");
        for(int i = 0; i < array.length; i++){
            array[i] = input.nextInt();
        }

        //finding the maximum element in the array.
        int max = array[0];
        for(int i = 1; i < array.length; i++){
            if(array[i] > max){
                max = array[i];
            }
        }

        //printing the maximum element.    
        System.out.print("maximum element is " + max);
        input.close();
    }
}
