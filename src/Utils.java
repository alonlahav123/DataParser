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
            int commaPlace = outOfPlaceComma(lines[i]);
            String currentLine = lines[i].substring(2,commaPlace) + lines[i].substring(commaPlace+1);

            String[] d = currentLine.split(",");
            ElectionResult New = new ElectionResult(d[0], d[1], d[2], d[3], d[4], d[5], d[6], d[7], d[8], d[9]);
            results.add(New);
        }

        return results;
    }

    private static int outOfPlaceComma(String line) {

        for(int j = 0; j < line.length(); j++) {
            if(line.substring(j,j+1).equals("\"")) {
                return line.indexOf(",", j);
            }
        }

        return -1;
    }
}
