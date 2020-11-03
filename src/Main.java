//import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String[] madLibWords = new String[] {"boys", "girls", "lemonade", "fuzzy", "squeak",
                "snort", "hungry", "mouse", "blue-fin tuna"};

	    /*
	    Zoos are places where :plural_noun are kept in pens or cages :!
	    so that :plural_noun can come and look at them :. There is a zoo :!
	    in the park beside the :type_of_liquid fountain :. When it is feeding time :, :!
	    all the animals make :adjective noises. The elephant goes :< :funny_noise :> :!
	    and the turtledoves go :< :another_funny_noise :. :> My favorite animal is the :!
	    :adjective :animal :, so fast it can outrun a/an :another_animal :. :!
	    You never know what you will find at the zoo :.

	    Do you want to play again (y/n)? n
	    Thank you for playing.

	    :! = newline, :, = comma, :. = period, :< :> = quotes
	     */

        //Scanner scannerObject = new Scanner(System.in);

        System.out.println();

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
        System.out.println("Thank you for playing.");
    }


}
