import java.util.Scanner;

public class SrabbleCS50 {
    public static void main(String[] args) {
        String word1, word2;
        int  score1, score2;

        Scanner input = new Scanner(System.in);

        System.out.print("Player 1: "); //Reading the word1 of player 1.
        word1 = input.next();

        System.out.print("Player 2: "); ////Reading the word2 of player 2.
        word2 = input.next();

        score1 = get_score(word1);
        score2 = get_score(word2);

        //Printing the Result.
        if(score1 > score2){
            System.out.println("player 1 wins.");
        }else if(score2 > score1){
            System.out.println("player 2 wins.");
        }else{
            System.out.println("Tie !.");
        }
        
        input.close();

    }

    static int get_score(String word1){
        int score = 0;

        for(int i = 0; i < word1.length(); i++){
            if (word1.charAt(i) == 'A' || word1.charAt(i) == 'E' || word1.charAt(i) == 'I' || word1.charAt(i) == 'L' || word1.charAt(i) == 'N' || word1.charAt(i) == 'Q' || word1.charAt(i) == 'R'
            || word1.charAt(i) == 'S' || word1.charAt(i) == 'T' || word1.charAt(i) == 'U' || word1.charAt(i) == 'a' || word1.charAt(i) == 'e'
            || word1.charAt(i) == 'i' || word1.charAt(i) == 'l' || word1.charAt(i) == 'n' || word1.charAt(i) == 'q' || word1.charAt(i) == 'r' 
            || word1.charAt(i) == 's' || word1.charAt(i) == 't' || word1.charAt(i) == 'u') {
                score = score + 1;
            }else if(word1.charAt(i) == 'D' || word1.charAt(i) == 'G' || word1.charAt(i) == 'd' || word1.charAt(i) == 'g'){
                score = score + 2;
            }else if(word1.charAt(i) == 'B' || word1.charAt(i) == 'C' || word1.charAt(i) == 'M' || word1.charAt(i) == 'P'
            || word1.charAt(i) == 'b' || word1.charAt(i) == 'c' || word1.charAt(i) == 'm' || word1.charAt(i) == 'p'){
                score = score + 3;
            }else if(word1.charAt(i) == 'F' || word1.charAt(i) == 'H' || word1.charAt(i) == 'V' || word1.charAt(i) == 'W' || word1.charAt(i) == 'Y'
            || word1.charAt(i) == 'f' || word1.charAt(i) == 'h' || word1.charAt(i) == 'v' || word1.charAt(i) == 'w' || word1.charAt(i) == 'y'){
                score = score + 4;
            }else if(word1.charAt(i) == 'K' || word1.charAt(i) == 'k'){
                score = score + 5;
            }else if(word1.charAt(i) == 'J' || word1.charAt(i) == 'X' || word1.charAt(i) == 'j' || word1.charAt(i) == 'x'){
                score = score + 8;
            }else if(word1.charAt(i) == 'Q' || word1.charAt(i) == 'Z' || word1.charAt(i) == 'q' || word1.charAt(i) == 'z'){
                score = score + 10;
            }
            else{
                score = score + 0;
            }

        } 

        return score;

    }
}
