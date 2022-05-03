public class Proov1 {
    public static void main(String[] arg) {
        Jook jook = new Jook("Piim", 1.0, 110.0);

        Joogipudel jp1 = new Joogipudel(1.5, "Plast", 0.15, 0.1);
        Joogipudel jp2 = new Joogipudel(1.0, "Plast", 0.10, 0.1);

        jp1.jookPudelisse(jook);

        // Täidetud joogipudeli kogumass
        double jp1Kogumass = (0.15 * 1000) + (110.0 * 1.5 * 10);
        if (jp1Kogumass == jp1.kogumass()) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }

        // Tühja joogipudeli kogumass
        double jp2Kogumass = (0.10 * 1000) + (0.0 * 1.0 * 10);
        if (jp2Kogumass == jp2.kogumass()) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }

        // Täidetud joogipudeli omahind
        double jp1Omahind = 1.5 + 0.1;
        if (jp1Omahind == jp1.omahind()) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }

        // Tühja joogipudeli omahind
        double jp2Omahind = 0.0 + 0.1;
        if (jp2Omahind == jp2.omahind()) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }
    }
}