public class UnemploymentResult {
    double totalLaborForce, employedLabotForce, unemployedLaborForce, unemployedPercent, fips;
    String countyName, stateName;

    public UnemploymentResult(String fips, String countyName, String stateName, String totalLaborForce, String employedLabotForce, String unemployedLaborForce, String unemployedPercent) {
        this.totalLaborForce = Double.parseDouble(totalLaborForce);
        this.employedLabotForce = Double.parseDouble(employedLabotForce);
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

    public double getEmployedLabotForce() {
        return employedLabotForce;
    }

    public void setEmployedLabotForce(double employedLabotForce) {
        this.employedLabotForce = employedLabotForce;
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
        return "UnemploymentResult{" +
                "totalLaborForce=" + totalLaborForce +
                ", employedLabotForce=" + employedLabotForce +
                ", unemployedLaborForce=" + unemployedLaborForce +
                ", unemployedPercent=" + unemployedPercent +
                ", fips=" + fips +
                ", countyName='" + countyName + '\'' +
                ", stateName='" + stateName + '\'' +
                '}';
    }
}
