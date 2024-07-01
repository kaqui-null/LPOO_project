package Actions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Dialog{

    private String filePath = "DialogFiles/testFile.txt";

    public String returnLineString(int lineNumber) {
        try (Scanner scanner =  new Scanner(new File(this.filePath))) {
            int currLineNumber = 1;
            String line;
            while (scanner.hasNextLine()) {
                line = scanner.nextLine();
                if (currLineNumber == lineNumber) {
                    return line;
                }
                currLineNumber++;
            }
        } catch (Exception FileNotFoundException) {
            return "File not found";
        }
        return null;
    }
}
