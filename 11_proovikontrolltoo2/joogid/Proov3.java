import java.util.*;

public class Proov3 {
    public static void main(String[] arg) {
        Jook jook = new Jook("Piim", 1.0, 110.0);

        Joogipudel jp1 = new Joogipudel(1.5, "Plast", 0.15, 0.1);
        Joogipudel jp2 = new Joogipudel(1.5, "Plast", 0.15, 0.1);
        Joogipudel jp3 = new Joogipudel(1.5, "Plast", 0.15, 0.1);
        Joogipudel jp4 = new Joogipudel(1.5, "Plast", 0.15, 0.1);
        Joogipudel jp5 = new Joogipudel(1.5, "Plast", 0.15, 0.1);
        Joogipudel jp6 = new Joogipudel(1.5, "Plast", 0.15, 0.1);
        Joogipudel jp7 = new Joogipudel(1.5, "Plast", 0.15, 0.1);

        jp1.jookPudelisse(jook);
        jp2.jookPudelisse(jook);
        jp3.jookPudelisse(jook);
        jp4.jookPudelisse(jook);

        ArrayList < Joogipudel > taidetudJoogipudelid1 = new ArrayList < > ();
        taidetudJoogipudelid1.add(jp1);
        taidetudJoogipudelid1.add(jp2);
        taidetudJoogipudelid1.add(jp3);

        ArrayList < Joogipudel > taidetudJoogipudelid2 = new ArrayList < > ();
        taidetudJoogipudelid2.add(jp1);
        taidetudJoogipudelid2.add(jp2);
        taidetudJoogipudelid2.add(jp4);

        ArrayList < Joogipudel > tyhjadJoogipudelid = new ArrayList < > ();
        tyhjadJoogipudelid.add(jp5);
        tyhjadJoogipudelid.add(jp6);
        tyhjadJoogipudelid.add(jp7);

        Joogivaat jv = new Joogivaat(0.3, 50.0);

        jv.vaadiTaitmine(jook);

        JoogipudeliteKast jpk1 = new JoogipudeliteKast("Plast", 5.0, 1500.0, 4);
        JoogipudeliteKast jpk2 = new JoogipudeliteKast("Plast", 5.0, 1500.0, 3);
        JoogipudeliteKast jpk3 = new JoogipudeliteKast("Plast", 5.0, 1500.0, 2);
        JoogipudeliteKast jpk4 = new JoogipudeliteKast("Plast", 5.0, 1500.0, 3);

        // Tühja kasti mass
        double jpk1KastiKogumass = 1500.0;
        if (jpk1KastiKogumass == jpk1.kastiKogumass()) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }

        // Tühja kasti omahind
        double jpk1KastiOmahind = 5.0;
        if (jpk1KastiOmahind == jpk1.kastiOmahind()) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }

        // Kasti täitmine (pesade arv on suurem kui joogipudelite arv)
        jpk1.kastiTaitmine(taidetudJoogipudelid1);
        if (jpk1.joogipudelidKastis.size() == 3) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }

        // Kasti täitmine (pesade arv on võrdne joogipudelite arvuga)
        jpk2.kastiTaitmine(taidetudJoogipudelid2);
        if (jpk2.joogipudelidKastis.size() == 3) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }

        // Kasti täitmine (pesade arv on väiksem kui joogipudelite arv)
        jpk3.kastiTaitmine(taidetudJoogipudelid1);
        if (jpk3.joogipudelidKastis.size() == 2) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }

        // Kasti ja sinna kuuluvate pudelite ühine mass
        double jpk2KastiKogumass = (((0.15 * 1000) + (110.0 * 1.5 * 10)) * 3) + 1500.0;
        if (jpk2KastiKogumass == jpk2.kastiKogumass()) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }

        // Kasti ja sinna kuuluvate pudelite omahind
        double jpk2KastiOmahind = ((1.5 + 0.1) * 3) + 5.0;
        if (jpk2KastiOmahind == jpk2.kastiOmahind()) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }

        // Joogivaadist kasti sisse joogipudelite villimine
        jpk4.kastiTaitmine(jv.vaadiVillimine(tyhjadJoogipudelid));
        if (jv.joogiKogus == 45.5 && jpk4.joogipudelidKastis.size() == 3) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }
    }
}