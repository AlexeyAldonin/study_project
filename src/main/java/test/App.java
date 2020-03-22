package test;

public class App {
    public static void main(String[] args) {
        System.out.println("Добрый день! \nПожалуйста, зарегистрируйтесь...");
        String userName = "";

        do {
            userName = UserNameAndValidation.regName();
        } while (!UserNameAndValidation.checkName(userName));

        userName = UserNameAndValidation.modifyName(userName);

        System.out.println("Здравствуйте, " + userName +
                "\nПредлагаю Вам сыграть со мной в игру...");

        int intention = -1;
        do {
            intention = UserNameAndValidation.enterUserIntention();
        } while (intention != 0 && intention != 1 && intention != 2);

        while (intention != 0) {
            if (intention == 1) GameOneGuessTheNumber.startTheGame();
            if (intention == 2) GameTwoRiddleTheNumber.startTheGame();
            do {
                intention = UserNameAndValidation.enterUserIntention();
            } while (intention != 0 && intention != 1 && intention != 2);
        }

        sayGoodBye(userName);
    }

    public static void sayGoodBye(String name) {
        System.out.println("Спасибо за участие, " + name +
                "\nДо свидания!");
    }
}
