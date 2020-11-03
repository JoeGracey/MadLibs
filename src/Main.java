
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scannerObject = new Scanner(System.in);

        String[] madLibWords = new String[] {"boys", "girls", "lemonade", "fuzzy", "squeak",
                "snort", "hungry", "mouse", "blue-fin tuna"};

        System.out.println("Zoos are places where wild " + madLibWords[0] + " are kept in pens or" +
                " " + "cages\nso that " + madLibWords[1] + " can come and look at them. There is " +
                "a" + " zoo\nin the park beside the " + madLibWords[2] + " fountain. When it is " +
                "feeding time,\nall the animals make " + madLibWords[3] + " noises. The elephant " +
                "goes " + "\"" + madLibWords[4] + "\"" + "\nand the turtledoves go " + "\"" + madLibWords[5] +
                "\"" + ". My favorite animal is the\n" + madLibWords[6] + " " + madLibWords[7] +
                ", so " + "fast it can outrun " + "a/an " + madLibWords[8] + ".\nYou never know " +
                "what you will find at the zoo.");

        System.out.println(" ");

        System.out.println("Do you want to play again (y/n)?");
        String playAgain = scannerObject.nextLine();

        if(playAgain.equals("y") || playAgain.equals("Y")) {
            //print out paragraph again

        } else if (playAgain.equals("n") || playAgain.equals("N")){
            System.out.println("Thank you for playing.");
        } else {
            System.out.println("Please enter Y or N");
        }
    }


}
