/**
 * 0032 = 12:32 am
 * 0202 = 02:02 am
 * 1232 = 12:32 pm
 * 1402 = 02:02 pm
 */
public class KaksNeli {
    public static void main(String[] arg) {
        Kell k1 = new Kell("0032");
        Kell k2 = new Kell("0202");
        Kell k3 = new Kell("1232");
        Kell k4 = new Kell("1402");
        System.out.println(k1.kaksneli());
        System.out.println(k2.kaksneli());
        System.out.println(k3.kaksneli());
        System.out.println(k4.kaksneli());
    }
}