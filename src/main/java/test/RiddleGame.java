package test;

import java.util.Scanner;

public class RiddleGame {

    public static final int MIN_VALUE = 0;
    public static final int MAX_VALUE = 100;
    public static final int EXIT_VALUE = MIN_VALUE - 1;

    public static void welcome() {
        System.out.println("Итак, Вы выбрали игру 2, <<Загадай число>>" +
                "\nЗдесь я попытаюсь угадать загаданное вами число от " + MIN_VALUE + " до " + MAX_VALUE);
    }

    public static String askToRiddleTheNumber() {
        System.out.println("Загадайте Ваш вариант числа от " + MIN_VALUE + " до " + MAX_VALUE + "..." +
                "\nПосле выбора числа введите <<загадано>>" +
                "\nДля выхода введите " + EXIT_VALUE);
        return new Scanner(System.in).nextLine();
    }

    public static boolean checkRiddleStartFormat(String answer) {
        return answer.equalsIgnoreCase("загадано");
    }

    public static int createGuessNumber(int min, int max) {
        return (max - min) / 2 + min;
    }

    public static void requestForCheck(int variant) {
        System.out.println("Итак, мой вариант числа: " + variant +
                "\nСравните выбранное вами и предлженное мной числа.");
    }

    public static String enterUserAnswer() {
        System.out.println("Если моё число больше загаднного Вами, то введите <<больше>>" +
                "\nЕсли моё число меньше загаданного Вами, то введите <<меньше>>" +
                "\nЕсли числа совпадают, то введите <<правильно>>" +
                "\nДля выхода введите " + EXIT_VALUE);
        return new Scanner(System.in).nextLine();
    }

    public static boolean checkUserAnswerFormat(String answer) {
        return (answer.equalsIgnoreCase("больше") || answer.equalsIgnoreCase("меньше") ||
                answer.equalsIgnoreCase("правильно") || answer.equalsIgnoreCase("-1"));
    }

}
