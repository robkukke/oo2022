public class Murrud {
    public static String segaarv(String murd) {
        int murdIndeks = murd.indexOf("/");
        int lugeja = Integer.parseInt(murd.substring(0, murdIndeks));
        int nimetaja = Integer.parseInt(murd.substring(murdIndeks + 1));
        if (lugeja == nimetaja) {
            return "1";
        }
        if (lugeja > nimetaja) {
            int taisarv = lugeja / nimetaja;
            int uusLugeja = lugeja - (taisarv * nimetaja);
            return Integer.toString(taisarv) + " " + Integer.toString(uusLugeja) + "/" + Integer.toString(nimetaja);
        }
        return murd + " ei ole segaarv";
    }
    public static String liidaKaksMurdu(String murd1, String murd2) {
        int murd1Indeks = murd1.indexOf("/");
        int murd2Indeks = murd2.indexOf("/");
        int lugeja1 = Integer.parseInt(murd1.substring(0, murd1Indeks));
        int nimetaja1 = Integer.parseInt(murd1.substring(murd1Indeks + 1));
        int lugeja2 = Integer.parseInt(murd2.substring(0, murd2Indeks));
        int nimetaja2 = Integer.parseInt(murd2.substring(murd2Indeks + 1));
        int uusLugeja = (lugeja1 * nimetaja2) + (lugeja2 * nimetaja1);
        int uusNimetaja = nimetaja1 * nimetaja2;
        return Integer.toString(uusLugeja) + "/" + Integer.toString(uusNimetaja);
    }
    public static String taanda(String murd) {
        int murdIndeks = murd.indexOf("/");
        int lugeja = Integer.parseInt(murd.substring(0, murdIndeks));
        int nimetaja = Integer.parseInt(murd.substring(murdIndeks + 1));

        // LCM (least common multiple), vähim ühiskordne
        int suuremNumber = Math.max(lugeja, nimetaja);
        int vaiksemNumber = Math.min(lugeja, nimetaja);
        int lcm = suuremNumber;
        while (lcm % vaiksemNumber != 0) {
            lcm += suuremNumber;
        }

        // GCD (greatest common divisor), suurim ühistegur
        int gcd = (lugeja * nimetaja) / lcm;

        int taandatudLugeja = lugeja / gcd;
        int taandatudNimetaja = nimetaja / gcd;

        return Integer.toString(taandatudLugeja) + "/" + Integer.toString(taandatudNimetaja);
    }
    public static void main(String[] arg) {
        System.out.println(segaarv("7/4"));
        System.out.println(segaarv("7/7"));
        System.out.println(segaarv("3/4"));
        System.out.println(liidaKaksMurdu("2/5", "2/7"));
        System.out.println(taanda("5/15"));
        System.out.println(segaarv(taanda(liidaKaksMurdu("2/5", "2/10"))));
    }
}