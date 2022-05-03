import java.util.*;

public class Proov2 {
    public static void main(String[] arg) {
        Jook jook = new Jook("Piim", 1.0, 110.0);

        Joogipudel jp1 = new Joogipudel(1.5, "Plast", 0.15, 0.1);
        Joogipudel jp2 = new Joogipudel(1.5, "Plast", 0.15, 0.1);
        Joogipudel jp3 = new Joogipudel(1.5, "Plast", 0.15, 0.1);
        Joogipudel jp4 = new Joogipudel(1.5, "Plast", 0.15, 0.1);
        Joogipudel jp5 = new Joogipudel(1.5, "Plast", 0.15, 0.1);
        Joogipudel jp6 = new Joogipudel(1.5, "Plast", 0.15, 0.1);
        Joogipudel jp7 = new Joogipudel(1.5, "Plast", 0.15, 0.1);
        Joogipudel jp8 = new Joogipudel(1.5, "Plast", 0.15, 0.1);
        Joogipudel jp9 = new Joogipudel(1.5, "Plast", 0.15, 0.1);
        Joogipudel jp10 = new Joogipudel(1.5, "Plast", 0.15, 0.1);
        Joogipudel jp11 = new Joogipudel(1.5, "Plast", 0.15, 0.1);
        Joogipudel jp12 = new Joogipudel(1.5, "Plast", 0.15, 0.1);
        Joogipudel jp13 = new Joogipudel(1.5, "Plast", 0.15, 0.1);
        Joogipudel jp14 = new Joogipudel(1.5, "Plast", 0.15, 0.1);
        Joogipudel jp15 = new Joogipudel(1.5, "Plast", 0.15, 0.1);

        Joogivaat jvJagub1 = new Joogivaat(0.3, 50.0);
        Joogivaat jvJagub2 = new Joogivaat(0.3, 50.0);
        Joogivaat jvJagub3 = new Joogivaat(0.3, 4.5);
        Joogivaat jvJagub4 = new Joogivaat(0.3, 4.5);
        Joogivaat jvEiJagu1 = new Joogivaat(0.3, 1.0);
        Joogivaat jvEiJagu2 = new Joogivaat(0.3, 3.0);

        jvJagub1.vaadiTaitmine(jook);
        jvJagub2.vaadiTaitmine(jook);
        jvJagub3.vaadiTaitmine(jook);
        jvEiJagu1.vaadiTaitmine(jook);
        jvEiJagu2.vaadiTaitmine(jook);

        ArrayList < Joogipudel > tyhjadJoogipudelid = new ArrayList < > ();
        tyhjadJoogipudelid.add(jp4);
        tyhjadJoogipudelid.add(jp5);
        tyhjadJoogipudelid.add(jp6);

        ArrayList < Joogipudel > tyhjadJoogipudelid2 = new ArrayList < > ();
        tyhjadJoogipudelid2.add(jp7);
        tyhjadJoogipudelid2.add(jp8);
        tyhjadJoogipudelid2.add(jp9);

        ArrayList < Joogipudel > tyhjadJoogipudelid3 = new ArrayList < > ();
        tyhjadJoogipudelid3.add(jp10);
        tyhjadJoogipudelid3.add(jp11);
        tyhjadJoogipudelid3.add(jp12);

        jp13.jookPudelisse(jook);

        ArrayList < Joogipudel > segaminiJoogipudelid = new ArrayList < > ();
        segaminiJoogipudelid.add(jp13);
        segaminiJoogipudelid.add(jp14);
        segaminiJoogipudelid.add(jp15);

        // Tühja joogipudeli täitmine (vaadis jagub jooki)
        jvJagub1.joogipudeliTaitmine(jp1);
        double jvJaak = 50.0 - 1.5;
        if (jvJaak == jvJagub1.joogiKogus) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }

        // Tühja joogipudeli täitmine (vaadis ei jagu jooki)
        jvEiJagu1.joogipudeliTaitmine(jp2);
        if (jvEiJagu1.joogiKogus == 1.0) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }

        // Täis joogipudeli täitmine
        jp3.jookPudelisse(jook);
        jvJagub2.joogipudeliTaitmine(jp3);
        if (jvJagub2.joogiKogus == 50.0) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }

        // Kogu joogivaaditäie joogi villimine joogipudelitesse (vaadis jagub jooki)
        jvJagub2.vaadiVillimine(tyhjadJoogipudelid);
        if (jvJagub2.joogiKogus == 45.5) {
            if (jvJagub2.taidetudJoogipudelid.size() == 3) {
                System.out.println("PASS");
            }
        } else {
            System.out.println("FAIL");
        }

        // Kogu joogivaaditäie joogi villimine joogipudelitesse (vaadis jagub täpselt jooki)
        jvJagub3.vaadiVillimine(tyhjadJoogipudelid2);
        if (jvJagub3.joogiKogus == 0.0) {
            if (jvJagub3.taidetudJoogipudelid.size() == 3) {
                System.out.println("PASS");
            }
        } else {
            System.out.println("FAIL");
        }

        // Kogu joogivaaditäie joogi villimine joogipudelitesse (vaadis ei jagu jooki)
        jvEiJagu2.vaadiVillimine(tyhjadJoogipudelid3);
        if (jvEiJagu2.joogiKogus == 0.0) {
            if (jvEiJagu2.taidetudJoogipudelid.size() == 2) {
                System.out.println("PASS");
            }
        } else {
            System.out.println("FAIL");
        }

        // Kogu joogivaaditäie joogi villimine joogipudelitesse (üks joogipudel on täidetud, ülejäänud on tühjad)
        jvJagub4.vaadiVillimine(segaminiJoogipudelid);
        if (jvJagub4.joogiKogus == 1.5) {
            if (jvJagub4.taidetudJoogipudelid.size() == 2) {
                System.out.println("PASS");
            }
        } else {
            System.out.println("FAIL");
        }
    }
}