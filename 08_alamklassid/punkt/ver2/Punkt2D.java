class Punkt2D {
    double x, y;
    public Punkt2D(double uusX, double uusY) {
        x = uusX;
        y = uusY;
    }
    public double kaugusNullist() {
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }
}