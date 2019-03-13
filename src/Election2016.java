public class Election2016 {
    private double demvotes;
    private double gopVotes;
    private double totalVotes;

    public Election2016(double demvotes, double gopVotes, double totalVotes) {
        this.demvotes = demvotes;
        this.gopVotes = gopVotes;
        this.totalVotes = totalVotes;
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
}
