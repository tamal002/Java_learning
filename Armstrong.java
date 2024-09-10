import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        int n, count = 0;

        //Reading the input from user.
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        n = input.nextInt();

        count = counting(n, count); //making a call for counting length.

        if (checking(n, count)) {
            System.out.print(n + " is an Armstrong number.");
        }
        else{
            System.out.print(n + " is not an Armstrong number.");
        }
        
        input.close();
    }

    //Counting the length of number.
    static int counting(int n, int count){

        while (n != 0) {
            n = n / 10;
            count++;
        }
        return count;
    }

    //Checking if Armstrong or not.
    static boolean checking(int n, int count){
        int r, sum = 0, m = n;

        while (n != 0) {
            r = n % 10;
            n = n / 10;
            sum = sum + (int) Math.pow(r, count);
        }

        if (sum == m) {
            return true;
        }
        else{
            return false;
        }
    }

}
