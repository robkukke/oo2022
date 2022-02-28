import java.util.*;

public class LibisevKeskmine2 {
    public static double aritmeetilineKeskmine(double a, double b, double c) {
        return (a + b + c) / 3;
    }
    public static double[] libisevKeskmine(double[] arvud) {
        double[] vastused = new double[arvud.length - 2];
        for (int i = 0; i < vastused.length; i++) {
            vastused[i] = aritmeetilineKeskmine(arvud[i], arvud[i + 1], arvud[i + 2]);
        }
        return vastused;
    }
    public static void main(String[] arg) {
        double[] arvud = {2, 6, 4, 5, 3};
        System.out.println(Arrays.toString(libisevKeskmine(arvud)));
    }
}