import java.util.Scanner;

public class FibonacciFor{
    public static void main(String[] args) {
        int a=0, b=1, c, n;
        System.out.print("enter term of fibonacci series: ");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        System.out.println("the series is: ");
        if(n==1){
            System.out.println(a);
        }
        if(n>1){
            System.out.print(a + " " + b + " ");
        }
        for(int i = 3; i<=n; i++){
            c = a + b;
            a = b;
            b = c;
            System.out.print(c + " ");
        }
        in.close();
    }
}
