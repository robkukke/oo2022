public class Hulknurk2 {
    double[] x = new double[4];
    double[] y = new double[4];
    public Hulknurk2(double x1, double y1, double x2, double y2, double x3, double y3) {
        x[0] = x1;
        x[1] = x2;
        x[2] = x3;
        y[0] = y1;
        y[1] = y2;
        y[2] = y3;
    }
    public void tryki() {
        for (int i = 0; i < x.length; i++) {
            System.out.println(x[i] + " " + y[i]);
        }
    }
    double kaugus(double ax, double ay, double bx, double by) {
        double dx = bx - ax;
        double dy = by - ay;
        return Math.sqrt(dx * dx + dy * dy);
    }
    public double lisa(double x4, double y4) {
        x[3] = x4;
        y[3] = y4;
        double p1 = kaugus(x[0], y[0], x[1], y[1]);
        double p2 = kaugus(x[0], y[0], x[3], y[3]);
        double p3 = kaugus(x[1], y[1], x[2], y[2]);
        double p4 = kaugus(x[2], y[2], x[3], y[3]);
        return p1 + p2 + p3 + p4;
    }
}