import java.util.*;

class Joogivaat {
    double ruumala, joogiKogus;
    String nimetus;
    double liitriOmahind, erikaal;
    ArrayList < Joogipudel > taidetudJoogipudelid = new ArrayList < > ();

    public Joogivaat(double ruumala, double joogiKogus) {
        this.ruumala = ruumala;
        this.joogiKogus = joogiKogus;
    }

    public void vaadiTaitmine(Jook jook) {
        this.nimetus = jook.nimetus;
        this.liitriOmahind = jook.liitriOmahind;
        this.erikaal = jook.erikaal;
    }

    public void joogipudeliTaitmine(Joogipudel jp) {
        if (!jp.taidetud) {
            if (jp.maht <= this.joogiKogus) {
                jp.taidetud = true;
                jp.nimetus = this.nimetus;
                jp.erikaal = this.erikaal;
                jp.liitriOmahind = this.liitriOmahind;
                this.joogiKogus -= jp.maht;
                System.out.println("Joogipudel täidetud. Joogivaadis on veel " + this.joogiKogus + "L jooki.");
            } else {
                System.out.println("Joogivaadis pole joogipudeli täitmiseks piisavalt jooki.");
            }
        } else {
            System.out.println("Joogipudel on juba täidetud.");
        }
    }

    public ArrayList < Joogipudel > vaadiVillimine(ArrayList < Joogipudel > joogipudelid) {
        int pudeliteArv = joogipudelid.size();
        for (int i = 0; i < pudeliteArv; i++) {
            Joogipudel jp = joogipudelid.get(i);
            if (!jp.taidetud) {
                if (joogiKogus >= jp.maht) {
                    joogipudeliTaitmine(jp);
                    taidetudJoogipudelid.add(jp);
                } else {
                    System.out.println("Joogivaadis pole piisavalt jooki. Täitmata jäi " + (joogipudelid.size() - taidetudJoogipudelid.size()) + " joogipudel(it).");
                }
            }
        }
        System.out.println(taidetudJoogipudelid.size() + " joogipudelit täidetud. Joogivaati jäi alles " + joogiKogus + "L jooki.");
        return taidetudJoogipudelid;
    }
}