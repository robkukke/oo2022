/**
 * 1232am = 00:32
 * 0202am = 02:02
 * 1232pm = 12:32
 * 0202pm = 14:02
 */
public class AmPm {
    public static void main(String[] arg) {
        Kell k1 = new Kell("1232am");
        Kell k2 = new Kell("0202am");
        Kell k3 = new Kell("1232pm");
        Kell k4 = new Kell("0202pm");
        System.out.println(k1.ampm());
        System.out.println(k2.ampm());
        System.out.println(k3.ampm());
        System.out.println(k4.ampm());
    }
}