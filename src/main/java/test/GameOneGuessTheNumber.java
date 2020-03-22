package test;

public class GameOneGuessTheNumber {
    public static void startTheGame() {
        GuessGame.welcome();
        int randomNumber = GuessGame.createRandomNumber();

        int userNumber;

        do {
            do {
                userNumber = GuessGame.enterUserNumber();
            } while (!GuessGame.checkEnteredNumberFormat(userNumber));
            if (userNumber == GuessGame.EXIT_VALUE) {
                App.sayGoodBye("");
                return;
            }
            GuessGame.compareWithRandom(userNumber, randomNumber);
        } while (!GuessGame.checkEnteredNumberFormat(userNumber) || userNumber != randomNumber);

        System.out.println("Позравляем! Вы угадали число!");
    }
}
