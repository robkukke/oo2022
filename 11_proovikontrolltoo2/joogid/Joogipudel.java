public class Joogipudel {
    double maht, mass, taaraMaksumus;
    double liitriOmahind, erikaal;
    String pudelityyp;
    String nimetus;
    boolean taidetud;

    public Joogipudel(double maht, String pudelityyp, double mass, double taaraMaksumus) {
        this.maht = maht;
        this.pudelityyp = pudelityyp;
        this.mass = mass;
        this.taaraMaksumus = taaraMaksumus;
    }

    public void jookPudelisse(Jook jook) {
        this.taidetud = true;
        this.nimetus = jook.nimetus;
        this.liitriOmahind = jook.liitriOmahind;
        this.erikaal = jook.erikaal;
    }

    public double kogumass() {
        return (mass * 1000) + (erikaal * maht * 10);
    }

    public double omahind() {
        return (liitriOmahind * maht) + taaraMaksumus;
    }
}