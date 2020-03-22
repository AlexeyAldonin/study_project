package test;

public class GameTwoRiddleTheNumber {
    public static void startTheGame() {

        RiddleGame.welcome();

        String userRiddle = "";

        do {
            userRiddle = RiddleGame.askToRiddleTheNumber();
            if (userRiddle.equals(String.valueOf(RiddleGame.EXIT_VALUE))) {
                App.sayGoodBye("");
                return;
            }
        } while (!RiddleGame.checkRiddleStartFormat(userRiddle));

        int min = RiddleGame.MIN_VALUE;
        int max = RiddleGame.MAX_VALUE;
        int attempt = RiddleGame.createGuessNumber(min, max);

        RiddleGame.requestForCheck(attempt);

        String userAnswer = "";

        do {
            userAnswer = RiddleGame.enterUserAnswer();
        } while (!RiddleGame.checkUserAnswerFormat(userAnswer));

        while (!userAnswer.equalsIgnoreCase("правильно")) {
            if (userAnswer.equals("-1")) {
                App.sayGoodBye("");
                return;
            }
            if (userAnswer.equalsIgnoreCase("больше")) {
                max = attempt;
            } else
            if (userAnswer.equalsIgnoreCase("меньше")) {
                min = attempt;
            }
            attempt = RiddleGame.createGuessNumber(min, max);
            RiddleGame.requestForCheck(attempt);
            do {
                userAnswer = RiddleGame.enterUserAnswer();
            } while (!RiddleGame.checkUserAnswerFormat(userAnswer));

        }

        System.out.println("УРА! Я угадал!");


    }
}
