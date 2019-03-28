public class Election2016 {
    private double demvotes;
    private double gopVotes;
    private double totalVotes;
    private double percentTrumpVotes;

    public Election2016(double demvotes, double gopVotes, double totalVotes) {
        this.demvotes = demvotes;
        this.gopVotes = gopVotes;
        this.totalVotes = totalVotes;
        this.percentTrumpVotes = gopVotes/totalVotes;
    }

    public double getPercentTrumpVotes() {
        return percentTrumpVotes;
    }

    public void setPercentTrumpVotes(double percentTrumpVotes) {
        this.percentTrumpVotes = percentTrumpVotes;
    }

    public double getDemvotes() {
        return demvotes;
    }

    public void setDemvotes(double demvotes) {
        this.demvotes = demvotes;
    }

    public double getGopVotes() {
        return gopVotes;
    }

    public void setGopVotes(double gopVotes) {
        this.gopVotes = gopVotes;
    }

    public double getTotalVotes() {
        return totalVotes;
    }

    public void setTotalVotes(double totalVotes) {
        this.totalVotes = totalVotes;
    }

    @Override
    public String toString() {
        return "Election";
    }
}
