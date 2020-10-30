import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
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

        String plural_noun = "boys";
        String another_plural_noun = "girls";
        String type_of_liquid = "lemonade";
        String adjective = "fuzzy";
        String funny_noise = "squeak";
        String another_funny_noise = "snort";
        String another_adjective = "hungry";
        String animal = "mouse";
        String another_animal = "blue-fin tuna";

        System.out.println("Zoos are places where wild " + plural_noun + " are kept in pens or " +
                "cages\nso that " + another_plural_noun + " can come and look at them. There is a" +
                " zoo\nin the park beside the " + type_of_liquid + " fountain. When it is " +
                "feeding time,\nall the animals make " + adjective + " noises. The elephant goes " + "\"" +
                funny_noise + "\"" + "\nand the turtledoves go " + "\"" + another_funny_noise +
                "\"" + ". My favorite animal is the\n" + another_adjective + " " + animal + ", so fast it can outrun " +
                "a/an " + another_animal + ".\nYou never know what you will find at the zoo.");

        System.out.println(" ");
        System.out.println("Do you want to play again (y/n)?");
        System.out.println("Thank you for playing.");
    }
}
