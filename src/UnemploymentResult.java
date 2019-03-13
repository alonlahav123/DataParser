public class UnemploymentResult {
    double totalLaborForce, employedLaborForce, unemployedLaborForce, unemployedPercent, fips;
    String countyName, state_abbr;

    public UnemploymentResult(String fips, String stateName, String countyName, String totalLaborForce, String employedLaborForce, String unemployedLaborForce, String unemployedPercent) {
        this.totalLaborForce = Double.parseDouble(totalLaborForce);
        this.employedLaborForce = Double.parseDouble(employedLaborForce);
        this.unemployedLaborForce = Double.parseDouble(unemployedLaborForce);
        this.unemployedPercent = Double.parseDouble(unemployedPercent);
        this.fips = Double.parseDouble(fips);
        this.countyName = countyName;
        this.state_abbr = stateName;
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

    public double getUnemployedLaborForce() {
        return unemployedLaborForce;
    }

    public void setUnemployedLaborForce(double unemployedLaborForce) {
        this.unemployedLaborForce = unemployedLaborForce;
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
        return fips + ", " + state_abbr + ", " + countyName + ", " + totalLaborForce  + ", " + employedLaborForce + ", " + unemployedLaborForce + ", " + unemployedPercent;
    }
}
