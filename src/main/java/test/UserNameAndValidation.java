package test;

import java.util.Scanner;

public class UserNameAndValidation {

    public static String regName() {
        System.out.println("Введите имя:");
        return new Scanner(System.in).nextLine();
    }

    public static boolean checkName(String name) {
        if (name.equals("")) {
            System.out.println("Пустое имя, попробуйте ещё раз");
            return false;
        } else {
            for (int i = 0; i < name.length(); i++) {
               if (Character.isDigit(name.charAt(i)) || name.charAt(i) == ' ') {
                   System.out.println("Имя не должно содержать цифр и пробелов");
                   return false;
                }
            }
        }
        return true;
    }

    public static String modifyName(String name) {
        StringBuilder out = new StringBuilder ("");
        char[] temp = name.toLowerCase().toCharArray();
        out.append(String.valueOf(temp[0]).toUpperCase());
        for (int i = 1; i < temp.length; i++) {
            out.append(temp[i]);
        }
        return out.toString();
    }

    public static int enterUserIntention() {
        System.out.println("Чтобы сыграть в игру <<Угадай число>>, введите 1" +
                "\nЧтобы сыграть в игру <<Загадай число>>, введите 2" +
                "\nДля выхода введите 0");
        return new Scanner(System.in).nextInt();
    }
}
