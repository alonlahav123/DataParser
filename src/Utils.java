import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Utils {

    public static String readFileAsString(String filepath) {
        StringBuilder output = new StringBuilder();

        try (Scanner scanner = new Scanner(new File(filepath))) {

            while (scanner.hasNext()) {
                String line = scanner.nextLine();
                output.append(line + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return output.toString();
    }

    public static ArrayList<ElectionResult> parse2016ElectionResults(String data) {
        ArrayList<ElectionResult> results = new ArrayList<>();
        String[] lines = data.split("\n");

        for(int i = 0; i < lines.length; i++) {
            String[] d = data.split(",");
            ElectionResult e = new ElectionResult(d[1], d[2], d[3], d[4], d[5], d[6], d[7], d[8], d[9], d[10]);
            results.add(e);
        }

        return results;
    }
}
