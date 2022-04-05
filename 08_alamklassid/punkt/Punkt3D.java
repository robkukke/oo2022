class Punkt3D extends Punkt2D {
    double z;
    public Punkt3D(double uusX, double uusY, double uusZ) {
        super(uusX, uusY);
        z = uusZ;
    }
    public double kaugusNullist3D() {
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(z, 2));
    }
    public double kaugusNullist() {
        return kaugusNullist3D();
    }
}