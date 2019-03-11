public class EducationResult {

    private double NoHS, onlyHS, someCollege, BachOrHigher, fips;
    private String countyName, stateName;

    public EducationResult(String fips, String stateName, String countyName, String NoHS, String onlyHS, String someCollege, String BachOrHigher){
        if(NoHS.equals("")) {this.NoHS = 0;} else this.NoHS = Double.parseDouble(NoHS.trim());
        if(onlyHS.equals("")) {this.NoHS = 0;} else this.onlyHS = Double.parseDouble(onlyHS);
        if(someCollege.equals("")) {this.NoHS = 0;} else this.someCollege = Double.parseDouble(someCollege.trim());
        if(BachOrHigher.equals("")) {this.NoHS = 0;} else this.BachOrHigher = Double.parseDouble(BachOrHigher.trim());

        this.fips = Double.parseDouble(fips.trim());
        this.stateName = stateName;
        this.countyName = countyName;
    }


    public double getNoHS() {
        return NoHS;
    }

    public void setNoHS(double noHS) {
        NoHS = noHS;
    }

    public double getOnlyHS() {
        return onlyHS;
    }

    public void setOnlyHS(double onlyHS) {
        this.onlyHS = onlyHS;
    }

    public double getSomeCollege() {
        return someCollege;
    }

    public void setSomeCollege(double someCollege) {
        this.someCollege = someCollege;
    }

    public double getBachOrHigher() {
        return BachOrHigher;
    }

    public void setBachOrHigher(double bachOrHigher) {
        BachOrHigher = bachOrHigher;
    }

    public double getFips() {
        return fips;
    }

    public void setFips(double fips) {
        this.fips = fips;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public String toString() {
        return fips + ", " + stateName + ", " + countyName + ", " + NoHS + ", " + onlyHS + ", " + someCollege  + ", " + BachOrHigher;
    }
}
