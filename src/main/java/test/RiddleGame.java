package test;

import java.util.Scanner;

public class RiddleGame {

    public static final int a = 0;
    public static final int b = 100;
    public static final int exitValue = a - 1;

    public static void welcome() {
        System.out.println("Итак, Вы выбрали игру 2, <<Загадай число>>");
        System.out.println("Здесь я попытаюсь угадать загаданное вами число от " + a + " до " + b);
    }

    public static String askToRiddleTheNumber() {
        System.out.println("Загадайте Ваш вариант числа от " + a + " до " + b + "...");
        System.out.println("После выбора числа введите <<загадано>>");
        System.out.println("Для выхода введите " + exitValue);
        return new Scanner(System.in).nextLine();
    }

    public static boolean checkRiddleStartFormat(String answer) {
        if (answer.equalsIgnoreCase("загадано")) return true;
        return false;
    }

    public static int createGuessNumber(int x, int y) {
        return (y - x) / 2 + x;
    }

    public static void requestForCheck(int variant) {
        System.out.println("Итак, мой вариант числа: " + variant);
        System.out.println("Сравните выбранное вами и предлженное мной числа.");
    }

    public static String enterUserAnswer() {
        System.out.println("Если моё число больше загаднного Вами, то введите <<больше>>");
        System.out.println("Если моё число меньше загаданного Вами, то введите <<меньше>>");
        System.out.println("Если числа совпадают, то введите <<правильно>>");
        System.out.println("Для выхода введите <<-1>>");
        return new Scanner(System.in).nextLine();
    }

    public static boolean checkUserAnswerFormat(String answer) {
        return (answer.equalsIgnoreCase("больше") || answer.equalsIgnoreCase("меньше") ||
                answer.equalsIgnoreCase("правильно") || answer.equalsIgnoreCase("-1"));
    }

}
