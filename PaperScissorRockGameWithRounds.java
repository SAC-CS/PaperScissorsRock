import java.util.Scanner;
import java.util.Random;

public class PaperScissorRockGameWithRounds {

	public static void main(String[] args) {
        String PlayerChoice;
        String OpponentChoice = "R";
        int OpponentNumber;
        int WinCount=0;
        Scanner input = new Scanner(System.in);
        Random generate = new Random();
        
        System.out.println("Let's play Paper, Scissors, Rock. ");
        
        for (int round = 1; round < 4; round++) {
            
            System.out.println("\nWhat is your choice? (Paper = P, Scissors = S, Rock = R,)");
            PlayerChoice = input.next(); //Receive input from user on what move they pick (R, P, or S)
        
            OpponentNumber = generate.nextInt(3)+1; //Randomly generate 1, 2 or 3 for Opponent
            if (OpponentNumber == 1) 
                OpponentChoice = "P"; // If 1 is generated, set opponent's choice to Paper
            else if (OpponentNumber == 2)
                OpponentChoice = "S"; // If 2 is generated, set opponent's choice to Scissors
            else if (OpponentNumber == 3)
                OpponentChoice = "R"; // If 3 is generated, set opponent's choice to Rock
            
            System.out.println("I picked " + OpponentChoice);            
        
            if (PlayerChoice.equals(OpponentChoice))
                System.out.println("It's a tie!");
            else if (PlayerChoice.equals("R")){
                if (OpponentChoice.equals("S"))
                    System.out.println("Rock crushes Scissors. You win!");
                else if (OpponentChoice.equals("P"))
                    System.out.println("Paper covers Rock. You lose!");
            }
            else if (PlayerChoice.equals("P")){
                if (OpponentChoice.equals("R"))
                    System.out.println("Papers covers Rock. You win!");
                else if (OpponentChoice.equals("S"))
                    System.out.println("Scissors cuts Paper! I win!");
            }
            else if (PlayerChoice.equals("S")){
                if (OpponentChoice.equals("R"))
                    System.out.println("Rock crushes Scissors. You lose!");
                else if (OpponentChoice.equals("P"))
                    System.out.println("Scissors cut Paper. You win!");
                WinCount++;
            }
            
             
        }
        
        System.out.println("Thanks for playing. Play again soon!");
    
    }
}
//Good job		
