public class Tavaline extends Kolmnurk {
    double korgus;
    public Tavaline(double uusA, double uusKorgus) {
        a = uusA;
        korgus = uusKorgus;
    }
    @Override
    public double korgus() {
        return korgus;
    }
}