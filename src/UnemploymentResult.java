public class UnemploymentResult {
    double totalLaborForce, employedLaborForce, Unemployed_2016, unemployedPercent, fips, Median_Household_Income_2016;
    String countyName, state_abbr;

    public UnemploymentResult(String fips, String stateName, String countyName, String totalLaborForce, String employedLaborForce, String Unemployed_2016, String unemployedPercent, String Median_Household_Income_2016) {
        this.totalLaborForce = Double.parseDouble(totalLaborForce);
        this.employedLaborForce = Double.parseDouble(employedLaborForce);
        this.Unemployed_2016 = Double.parseDouble(Unemployed_2016);
        this.unemployedPercent = Double.parseDouble(unemployedPercent);
        this.fips = Double.parseDouble(fips);
        this.countyName = countyName;
        this.state_abbr = stateName;
        this.Median_Household_Income_2016 = Double.parseDouble(removeDollarSign(Median_Household_Income_2016));
    }

    private String removeDollarSign(String word) {

        for(int i = 0; i < word.length(); i++) {
            String letter = word.substring(i, i+1);

            if(letter.equals("$")) {
                return word.substring(i+1);
            }
        }

        return word;
    }

    public double getMedian_Household_Income_2016() {
        return Median_Household_Income_2016;
    }

    public void setMedian_Household_Income_2016(double median_Household_Income_2016) {
        Median_Household_Income_2016 = median_Household_Income_2016;
    }

    public double getTotalLaborForce() {
        return totalLaborForce;
    }

    public void setTotalLaborForce(double totalLaborForce) {
        this.totalLaborForce = totalLaborForce;
    }

    public double getEmployedLaborForce() {
        return employedLaborForce;
    }

    public void setEmployedLaborForce(double employedLaborForce) {
        this.employedLaborForce = employedLaborForce;
    }

    public double getUnemployed_2016() {
        return Unemployed_2016;
    }

    public void setUnemployed_2016(double Unemployed_2016) {
        this.Unemployed_2016 = Unemployed_2016;
    }

    public double getUnemployedPercent() {
        return unemployedPercent;
    }

    public void setUnemployedPercent(double unemployedPercent) {
        this.unemployedPercent = unemployedPercent;
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

    public String getState_abbr() {
        return state_abbr;
    }

    public void setState_abbr(String state_abbr) {
        this.state_abbr = state_abbr;
    }

    @Override
    public String toString() {
        return fips + ", " + state_abbr + ", " + countyName + ", " + totalLaborForce  + ", " + employedLaborForce + ", " + Unemployed_2016 + ", " + unemployedPercent + ", " + Median_Household_Income_2016;
    }
}
