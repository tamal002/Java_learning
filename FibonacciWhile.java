import java.util.Scanner;

public class FibonacciWhile {
    public static void main(String[] args) {
        int a = 0, b = 1, sum = 0, i = 1, n; //innitialization.

        //Reading input from user.
        System.out.print("enter the no. of term: ");
        Scanner input = new Scanner(System.in);
        n = input.nextInt();

        System.out.print("the " + n + "th" + " term is: ");
        if (n == 1) {
            System.out.println(a);
        }else if (n == 2) {
            System.out.print(b);
        }else{
            while (i < n-1) {
                sum = a + b;
                a = b;
                b = sum;
                i++;
            }
            System.out.print(sum);
        }
        input.close();
    }
}
