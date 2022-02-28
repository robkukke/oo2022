public class Hulknurk1 {
    double[] x = new double[3];
    double[] y = new double[3];
    public Hulknurk1(double x1, double y1, double x2, double y2, double x3, double y3) {
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
}