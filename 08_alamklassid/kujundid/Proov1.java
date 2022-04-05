import java.util.*;

public class Proov1 {
    public static double kyljePindaladeSumma(ArrayList < Kujund > m) {
        double summa = 0;
        for (Kujund k: m) {
            summa += k.kyljePindala();
        }
        return summa;
    }
    public static void main(String[] arg) {
        ArrayList < Kujund > kd = new ArrayList < Kujund > ();
        Kujund k1 = new Risttahukas(2, 3, 4);
        Kujund k2 = new Risttahukas(2, 3, 4);
        Kujund k3 = new Silinder(1, 1);
        kd.add(k1);
        kd.add(k2);
        kd.add(k3);
        System.out.println(k3.kyljePindala());
        System.out.println(kyljePindaladeSumma(kd));
    }
}