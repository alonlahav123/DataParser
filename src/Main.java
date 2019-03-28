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

        String dataCountyFips = Utils.readFileAsString("data/County FIPS Codes.csv");
        ArrayList<CountyFip> resultsCounties = Utils.parseCountyFipsResults(dataCountyFips);

        DataManager main = new DataManager(resultsElec, resultsEduc, resultsUnemp);
        WriteCSV writeCSV = new WriteCSV("data/output.csv");

        for(int i = 0; i < main.getStates().size(); i++) {
            State state = main.getStates().get(i);

            for(int j = 0; j < state.getCounties().size(); j++) {
                County county = state.getCounties().get(j);
                county.setName(findName(county, resultsCounties));
                writeCSV.saveData(county);
            }
        }

        //showData(main);

    }

    private static String findName(County county, ArrayList<CountyFip> resultsCounties) {

        for(int i = 0; i < resultsCounties.size(); i++) {
            CountyFip cFip = resultsCounties.get(i);
            if(cFip.getFipCode() == county.getFips()) {
                return cFip.getCountyName();
            }
        }

        return "unknown";
    }

    public static void showData(DataManager main) {
        for(int s = 0; s < main.getStates().size(); s++) {
            State state = main.getStates().get(s);
            System.out.println("_______________________________________");
            System.out.println(state.getName());

            for(int c = 0; c < state.getCounties().size(); c++) {
                County county = state.getCounties().get(c);

                System.out.println("  --> " + county.getFips());
                System.out.println("     --> " + county.getElec2016());
                //System.out.println("     --> " + county.getEduc2016());
                System.out.println("     --> " + county.getEmploy2016());
            }
        }
    }
}
