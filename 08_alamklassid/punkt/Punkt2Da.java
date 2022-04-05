class Punkt2Da {
    public static void main(String[] arg) {
        int pArv = 3;
        double suurim = 0;
        Punkt2D pd[] = new Punkt2D[pArv];
        pd[0] = new Punkt2D(2, 1);
        pd[1] = new Punkt2D(3, 4);
        pd[2] = new Punkt2D(5, 5);
        for (int n = 0; n < pArv; n++) {
            if (pd[n].kaugusNullist2D() > suurim) {
                suurim = pd[n].kaugusNullist2D();
            }
        }
        System.out.println(suurim);
    }
}