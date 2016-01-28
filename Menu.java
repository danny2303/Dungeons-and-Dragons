package dungeonsanddragons;

public class Menu {

    static game game = new game();
    static Input input = new Input();
}

class game {

    static Input input = new Input();
    static Function function = new Function();
    static Run run = new Run();
    static boolean startedGame;
    static String[] mainMenuChoices;

    public static void game() {
        mainMenuChoices = new String[12];
    }

    public String[][] defineArrays() {
        String[][] menuChoices;
        menuChoices = new String[2][5];

        System.out.println("These options are case sensitive");
        System.out.println("");
        
        menuChoices[0][0] = "Resume";
        menuChoices[0][1] = "New Game";
        menuChoices[0][2] = "Options";
        menuChoices[0][3] = "Achievements";
        menuChoices[0][4] = "Help";

        menuChoices[1][0] = "Tips?";
        menuChoices[1][1] = "Tutorial?";
        return menuChoices;
    }

    public void mainMenu() {
        displayMenuScreen("Main", "If you are new to this game, type 'Help' and then 'Tutorial'.");
        String userInput = displayOptions(5, 0, defineArrays());
        decipherUserInput(userInput);
    }

    public void helpMenu() {
        displayMenuScreen("Help", "");
        String userInput = displayOptions(2, 1, defineArrays());
        decipherUserInput(userInput);
    }

    public void displayMenuScreen(String menuName, String caption) {
        System.out.println(menuName + " Menu:");
        function.pause(700);
        System.out.println(caption);
        function.pause(1000);
        System.out.println("");
        System.out.println("");
    }

    public String displayOptions(int displayNumber, int menuNumber, String[][] options) {
        for (int i = 0; i < displayNumber; i++) {
            System.out.println(options[menuNumber][i]);
        }

        if (startedGame == true) {
            System.out.println("Resume?");
        }

        function.pause(700);
        System.out.println("");
        System.out.println("");
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------");
        function.pause(700);
        String userInput = getUserInputPrompt("");
        return userInput;
    }

    public void decipherUserInput(String userInput) {
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------");
        switch (userInput) {
            case "Help":
                helpMenu();
                break;

            case "Tutorial":
                function.playTutorial();
                break;

            case "New Game":
                run.script();
                break;
            default:
                
                System.out.println("!ERROR!   Invalid input:   Try again!");
                String userInput2 = getUserInputPrompt("");
                decipherUserInput(userInput2);
                break;
        }
    }

    public String getUserInputPrompt(String prompt) {
        String userInput = input.getUserInput(prompt);
        return userInput;
    }
}