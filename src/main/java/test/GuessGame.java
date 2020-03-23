package test;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class GuessGame {
    private static int minValue = 0;
    private static int maxValue = 100;
    public static final int EXIT_VALUE = minValue - 1;
    private static Random random = new Random();

    public static void welcome(){
        System.out.println("Итак, Вы выбрали игру 1, <<Угадай число>>" +
                "\nМной загадано число от " + minValue + " до " + maxValue +
                "\nВам предстоит угадать это число.");
    }

    public static int createRandomNumber() {
        return random.nextInt((maxValue - minValue) + 1) + minValue;
    }

    public static int enterUserNumber() {
        System.out.println("Введите Ваш вариант числа от " + minValue + " до " + maxValue + "..." +
                "\nДля выхода введите " + EXIT_VALUE);
        try {
            return new Scanner(System.in).nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Допускается ввод только цифр");
            return enterUserNumber();
        }
    }
    public static boolean checkEnteredNumberFormat(int enteredNumber) {
        return enteredNumber >= (minValue - 1) && enteredNumber <= maxValue;
    }

    public static void compareWithRandom(int userNumber, int randomNumber) {
        if (userNumber < randomNumber)
            System.out.println("Ваше число меньше загаданного...");
        if (userNumber > randomNumber)
            System.out.println("Ваше число больше загаданного...");
    }

}
