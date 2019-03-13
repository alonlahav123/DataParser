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
    }

    public void addCounty(ElectionResult elec) {
        String countyName = elec.getCounty_name();

        if(getCountyIndex(countyName) == -1) {
            createNewCounty(countyName, elec.getCombined_fips());
        } else {
            counties.get(getCountyIndex(countyName)).setData(elec);
        }

    }

    public void addCounty(EducationResult educ) {
        String countyName = educ.getState_abbr();

        if(getCountyIndex(countyName) == -1) {
            createNewCounty(countyName, educ.getFips());
        } else {
            counties.get(getCountyIndex(countyName)).setData(educ);
        }

    }

    public void addCounty(UnemploymentResult employ) {
        String countyName = employ.getState_abbr();

        if(getCountyIndex(countyName) == -1) {
            createNewCounty(countyName, employ.getFips());
        } else {
            counties.get(getCountyIndex(countyName)).setData(employ);
        }

    }

    private void createNewCounty(String countyName, double fips) {
        County county = new County(countyName, fips);
        counties.add(county);
    }

    private int getCountyIndex(String countyName) {

        for(int i = 0; i < counties.size(); i++) {
            if(countyName.equals(counties.get(i).getName())) {
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
