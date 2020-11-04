import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        File fileObject = new File("C:/Users/josep/Desktop/doc.txt");

        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(fileObject));
            bufferedReader.lines().forEach(System.out::println);
        }
        catch(IOException exception) {
            exception.printStackTrace();
        }

    }

}
