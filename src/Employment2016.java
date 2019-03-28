public class Employment2016 {
    private double totalLaborForce;
    private double employedLaborForce;
    private double Unemployed_2016;
    private double unemployedPercent;
    private double Median_Household_Income_2016;

    public Employment2016(double totalLaborForce, double employedLaborForce, double Unemployed_2016, double unemployedPercent, double Median_Household_Income_2016) {
        this.totalLaborForce = totalLaborForce;
        this.employedLaborForce = employedLaborForce;
        this.Unemployed_2016 = Unemployed_2016;
        this.unemployedPercent = unemployedPercent;
        this.Median_Household_Income_2016 = Median_Household_Income_2016;
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

    public void setTotalLaborForce(int totalLaborForce) {
        this.totalLaborForce = totalLaborForce;
    }

    public double getEmployedLaborForce() {
        return employedLaborForce;
    }

    public void setEmployedLaborForce(int employedLaborForce) {
        this.employedLaborForce = employedLaborForce;
    }

    public double getUnemployed_2016() {
        return Unemployed_2016;
    }

    public void setUnemployed_2016(int Unemployed_2016) {
        this.Unemployed_2016 = Unemployed_2016;
    }

    public double getUnemployedPercent() {
        return unemployedPercent;
    }

    public void setUnemployedPercent(double unemployedPercent) {
        this.unemployedPercent = unemployedPercent;
    }

    public String toString() {
        return "Employment";
    }
}
