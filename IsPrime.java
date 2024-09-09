import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {
        int x;

        //Reading input
        Scanner input = new Scanner(System.in);
        System.out.print("enter the number: ");
        x = input.nextInt();

        for(int i = (x-1); i > 1; i--){
            if(x % i == 0){
                System.out.print(x + " is not prime number.");
                return;
            }
        }
        
        System.out.print(x + " is prime number.");

        input.close();

    }
}
