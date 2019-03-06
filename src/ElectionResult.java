public class ElectionResult {
    private double votes_dem,votes_gop,total_votes,per_dem,per_gop,diff,per_point_diff,combined_fips;
    private String county_name, state_abbr;

    public ElectionResult(String votes_dem, String votes_gop,String total_votes, String per_dem, String per_gop, String diff, String per_point_diff, String state_abbr, String county_name, String combined_fips) {
        this.votes_dem = Double.parseDouble(votes_dem);
        this.votes_gop = Double.parseDouble(votes_gop);
        this.total_votes = Double.parseDouble(total_votes);
        this.per_dem = Double.parseDouble(per_dem);
        this.per_gop = Double.parseDouble(per_gop);
        this.diff = Double.parseDouble(diff);
        this.per_point_diff = takeOutPercent(per_point_diff);
        this.state_abbr = state_abbr;
        this.county_name = county_name;
        this.combined_fips = Double.parseDouble(combined_fips);
    }

    public double getVotes_dem() {
        return votes_dem;
    }

    public void setVotes_dem(double votes_dem) {
        this.votes_dem = votes_dem;
    }

    public double getVotes_gop() {
        return votes_gop;
    }

    public void setVotes_gop(double votes_gop) {
        this.votes_gop = votes_gop;
    }

    public double getTotal_votes() {
        return total_votes;
    }

    public void setTotal_votes(double total_votes) {
        this.total_votes = total_votes;
    }

    public double getPer_dem() {
        return per_dem;
    }

    public void setPer_dem(double per_dem) {
        this.per_dem = per_dem;
    }

    public double getPer_gop() {
        return per_gop;
    }

    public void setPer_gop(double per_gop) {
        this.per_gop = per_gop;
    }

    public double getDiff() {
        return diff;
    }

    public void setDiff(double diff) {
        this.diff = diff;
    }

    public double getPer_point_diff() {
        return per_point_diff;
    }

    public void setPer_point_diff(double per_point_diff) {
        this.per_point_diff = per_point_diff;
    }

    public double getCombined_fips() {
        return combined_fips;
    }

    public void setCombined_fips(double combined_fips) {
        this.combined_fips = combined_fips;
    }

    public String getCounty_name() {
        return county_name;
    }

    public void setCounty_name(String county_name) {
        this.county_name = county_name;
    }

    public String getState_abbr() {
        return state_abbr;
    }

    public void setState_abbr(String state_abbr) {
        this.state_abbr = state_abbr;
    }

    private double takeOutQuotes(String diff) {
        String withoutPercent = diff.substring(1, diff.length()-1);

        return Double.parseDouble(withoutPercent);
    }

    private double takeOutPercent(String per_point_diff) {
        String withoutPercent = per_point_diff.substring(0, per_point_diff.length()-1);

        return Double.parseDouble(withoutPercent);
    }

    public String toString() {
        return votes_dem + " , " + votes_gop + " , " + total_votes + " , " + per_dem + " , " + per_gop + " , " +
                diff + " , " + per_point_diff + " , " + state_abbr + " , " + county_name + " , " + combined_fips;
    }

}
