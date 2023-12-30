public class CalculateScore {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;
        int finalScore = score;
        if(gameOver){
            finalScore += (levelCompleted * bonus);
            finalScore += 1000;     //here we have added additional 1000
            System.out.println("your final score" + finalScore);
        }
        score = 10000;
        levelCompleted = 8;
        bonus = 200;
        finalScore = score;
        if(gameOver) {
            finalScore += (levelCompleted * bonus);     //here we have missed to add 1000 to overcome situation introducing methods
            System.out.println("your final score was " + finalScore);
        }


    }
}
