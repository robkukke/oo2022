public class Proov1 {
    public static void main(String[] arg) {
        Pendel p1 = new Pendel(25);
        Hammasratas h1 = new Hammasratas(60, 10, "Esimene");
        Hammasratas h2 = new Hammasratas(100, 10, "Teine");
        Hammasratas h3 = new Hammasratas(60, 10, "Kolmas");
        Hammasratas h4 = new Hammasratas(120, 10, "Neljas");
        p1.maaraLykatav(h1);
        h1.maaraLykatav(h2);
        h2.maaraLykatav(h3);
        h3.maaraLykatav(h4);
        new Thread(p1).start();
    }
}