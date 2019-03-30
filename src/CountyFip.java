public class CountyFip {
    private int fipCode;
    private String countyName;

    public CountyFip(int fipCode, String countyName) {
        this.countyName = countyName;
        this.fipCode = fipCode;
    }

    public int getFipCode() {
        return fipCode;
    }

    public void setFipCode(int fipCode) {
        this.fipCode = fipCode;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    @Override
    public String toString() {
        return "CountyFip{" +
                "fipCode=" + fipCode +
                ", countyName='" + countyName + '\'' +
                '}';
    }
}
