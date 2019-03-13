public class Employment2016 {
    private double totalLaborForce;
    private double employedLaborForce;
    private double unemployedLaborForce;
    private double unemployedPercent;

    public Employment2016(double totalLaborForce, double employedLaborForce, double unemployedLaborForce, double unemployedPercent) {
        this.totalLaborForce = totalLaborForce;
        this.employedLaborForce = employedLaborForce;
        this.unemployedLaborForce = unemployedLaborForce;
        this.unemployedPercent = unemployedPercent;
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

    public double getUnemployedLaborForce() {
        return unemployedLaborForce;
    }

    public void setUnemployedLaborForce(int unemployedLaborForce) {
        this.unemployedLaborForce = unemployedLaborForce;
    }

    public double getUnemployedPercent() {
        return unemployedPercent;
    }

    public void setUnemployedPercent(double unemployedPercent) {
        this.unemployedPercent = unemployedPercent;
    }
}
