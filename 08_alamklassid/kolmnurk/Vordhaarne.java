public class Vordhaarne extends Kolmnurk {
    double b;
    public Vordhaarne(double uusA, double uusB) {
        a = uusA;
        b = uusB;
    }
    @Override
    public double korgus() {
        return Math.sqrt(Math.pow(b, 2) - Math.pow((a / 2), 2));
    }
}