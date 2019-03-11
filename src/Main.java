import java.util.ArrayList;

/***
 * Main class for data parsers
 * @author Alon Lahav
 */
public class Main {
    public static void main(String[] args) {
        // test of utils

        String dataElec = Utils.readFileAsString("data/2016_Presidential_Results.csv");
        String dataEduc = Utils.readFileAsString("data/Education.csv");
        String dataUnemp = Utils.readFileAsString("data/Unemployment.csv");
        //System.out.println(data);

        ArrayList<ElectionResult> resultsElec = Utils.parse2016ElectionResults(dataElec);
        ArrayList<EducationResult> resultsEduc = Utils.parse2016EducationResults(dataEduc);
        ArrayList<UnemploymentResult> resultsUnemp = Utils.parse2016UnemploymentResults(dataUnemp);

        for(int i = 0; i < resultsEduc.size(); i++) {
            System.out.println(i + " ------> " + resultsEduc.get(i));
        }

        DataManager main = new DataManager();


    }
}
