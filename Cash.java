import java.util.Scanner;

public class Cash {
    public static void main(String[] args) {
        int cents, coins = 0;

        Scanner input = new Scanner(System.in);
        do{
            System.out.print("Change owed: "); 
            cents = input.nextInt() ; 
        }while(cents < 0);
        

        //for Quartrs (1 Quarter = 25 cents)    
        coins = cents / 25; 
        cents = cents % 25; 

        //for Dimes (1 Dime = 10 cents)
        coins = (coins + (cents / 10)); 
        cents = cents % 10; 

        //for nickel (1 nickel = 5 cents) 
        coins = (coins + (cents / 5)); 
        cents = cents % 5; 

        //for penny (1 penny = 1 cents)
        coins = (coins + (cents / 1)); 
        cents = cents % 1;

        System.out.println(coins);

        input.close();
    }
}
