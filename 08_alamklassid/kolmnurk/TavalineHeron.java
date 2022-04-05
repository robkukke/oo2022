public class TavalineHeron extends Kolmnurk {
    double b, c, s;
    public TavalineHeron(double uusA, double uusB, double uusC) {
        a = uusA;
        b = uusB;
        c = uusC;
    }
    @Override
    public double korgus() {
        return 0;
    }
    public double pindala() {
        s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
}