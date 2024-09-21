import java.util.Scanner;

public class MaxOnes {

    static void ConsecutiveSearch(int[][] arr, int row, int collumn){
        int maxOnes = 0, currentOnes = 0;
        //int[] maxArray = new int[row];

        for(int i = 0; i < row; i++){
            for(int j = 0; j < collumn; j++){
                if(arr[i][j] == 1){
                    currentOnes++;
                }
                else{
                    if(currentOnes > maxOnes){
                        maxOnes = currentOnes;
                        currentOnes = 0;
                    }
                    currentOnes = 0;
                }
                    
                
            }
            if(currentOnes > maxOnes){
                maxOnes = currentOnes;
            }
            currentOnes = 0;     
            //maxArray[i] = maxOnes;
        }

        

        System.out.println("Maximum numbers of consecutive Ones = " + maxOnes);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("enter the row and collumn of the matrix: ");
        int row = input.nextInt();
        int collumn = input.nextInt();

        int[][] arr = new int[row][collumn]; //2D matrix declairizatioin.

        System.out.println("enter array elements matrix row-collumn wise using only 0s and 1s: "); //array elements input.
        for(int i = 0; i < row; i++){
            for(int j = 0; j < collumn; j++){
                arr[i][j] = input.nextInt();
            }
        }

        System.out.println("your array is: ");

        for(int i = 0; i < row; i++){
            for(int j = 0; j < collumn; j++){
                
                System.out.print(arr[i][j] + " ");
            }
            System.out.print("\n");
        }

        ConsecutiveSearch(arr, row, collumn);




        input.close();
    }
}
