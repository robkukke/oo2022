public class Vordkulgne extends Kolmnurk {
    public Vordkulgne(double uusA) {
        a = uusA;
    }
    @Override
    public double korgus() {
        return (a * Math.sqrt(3)) / 2;
    }
}