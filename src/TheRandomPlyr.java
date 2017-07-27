/**
 * Created by Grand Circus Student on 7/25/2017.
 */
import java.util.Random;

public class TheRandomPlyr extends Player {

        Random rand = new Random();

        private String playerName = "RandomPlyr";
        private String randomChoice;

        public String generateRoshambo() {
            switch ((int) (Math.random() * 2) + 1) {
                case 1:
                    randomChoice = "ROCK";
                    break;
                case 2:
                    randomChoice = "PAPER";
                    break;
                case 3:
                    randomChoice = "SCISSORS";
                    break;

            }
            return randomChoice;
        }

    }