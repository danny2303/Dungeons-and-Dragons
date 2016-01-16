package dungeonsanddragons;

import static dungeonsanddragons.DungeonsAndDragons.menu;

public class Function {

    static JavaAudioPlaySoundExample javaAudioPlaySoundExample = new JavaAudioPlaySoundExample();
    static Input input = new Input();
    static Menu menu = new Menu();

    public void playTutorial() {
        try {
            javaAudioPlaySoundExample.playJavaAudioPlaySoundExample("StringAccent.wav");
        } catch (Exception e) {
            System.out.println("!ERROR! Couldn't play sound");

        }
        System.out.println("Ah... you must be new!  Welcome to Dungeons and Dragons!");
        pause(1000);
        System.out.println("Dungeons and Dragons is a simple game where you work your way through the world, fighting monsters and gaining items.");
        confirm("ok");
        pause(1000);
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Your character has 4 statistics: hp, attack, defence and stealth.");
        pause(1000);
        System.out.println("Attack is how much damage you do without any weapn, defence is what is subtracted from the damage you take and stealth can be used to sneak past enimies.");
        confirm("ok");
        pause(3000);
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------");
        menu.game.mainMenu();
    }

    public void confirm(String requiredAnswer) {
        pause(700);
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------");
        pause(700);
        String userInput = input.getUserInput("Type " + requiredAnswer + " to continue.");
        if (userInput.equals(requiredAnswer)) {

        } else {
            System.out.println("!ERROR!   Invalid input:   Try again!");
            confirm(requiredAnswer);
        }
    }

    public void pause(int pauseNum) {
        try {
            Thread.sleep(pauseNum);
        } catch (InterruptedException e) {
        }
    }

    public void print(String input) {
        System.out.println(input);
    }

}
