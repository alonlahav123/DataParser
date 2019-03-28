public class County {
    private String name;
    private double fips;
    private Election2016 elec2016;
    private Education2016 educ2016;
    private Employment2016 employ2016;

    public County(String name, double fips) {
        this.name = name;
        this.fips = fips;
        //System.out.println("     ---> " + name);
    }

    public County(double fips) {
        this.fips = fips;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getFips() {
        return fips;
    }

    public void setDataElec(ElectionResult electionResult) {
        Election2016 elec = new Election2016(electionResult.getVotes_dem(), electionResult.getVotes_gop(), electionResult.getTotal_votes());
        elec2016 = elec;
    }

    public void setDataEduc(EducationResult educationResult) {
        Education2016 educ = new Education2016(educationResult.getNoHS(), educationResult.getOnlyHS(), educationResult.getSomeCollege(), educationResult.getBachOrHigher());
        educ2016 = educ;
    }

    public void setDataEmploy(UnemploymentResult unemploymentResult) {
        Employment2016 employ = new Employment2016(unemploymentResult.getTotalLaborForce(), unemploymentResult.getEmployedLaborForce(), unemploymentResult.getUnemployed_2016(), unemploymentResult.getUnemployedPercent(), unemploymentResult.getMedian_Household_Income_2016());
        employ2016 = employ;
    }

    public void setFips(int fips) {
        this.fips = fips;
    }

    public Election2016 getElec2016() {
        return elec2016;
    }

    public void setElec2016(Election2016 elec2016) {
        this.elec2016 = elec2016;
    }

    public Education2016 getEduc2016() {
        return educ2016;
    }

    public void setEduc2016(Education2016 educ2016) {
        this.educ2016 = educ2016;
    }

    public Employment2016 getEmploy2016() {
        return employ2016;
    }

    public void setEmploy2016(Employment2016 employ2016) {
        this.employ2016 = employ2016;
    }
}
