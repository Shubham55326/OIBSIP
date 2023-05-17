import java.util.*;
public class Numberguessinggame{
    public static void game(){
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int randnum = rand.nextInt(100)+1;
        int k=5;
        int i,guesses = 0;
        
        boolean correctguess = false;
        System.out.println("welcome");
        System.out.println("guess number between 1 to 100");
        for(i = 0;i<k;i++){
            System.out.print("enter your number :");
            int guess = sc.nextInt();
            guesses++;
            if (guess == randnum){
                correctguess = true;
                System.out.println("winner");
                break;
            }
            else if(guess < randnum)
            {
                 System.out.println("too low");
            }
            else
            {
                System.out.println("too high");
            } 
        System.out.println("remaining " + " " + (k-i-1) +" " + "chances"); 

      }
      if(i==k){
        System.out.println("your are lost in" +" " + k + " " + "times");
        System.out.println("number was"+ " " + randnum);

      }
    }
    public static void main(String[] args) {
        int round = 0;
        game();
        round++;
        System.out.println(round);
        System.out.println("|--------------------|------------------|");
        System.out.println("|    no.of rounds    |      score       |");
        System.out.println("|"+"         "+round+"          "+"|"+"  "+ "      "+"          "     +"|");
        System.out.println("|--------------------|------------------|");
        System.out.println("Do you want to play Again ");
        System.out.println("Press 1 for play again");
        System.out.println("Press 0 for not play again");
        Scanner w = new Scanner(System.in);
        int q = w.nextInt();
        switch(q){
            case 1:
            game();
            break;
            case 2:
            break;
        }
        }
        
        

        
    }
    
