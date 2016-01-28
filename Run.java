package dungeonsanddragons;

public class Run {

    static Function function = new Function();
    
    
    static String location;
    static String description;
    
    
    static Input input = new Input();
    static String[] menuChoices;

    public static void Game() {
        menuChoices = new String[12];
    }

    public static String[][] defineArrays() {
        String[][] menuChoices;
        menuChoices = new String[1][5];

        System.out.println("These options are case sensitive and require you to remove capitals");
        System.out.println("");
        
        menuChoices[0][0] = "Describe";
        menuChoices[0][1] = "Pick";
        menuChoices[0][2] = "Move";
        menuChoices[0][3] = "---";
        menuChoices[0][4] = "---";

        return menuChoices;
    }

    public static void displayMenuScreen(String menuName, String caption) {
        System.out.println(menuName + " Menu:");
        function.pause(700);
        System.out.println(caption);
        function.pause(1000);
        System.out.println("");
        System.out.println("");
    }

    public static String displayOptions(int displayNumber, int menuNumber, String[][] options) {
        for (int i = 0; i < displayNumber; i++) {
            System.out.println(options[menuNumber][i]);
        }

        function.pause(700);
        System.out.println("");
        System.out.println("");
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------");
        function.pause(700);
        String userInput = getUserInputPrompt("");
        return userInput;
    }

    public static void decipherUserInput(String userInput) {
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------");
        switch (userInput) {
            case "describe":
                describe();
                break;
            case "pick":
                describe();
                break;
            case "move":
                describe();
                break;
            default:
                System.out.println("!ERROR!   Invalid input:   Try again!");
                String userInput2 = getUserInputPrompt("");
                decipherUserInput(userInput2);
                break;
        }
    }

    public static String getUserInputPrompt(String prompt) {
        String userInput = input.getUserInput(prompt);
        return userInput;
    }

    public static void menu() {
        //displayMenuScreen("");
        String userInput = displayOptions(5, 0, defineArrays());
        decipherUserInput(userInput);
    }

    public static void describe(){
        function.print("It is " + description);
    }

    public static void script() {
        roomName();
       menu();
        function.print("You are in " + location);
    }

    public static void roomName() {
        String location = ("location");
        String description = ("description");
    }
}
