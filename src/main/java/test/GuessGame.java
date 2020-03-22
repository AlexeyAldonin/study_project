package test;

import java.util.Random;
import java.util.Scanner;

public class GuessGame {
    private static int a = 0;
    private static int b = 100;
    public static final int exitValue = a - 1;
    private static Random random = new Random();

    public static void welcome(){
        System.out.println("Итак, Вы выбрали игру 1, <<Угадай число>>.");
        System.out.println("Мной загадано число от " + a + " до " + b);
        System.out.println("Вам предстоит угадать это число.");
    }

    public static int createRandomNumber() {
        return random.nextInt((b - a) + 1) + a;
    }

    public static int enterUserNumber() {
        System.out.println("введите Ваш вариант числа от " + a + " до " + b + "...");
        System.out.println("Для выхода введите " + exitValue);
        return new Scanner(System.in).nextInt();
    }
    public static boolean checkEnteredNumberFormat(int n) {
        if (n >= (a - 1) && n <= b) return true;
        return false;
    }

    public static void compareWithRandom(int userNumber, int randomNumber) {
        if (userNumber < randomNumber)
            System.out.println("Ваше число меньше загаданного...");
        if (userNumber > randomNumber)
            System.out.println("Ваше число больше загаданного...");
    }

}
