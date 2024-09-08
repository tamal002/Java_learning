import java.util.Scanner;

public class Mario {
    public static void main(String[] args) {
        int i, j, k, l, n;
        
        Scanner input = new Scanner(System.in);
        System.out.print("enter the height: ");
        n = input.nextInt(); //Reading input

        for(i = 1; i <= n; i++){

            for(j = 5; j > i; j--){
                System.out.print(" ");
            }

            for(k = 1; k <= i; k++){
                System.out.print("#");
            }

            System.out.print("  "); //separation b/w two half pyramids

            for(l = 1; l <= i; l++){
                System.out.print("#");
            }

            System.out.print("\n");
        }
        input.close();

    }
}
