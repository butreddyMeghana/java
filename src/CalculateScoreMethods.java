public class CalculateScoreMethods {
    public static void main(String[] args) {

        calculateScore(true, 800, 5, 100);
        calculateScore(true, 10000, 8, 200);



    }
    public static void calculateScore(boolean gameOver,int score,int levelCompleted,int bonus){

        int finalScore = score;
        if(gameOver) {
            finalScore += (levelCompleted * bonus);

            int additionalbonus = addBonus(levelCompleted);
            finalScore += additionalbonus;

            /*
            if level completed less than or equal to 5 add additionalBonus 500
            more than 5 add 1000
             */

            System.out.println("your final score " + finalScore);
        }

    }
    public static int addBonus(int levelCompleted){
        int additionalBonus ;
        if(levelCompleted<=5){
            additionalBonus = 500;
        }
        else {
            additionalBonus = 1000;

        }
        System.out.println("i am giving " + additionalBonus + " bonus" );
        return additionalBonus;
    }
}
