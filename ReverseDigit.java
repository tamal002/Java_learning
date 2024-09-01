import java.util.Scanner;

public class ReverseDigit {
    public static void main(String[] args) {
        int n, revNum = 0, rem = 0, count = 0;
        System.out.print("Enter the digit: ");
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        while (n != 0) {
            if (count == 0) {
                rem = n % 10;
                revNum = rem;
                n = n / 10;
                count++;
            }
            else{
                rem = n % 10;
                revNum =  ((revNum * 10) + rem);
                n = n / 10;
            }
        }
        System.out.print("the reversed digit is: " + revNum);
        input.close();
    }
}

                    //Another Method, but lengthy.//
                    
/**int numa, numb, revNum = 0, rem = 0, count = 0;

        System.out.print("Enter the digit: ");
        Scanner input = new Scanner(System.in);
        numa = input.nextInt();
        numb = numa; 

        //Counting the digits.
        while (numa != 0) {
            rem = numa % 10; 
            numa = numa / 10; 
            count++; 
        }
        count--; 
        
        //Main itteration.
        while(count >= 0){ 
            if(count == 0){
                rem = numb % 10;
                revNum = revNum + rem; 
                break; 
            }
            rem = numb % 10; 
            numb = numb / 10; 
            revNum = revNum + (int)(Math.pow(10, count) * rem); 
            count--;
        }
        System.out.print("the final reversed digit is: " + revNum);
        input.close(); **/
        // dont worry about this line, just for testing git.