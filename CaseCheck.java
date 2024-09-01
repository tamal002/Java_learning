import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        System.out.print("please enter something: ");
        Scanner input = new Scanner(System.in);
        char ch = input.next().trim().charAt(0);
        
        //Case Checking
        if(ch > 97 && ch <122 ){
            System.out.println("this is lower case.");
        } else if(ch > 65 && ch < 90){
            System.out.println("this is upper case.");
        }
        else{
            System.out.println("error: thois isn't any alphabet.");
        }
        input.close();
    }
}

// this code now tracked by git.