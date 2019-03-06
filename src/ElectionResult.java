public class ElectionResult {
    private static double votes_dem,votes_gop,total_votes,per_dem,per_gop,diff,per_point_diff,combined_fips;
    private static String county_name, state_abbr;

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

    public static double getVotes_dem() {
        return votes_dem;
    }

    public static void setVotes_dem(int votes_dem) {
        ElectionResult.votes_dem = votes_dem;
    }

    public static double getVotes_gop() {
        return votes_gop;
    }

    public static void setVotes_gop(int votes_gop) {
        ElectionResult.votes_gop = votes_gop;
    }

    public static double getTotal_votes() {
        return total_votes;
    }

    public static void setTotal_votes(int total_votes) {
        ElectionResult.total_votes = total_votes;
    }

    public static double getPer_dem() {
        return per_dem;
    }

    public static void setPer_dem(int per_dem) {
        ElectionResult.per_dem = per_dem;
    }

    public static double getPer_gop() {
        return per_gop;
    }

    public static void setPer_gop(int per_gop) {
        ElectionResult.per_gop = per_gop;
    }

    public static double getDiff() {
        return diff;
    }

    public static void setDiff(int diff) {
        ElectionResult.diff = diff;
    }

    public static double getPer_point_diff() {
        return per_point_diff;
    }

    public static void setPer_point_diff(int per_point_diff) {
        ElectionResult.per_point_diff = per_point_diff;
    }

    public static double getCombined_fips() {
        return combined_fips;
    }

    public static void setCombined_fips(int combined_fips) {
        ElectionResult.combined_fips = combined_fips;
    }

    public static String getCounty_name() {
        return county_name;
    }

    public static void setCounty_name(String county_name) {
        ElectionResult.county_name = county_name;
    }

    public static String getState_abbr() {
        return state_abbr;
    }

    public static void setState_abbr(String state_abbr) {
        ElectionResult.state_abbr = state_abbr;
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
