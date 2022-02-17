public class Kell {
    private String kellaaeg;

    public Kell(String uusKellaaeg) {
        kellaaeg = uusKellaaeg;
    }

    public String ampm() {
        if (kellaaeg.startsWith("am", 4)) {
            if (kellaaeg.startsWith("12")) {
                return "00:" + kellaaeg.substring(2, 4);
            } else {
                return kellaaeg.substring(0, 2) + ":" + kellaaeg.substring(2, 4);
            }
        } else if (kellaaeg.startsWith("pm", 4)) {
            if (kellaaeg.startsWith("12")) {
                return "12:" + kellaaeg.substring(2, 4);
            } else {
                return ((Integer.parseInt(kellaaeg.substring(0, 2))) + 12) + ":" + kellaaeg.substring(2, 4);
            }
        } else {
            return "Vigane kellaaeg";
        }
    }

    public String kaksneli() {
        if (kellaaeg.startsWith("00")) {
            return "12:" + kellaaeg.substring(2, 4) + " am";
        } else if (kellaaeg.startsWith("12")) {
            return kellaaeg.substring(0, 2) + ":" + kellaaeg.substring(2, 4) + " pm";
        } else if (Integer.parseInt(kellaaeg.substring(0, 2)) > 12 && Integer.parseInt(kellaaeg.substring(0, 2)) < 24) {
            return ((Integer.parseInt(kellaaeg.substring(0, 2))) - 12) + ":" + kellaaeg.substring(2, 4) + " pm";
        } else {
            return kellaaeg.substring(0, 2) + ":" + kellaaeg.substring(2, 4) + " am";
        }
    }
}