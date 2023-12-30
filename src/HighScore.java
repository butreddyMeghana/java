public class HighScore {

    public static void main(String[] args) {

        int playerposition = calculateHighScorePosition(1500);


        displayHighPosition("manoj", playerposition);

        playerposition = calculateHighScorePosition(1000);
        displayHighPosition("sony" , playerposition);
        playerposition = calculateHighScorePosition(500);
        displayHighPosition("pramod",playerposition);
        playerposition = calculateHighScorePosition(100);
        displayHighPosition("sai",playerposition);
        playerposition=calculateHighScorePosition(25);
        displayHighPosition("sony",playerposition);


    }

    public static void displayHighPosition(String playerName, int position) {
        System.out.println(playerName  +  " managed to get into position " +  position + " on the high score list ");

    }
    public static int calculateHighScorePosition(int playerScore) {
        if (playerScore >= 1000) {
            return 1;
        } else if (playerScore>=500 && playerScore<1000) {
            return 2;
        }
        else if(playerScore>=100 && playerScore<500){
            return 3;
        }
        else {
            return 4;
        }

    }
}