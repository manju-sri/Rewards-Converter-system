public class RewardValue {
    private double cashValue;
    private double milesValue;
    private static final double milesToCashRate = 0.0035;
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
    }
    public RewardValue(double milesValue, boolean isMiles) {
        this.milesValue= milesValue;
    }

    public String getMilesValue() {
        this.milesValue = cashValue / milesToCashRate;
        return String.format("%.2f", milesValue);
    }

    public String getCashValue(){
        this.cashValue = milesValue * milesToCashRate;
        return String.format("%.2f", cashValue);
    }

}
