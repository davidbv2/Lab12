import java.sql.Struct;

/**
 * Created by Grand Circus Student on 7/25/2017.
 */
public abstract class Player {

        private String playerName;
        private RoshamboGen roshambo;

        public String getPlayerName() {

            return playerName;
        }

        public void setPlayerName(String playerName) {

            this.playerName = playerName;
        }

        public RoshamboGen getRoshambo() {
            return roshambo;
        }

        public void setRoshambo(RoshamboGen roshambo) {
            this.roshambo = roshambo;
        }

        public abstract String generateRoshambo();

    }


