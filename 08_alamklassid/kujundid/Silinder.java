public class Silinder extends Kujund {
    double raadius;
    public Silinder(double uusRaadius, double uusKorgus) {
        raadius = uusRaadius;
        korgus = uusKorgus;
    }
    @Override
    public double pohjaYmbermoot() {
        return 2 * Math.PI * raadius;
    }
}