public class Massiiv1 {
    public static void main(String[] arg) {
        String[] eesnimed = new String[3];
        eesnimed[0] = "Juku";
        eesnimed[1] = "Kati";
        eesnimed[2] = "Mati";
        System.out.println(eesnimed[1]);
        System.out.println(eesnimed.length);
        for (String s: eesnimed) {
            System.out.println(s);
        }
    }
}