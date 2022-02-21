import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {


        {
            Scanner in = new Scanner(System.in);
            String trash = "";
            String tryAgain;
            String playAgain;
            String playerOne = "R";
            String playerTwo = "S";
            String yesOrNo = "Y";

            boolean goodOne = false;
            boolean goodTwo = false;
            boolean
            do {
                System.out.print("Player One please select R)ock, P)aper, or S)cissors ");
                if(in.hasNextLine())
                {
                    playerOne = in.nextLine();

                    if (playerOne.equalsIgnoreCase("R")||(playerOne.equalsIgnoreCase("S")||(playerOne.equalsIgnoreCase("P"))))
                    {
                        System.out.println("Player one chose: " + playerOne);
                        goodOne = true;
                    }
                    else
                    {
                        System.out.println("You entered " + trash + "please try again and choose R, P, or S");
                    }
                }
                else
                {
                    trash = in.nextLine();
                    System.out.println("You entered " + trash + "please try again and choose R, P, or S");
                }

            }while(!goodOne);

            do {
                System.out.print("Player Two please select R)ock, P)aper, or S)cissors ");
                if(in.hasNextLine())
                {
                    playerTwo = in.nextLine();

                    if (playerTwo.equalsIgnoreCase("R")||(playerTwo.equalsIgnoreCase("S")||(playerTwo.equalsIgnoreCase("P"))))
                    {
                        System.out.println("Player Two chose: " + playerTwo);
                        goodTwo = true;
                    }
                    else
                    {
                        System.out.println("You entered" + trash + "please try again and choose R, P, or S");
                    }
                }
                else
                {
                    trash = in.nextLine();
                   System.out.println("You entered " + trash + "please try again and choose R, P, or S!");
                }

            }while(!goodTwo);

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
                else
                {
                    System.out.print("Rock breaks Scissors, Player One wins! ");
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
                else
                {
                    System.out.print("Scissors cuts Paper, Player Two wins! ");
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
                else
                {
                    System.out.print("Scissors vs Scissors, it's a TIE! ");
                }

            }
            System.out.println("\nWould you like to play again [Y/N]: ");
                playAgain = in.nextLine();

                if (playAgain.equalsIgnoreCase("N"))
                {
                    System.out.println("Exiting...thanks for playing!");
                    System.exit(0);
                }
                }

            }

        }



