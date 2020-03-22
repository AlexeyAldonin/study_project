package test;

public class App {
    public static void main(String[] args) {
        System.out.println("Добрый день! Пожалуйста, зарегистрируйтесь...");
        String userName = "";

        do {
            userName = UserNameAndValidation.regName();
        } while (!UserNameAndValidation.checkName(userName));

        userName = UserNameAndValidation.modifyName(userName);

        System.out.println("Здравствуйте, " + userName);
        System.out.println("Предлагаю Вам сыграть со мной в игру...");

        int intention = -1;
        do {
            intention = UserNameAndValidation.enterUserIntention();
        } while (intention != 0 && intention != 1 && intention != 2);

        while (intention != 0) {
            if (intention == 1) Game_1_GuessTheNumber.main(args);
            if (intention == 2) Game_2_RiddleTheNumber.main(args);
            do {
                intention = UserNameAndValidation.enterUserIntention();
            } while (intention != 0 && intention != 1 && intention != 2);
        }

        sayGoodBye(userName);
    }

    public static void sayGoodBye(String name) {
        System.out.println("Спасибо за участие," + name);
        System.out.println("До свидания!");
    }
}
