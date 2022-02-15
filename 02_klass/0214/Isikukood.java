public class Isikukood {
    private String kood;
    public Isikukood(String uusKood) {
        kood = uusKood;
    }
    public String sugu() {
        return (Integer.parseInt(kood.substring(0, 1)) % 2 == 0 ? "naine" : "mees");
    }
    public String aastakakstahte() {
        /**
         * if (kood.substring(0, 1).equals("1") || kood.substring(0, 1).equals("2")) {
         *     return "18";
         * } else if (kood.substring(0, 1).equals("3") || kood.substring(0, 1).equals("4")) {
         *     return "19";
         * } else if (kood.substring(0, 1).equals("5") || kood.substring(0, 1).equals("6")) {
         *     return "20";
         * } else {
         *     return "Viga";
         * }
         */
        return String.valueOf(18 + (Integer.parseInt(kood.substring(0, 1)) - 1) / 2);
    }
    public String synniaasta() {
        return aastakakstahte() + kood.substring(1, 3);
    }
}