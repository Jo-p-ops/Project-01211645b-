package Converter;

public class CurrencyConverter {
    private static final double USD_TO_GHS = 11.5;
    private static final double EUR_TO_GH = 12.5;
    private static final double YENS_TO_GH = 0.08;


    public double usdToGhs(double usd) {
        return usd / USD_TO_GHS;
    }
    public double ghsToEur(double gh) {
        return gh / EUR_TO_GH;
    }
    public double eurToGhs(double eur) {
        return eur / EUR_TO_GH;
    }
    public double ghsToEUR(double gh) {
        return gh / ghsToEur(gh);
    }
    public double yensToGhs(double yens) {
        return yens / YENS_TO_GH;
    }
    public double yensToEur(double yens) {
        return yens / yensToGhs(yens);
    }


}
