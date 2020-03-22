package test;

public class Game_2_RiddleTheNumber {
    public static void main(String[] args) {

        RiddleGame.welcome();

        String userRiddle = "";

        do {
            userRiddle = RiddleGame.askToRiddleTheNumber();
            if (userRiddle == String.valueOf(RiddleGame.exitValue)) {
                App.sayGoodBye("");
                return;
            }
        } while (!RiddleGame.checkRiddleStartFormat(userRiddle));

        int min = RiddleGame.a;
        int max = RiddleGame.b;
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
