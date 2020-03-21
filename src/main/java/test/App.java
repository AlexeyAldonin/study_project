package test;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Добрый день! Пожалуйста, зарегистрируйтесь...");
        String userName = "";

        do {
            userName = UserNameAndValidation.regName();
        } while (!UserNameAndValidation.checkName(userName));
        System.out.println("Здравствуйте, " +UserNameAndValidation.modifyName(userName));
        System.out.println("Предлагаем сыграть в игру Угадай Число.");
        System.out.println("Загадано число от 0 до 100");
        System.out.println("введите Ваш вариант числа...");
        System.out.println("Для выхода напишите 300");

        int x = (int)Math.random()*100;
        int a = new Scanner(System.in).nextInt();
        if (a == x) {
            System.out.println("Поздравляем! Вы угадали!");
        } else if (a < x){
            System.out.println("К сожалению, Вы не угадали...");
            System.out.println("");
        }
    }
}
