public class MainChallenge {
    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("High score: " + highScore);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        System.out.println("High Score: "+
                calculateScore(gameOver, score, levelCompleted, bonus));
//        boolean newGameOver = true;
//        int newScore = 10000;
//        int newLevelCompleted = 8;
//        int newBonus = 200;
//
//        int newFinalScore = newScore;
//
//        if (newGameOver) {
//            newFinalScore += (newLevelCompleted * newBonus);
//            System.out.println("Your final score was " + newFinalScore);
//        }
        displayHighScorePosition("Kokos", calculateHighScorePosition(1500));
        displayHighScorePosition("Ninos", calculateHighScorePosition(1000));
        displayHighScorePosition("Aris", calculateHighScorePosition(500));
        displayHighScorePosition("Mixalis", calculateHighScorePosition(100));
        displayHighScorePosition("Fitos", calculateHighScorePosition(25));


    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        int finalScore = score;

        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            finalScore += 1000;
        }
        return finalScore;
}

    public static void displayHighScorePosition(String name, int highScorePosition) {
        System.out.println(name + " managed to get into position " + highScorePosition +
                " on the high score list.");
    }

    public static int calculateHighScorePosition(int score) {
        int position = 4;

        if (score >= 1000) {
            position = 1;
        } else if (score >= 500) {
            position = 2;
        } else if (score >= 100) {
            position = 3;
        }

        return position;
    }
}
