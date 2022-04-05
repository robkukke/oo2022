public class Risttahukas extends Kujund {
    double pikkus, laius;
    public Risttahukas(double uusPikkus, double uusLaius, double uusKorgus) {
        // super();
        pikkus = uusPikkus;
        laius = uusLaius;
        korgus = uusKorgus;
    }
    @Override
    public double pohjaYmbermoot() {
        return (2 * laius) + (2 * pikkus);
    }
}
// Lisage kujundina Silinder (raadius, korgus), katsetage kujundite massiivis