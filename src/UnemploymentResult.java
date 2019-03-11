public class UnemploymentResult {
    double totalLaborForce, employedLaborForce, unemployedLaborForce, unemployedPercent, fips;
    String countyName, stateName;

    public UnemploymentResult(String fips, String stateName, String countyName, String totalLaborForce, String employedLaborForce, String unemployedLaborForce, String unemployedPercent) {
        this.totalLaborForce = Double.parseDouble(totalLaborForce);
        this.employedLaborForce = Double.parseDouble(employedLaborForce);
        this.unemployedLaborForce = Double.parseDouble(unemployedLaborForce);
        this.unemployedPercent = Double.parseDouble(unemployedPercent);
        this.fips = Double.parseDouble(fips);
        this.countyName = countyName;
        this.stateName = stateName;
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

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    @Override
    public String toString() {
        return fips + ", " + stateName  + ", " + countyName + ", " + totalLaborForce  + ", " + employedLaborForce + ", " + unemployedLaborForce + ", " + unemployedPercent;
    }
}
