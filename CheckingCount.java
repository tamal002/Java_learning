import java.util.Scanner;

public class CheckingCount {
    public static void main(String[] args) {
        int flag = 0;
        long p, remainder = 0, check;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter digits: ");
        p = input.nextInt();
        System.out.print("mention the digit you want to count: ");
        check = input.nextInt();

        while (p != 0) {
            remainder = p % 10;
            if (remainder == check) {
                flag++;
            }
            p = p/10;
        }
        System.out.print("the count of the number is: " + flag);
        input.close();

    }
}
