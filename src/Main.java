import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    String theString;
        File fileObject = new File("src/" + getFileName());
        Scanner scanner = null;

        try {
            scanner = new Scanner(fileObject);
        } catch(FileNotFoundException exception) {
            exception.printStackTrace();
        }

        theString = scanner.nextLine();

        while(scanner.hasNextLine()) {
            theString = theString + "\n" + scanner.nextLine();
        }

        char[] madLibArray = theString.toCharArray();

        try {
            questions(madLibArray);
            BufferedReader bufferedReader = new BufferedReader(new FileReader(fileObject));
            bufferedReader.lines().forEach(System.out::println);
        } catch(IOException exception) {
            exception.printStackTrace();
        }
    }

    private static String getFileName() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter file name: ");
        return scanner.next();
    }

    private static void questions(char[] madLibArray) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the following:");

        System.out.print("Plural noun: ");
        String pluralNoun = scanner.nextLine();

        System.out.print("Another plural noun: ");
        String anotherPluralNoun = scanner.nextLine();

        System.out.print("Type of liquid: ");
        String typeOfLiquid = scanner.nextLine();

        System.out.print("Adjective: ");
        String adjective = scanner.nextLine();

        System.out.print("Funny noise: ");
        String funnyNoise = scanner.nextLine();

        System.out.print("Another funny noise: ");
        String anotherFunnyNoise = scanner.nextLine();

        System.out.print("Another adjective: ");
        String anotherAdjective = scanner.nextLine();

        System.out.print("Animal: ");
        String animal = scanner.nextLine();

        System.out.print("Another animal: ");
        String anotherAnimal = scanner.nextLine();

    }
}
