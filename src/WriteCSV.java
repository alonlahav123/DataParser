import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;

public class WriteCSV {
    private String filepath;

    public WriteCSV(String filepath) {
        this.filepath = filepath;
    }

    public void saveData(County county) {
        Employment2016 employ = county.getEmploy2016();
        Election2016 elec = county.getElec2016();

        try{
            FileWriter fw = new FileWriter(filepath, true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);

            pw.println(county.getFips() + "," +  county.getName() + ","+ employ.getMedian_Household_Income_2016() + "," + employ.getUnemployedPercent() + "," + elec.getPercentTrumpVotes());
            pw.flush();
            pw.close();
        } catch (Exception E) {
            System.out.println("Did not work    ---    " + county.getFips());
        }
    }
}
