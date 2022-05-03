import java.util.*;

class JoogipudeliteKast {
    String kastityyp;
    double kastihind, kastimass;
    int pesadeArv;
    boolean taidetud;
    ArrayList < Joogipudel > joogipudelidKastis = new ArrayList < > ();

    public JoogipudeliteKast(String kastityyp, double kastihind, double kastimass, int pesadeArv) {
        this.kastityyp = kastityyp;
        this.kastihind = kastihind;
        this.kastimass = kastimass;
        this.pesadeArv = pesadeArv;
    }

    public void kastiTaitmine(ArrayList < Joogipudel > joogipudelid) {
        int pudeliteArv = joogipudelid.size();
        for (int i = 0; i < pudeliteArv; i++) {
            if (i > pesadeArv - 1) {
                this.taidetud = true;
                break;
            } else {
                joogipudelidKastis.add(joogipudelid.get(i));
            }
        }
        System.out.println(joogipudelidKastis.size() + " joogipudelit pandud kasti.");
        System.out.println("Joogipudeleid alles: " + (joogipudelid.size() - joogipudelidKastis.size()));
        System.out.println("Kastis ruumi alles: " + (this.pesadeArv - joogipudelidKastis.size()));
        if (this.taidetud) {
            System.out.println("Kast on täis.");
        }
    }

    public double kastiKogumass() {
        if (joogipudelidKastis.size() > 0) {
            return (joogipudelidKastis.get(0).kogumass() * joogipudelidKastis.size()) + this.kastimass;
        } else {
            return this.kastimass;
        }
    }

    public double kastiOmahind() {
        if (joogipudelidKastis.size() > 0) {
            return (joogipudelidKastis.get(0).omahind() * joogipudelidKastis.size()) + this.kastihind;
        } else {
            return this.kastihind;
        }
    }
}