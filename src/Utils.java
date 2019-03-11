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

        String line;
        for(int i = 1; i < lines.length; i++) {
            line = lines[i];

            if(line.contains("\"")) {
                line = removeQuotations(line);
            }
            results.add(getDataPoint(line));
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

    private static EducationResult getDataPointEduc(String line) {
        String[] d = line.split(",");
        return new EducationResult(d[0], d[1], d[2], d[d.length-4], d[d.length-3], d[d.length-2], d[d.length-1]);
    }

    private static UnemploymentResult getDataPointUnemp(String line) {
        String[] d = line.split(",");
        return new UnemploymentResult(d[0], d[1], d[2], d[d.length-10], d[d.length-9], d[d.length-8], d[d.length-7]);
    }

    public static ArrayList<EducationResult> parse2016EducationResults(String data) {
        ArrayList<EducationResult> results = new ArrayList<>();
        String[] lines = data.split("\n");

        String line;
        for(int i = 6; i < lines.length-10; i++) {
            line = lines[i];

            while(line.contains("\"")) {
                line = removeQuotations(line);
            }

            results.add(getDataPointEduc(line));
        }

        return results;
    }

    public static ArrayList<UnemploymentResult> parse2016UnemploymentResults(String data) {
        ArrayList<UnemploymentResult> results = new ArrayList<>();
        String[] lines = data.split("\n");

        String line;
        for(int i = 9; i < lines.length; i++) { //i starts and ends where the data starts and ends
            line = lines[i];

            while(line.contains("\"")) {
                line = removeQuotations(line);
            }

            results.add(getDataPointUnemp(line));
        }

        return results;
    }
}
