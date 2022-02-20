import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

            boolean runAgain = true;
        while (runAgain)
        {
            Scanner in = new Scanner(System.in);
            String trash = "";
            String tryAgain;
            String playAgain;
            String playerOne = "R";
            String playerTwo = "S";
            String yesOrNo = "Y";


            System.out.print("Player One please select Rock, Paper, or Scissors ");
            playerOne = in.nextLine();

            System.out.print("Player Two please select Rock, Paper, or Scissors ");
            playerTwo = in.nextLine();

            if (playerOne.equalsIgnoreCase("R"))
            {
                if (playerTwo.equalsIgnoreCase("R"))
                {
                    System.out.print("Rock vs Rock, it's a TIE! ");
                }
                else if (playerTwo.equalsIgnoreCase("P"))
                {
                    System.out.print("Paper covers Rock, Player Two wins! ");
                }
                else if (playerTwo.equalsIgnoreCase("S"))
                {
                    System.out.print("Rock breaks Scissors, Player One wins! ");
                }
                else
                {
                    System.out.println("Illegal move");
                }
            }
            else if (playerOne.equalsIgnoreCase("P"))
            {
                if (playerTwo.equalsIgnoreCase("R"))
                {
                    System.out.print("Paper covers Rock, Player One wins! ");
                }
                else if (playerTwo.equalsIgnoreCase("P"))
                {
                    System.out.print("Paper vs Paper, it's a TIE! ");
                }
                else if (playerTwo.equalsIgnoreCase("S"))
                {
                    System.out.print("Scissors cuts Paper, Player Two wins! ");
                }
                else
                {
                    System.out.println("Illegal move");
                }
            }
            else //playerOne is scissors
            {
                if (playerTwo.equalsIgnoreCase("R"))
                {
                    System.out.print("Rock breaks Scissors, Player Two wins! ");
                }
                else if (playerTwo.equalsIgnoreCase("P"))
                {
                    System.out.print("Scissors cuts Paper, Player One wins! ");
                }
                else if (playerTwo.equalsIgnoreCase("S"))
                {
                    System.out.print("Scissors vs Scissors, it's a TIE! ");
                }
                else
                {
                    System.out.println("Illegal move");
                }
            }
            System.out.println("\nWould you like to play again Y or N? ");
                playAgain = in.nextLine();

                if (playAgain.equalsIgnoreCase("N"))
                {
                    System.out.println("Exiting...thanks for playing!");
                    System.exit(0);
                }
                }

            }

        }



