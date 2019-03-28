import java.util.ArrayList;
import java.util.List;

public class State {
    private String name;
    private ArrayList<County> counties;

    public State(String name, ArrayList<County> counties) {
        this.name = name;
        this.counties = counties;
    }

    public State(String name) {
        this.name = name;
        counties = new ArrayList<>();
    }

    public void addCountyElec(ElectionResult elec) {
        double fipNumber = elec.getCombined_fips();

        if(getCountyIndex(fipNumber) == -1) {
            createNewCounty(fipNumber);
        }

        counties.get(getCountyIndex(fipNumber)).setDataElec(elec);
    }

    public void addCountyEduc(EducationResult educ) {
        double fipNumber = educ.getFips();

        if(getCountyIndex(fipNumber) == -1) {
            createNewCounty(fipNumber);
        }

        counties.get(getCountyIndex(fipNumber)).setDataEduc(educ);
    }

    public void addCountyEmploy(UnemploymentResult employ) {
        double fipNumber = employ.getFips();

        if(getCountyIndex(fipNumber) == -1) {
            createNewCounty(fipNumber);
        }

        counties.get(getCountyIndex(fipNumber)).setDataEmploy(employ);
    }

    private void createNewCounty(double fips) {
        County county = new County(fips);
        counties.add(county);
    }

    private int getCountyIndex(double fipNumber) {

        if(counties == null) {
            return -1;
        }
        for(int i = 0; i < counties.size(); i++) {
            if(fipNumber == counties.get(i).getFips()) {
                return i;
            }
        }

        return -1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<County> getCounties() {
        return counties;
    }

    public void setCounties(ArrayList<County> counties) {
        this.counties = counties;
    }
}
