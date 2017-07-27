/**
 * Created by Grand Circus Student on 7/25/2017.
 */

import java.util.Scanner;

public class RoshamboApp {

    public static void main(String[] args) {

                Scanner scan = new Scanner(System.in);

                String userName;
                String choosePlayer;
                String userChoice;
                String resultOne = "Win!";
                String resultTwo = "Lose!";
                String resultThree = "Draw!";

                System.out.println("Welcome to the classic game Rock, Paper, Scissors!");
                System.out.println();

                //prompt the user to enter a name and select an opponent
                System.out.print("Please enter your name: ");
                userName = scan.next();

                //prompt the user to select a player
                System.out.print("Choose a player (Computer or Queen): ");
                choosePlayer = scan.next();
                System.out.println();

                //prompt the user to select rock, paper, scissors
                System.out.print("Rock, paper, or scissors? ");
                userChoice = scan.next();
                HumanPlyr uc = new HumanPlyr();
                System.out.println();

                //print the player's choice
                System.out.print(userName + ": " + uc.generateRoshambo(userChoice));
                System.out.println();

                //print the opponent's choice
                if (choosePlayer.equalsIgnoreCase("Computer")) {
                    TheRockPlyr choice1 = new TheRockPlyr();
                    System.out.println("Computer: " + choice1.generateRoshambo());
                }
                else if (choosePlayer.equalsIgnoreCase("Queen")){
                    TheRandomPlyr choice2 = new TheRandomPlyr();
                    System.out.println("The Random Plyr: " + choice2.generateRoshambo());
                }
                System.out.println();
                scan.nextLine();

                //LEFT OFF HERE: Creating Roshambo objects
                RoshamboGen rock = RoshamboGen.ROCK;
                rock.toString();

                //print the result of the match
                if () {
                    System.out.println("The Rock Plyr: " + resultOne);

                }


        }
    }
}
