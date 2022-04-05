class Punkt2D {
    double x, y;
    public Punkt2D() {
        this(0, 0);
    }
    public Punkt2D(double uusX, double uusY) {
        x = uusX;
        y = uusY;
    }
    public double kaugusNullist2D() {
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }
    public double kaugusNullist() {
        return kaugusNullist2D();
    }
}