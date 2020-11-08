import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    String[][] theString = new String[255][255];
        File fileObject = new File("src/" + getFileName());
        Scanner scanner = null;

        try {
            scanner = new Scanner(fileObject);
        } catch(FileNotFoundException exception) {
            exception.printStackTrace();
        }

        int count = 0;
        
        String text = null; 
        while(scanner.hasNextLine()) {
            text = scanner.next();
            theString[count].pu
            System.out.println(text.length());
        }

        try {
            questions(text);
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

    private static void questions(String madLibArray) {
        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i <= madLibArray.length(); i++) {
            System.out.println(madLibArray.length());
        }

    }
}
