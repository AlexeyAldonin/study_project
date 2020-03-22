package test;

public class Game_1_GuessTheNumber {
    public static void main(String[] args) {
        GuessGame.welcome();
        int x = GuessGame.createRandomNumber();
        System.out.println(x);

        int userNumber;

        do {
            do {
                userNumber = GuessGame.enterUserNumber();
            } while (!GuessGame.checkEnteredNumberFormat(userNumber));
            if (userNumber == GuessGame.exitValue) {
                App.sayGoodBye("");
                return;
            }
            GuessGame.compareWithRandom(userNumber, x);
        } while (!GuessGame.checkEnteredNumberFormat(userNumber) || userNumber != x);

        System.out.println("Позравляем! Вы угадали число!");
    }
}
