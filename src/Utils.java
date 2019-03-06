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

        for(int i = 1; i < lines.length; i++) {
            String line = lines[i];
            ElectionResult d;

            if(line.indexOf("\"") == -1 ) {
                d = getDataPoint(line);
            } else {
                String newLine = removeQuotations(line);
                d = getDataPoint(newLine);
            }

            results.add(d);
        }

        return results;
    }

    private static String removeQuotations(String line) {
        int start = line.indexOf("\"");
        int end = line.indexOf( "\"" , start+1);
        String num = "";

        for(int i = start; i < end; i++) {
            String letter = line.substring(i, i+1);

            if(!letter.equals("\"") && !letter.equals(",")) {
                num += letter;
            }
        }

        String data = line.substring(0, start) + num + line.substring(end+1);

        return data;
    }

    private static ElectionResult getDataPoint(String line) {
        String[] d = line.split(",");
        return new ElectionResult(d[1], d[2], d[3], d[4], d[5], d[6], d[7], d[8], d[9], d[10]);
    }

}
