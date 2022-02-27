public class Raamat {
    String pealkiri, autor;
    int lehekulgedeArv, loetudLehekuljed;
    public Raamat(String uusPealkiri, String uusAutor, int uusLehekulgedeArv, int uusLoetudLehekuljed) {
        pealkiri = uusPealkiri;
        autor = uusAutor;
        lehekulgedeArv = uusLehekulgedeArv;
        loetudLehekuljed = uusLoetudLehekuljed;
    }
    public String toString() {
        return "\"" + pealkiri + "\", " + autor + ", " + lehekulgedeArv + " lk (loetud " + loetudLehekuljed + " lk)";
    }
    public String raamatuPealkiriJaAutor() {
        return "\"" + pealkiri + "\", " + autor;
    }
    public int lugeda() {
        return lehekulgedeArv - loetudLehekuljed;
    }
    public String kauaLugeda() {
        int leheAeg = 2;
        int lehtiLugeda = lehekulgedeArv - loetudLehekuljed;
        int kokkuAeg = leheAeg * lehtiLugeda;
        if (kokkuAeg > 60) {
            int tunnid = Math.floorDiv(kokkuAeg, 60);
            int minutid = kokkuAeg - (tunnid * 60);
            return ", lugemiseks kulub umbes " + tunnid + " tundi ja " + minutid + " minutit.";
        }
        return ", lugemiseks kulub umbes " + kokkuAeg + " minutit.";
    }
}