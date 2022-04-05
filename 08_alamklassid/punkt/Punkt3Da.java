class Punkt3Da {
    public static void main(String[] arg) {
        int pArv = 4;
        double suurim = 0;
        Punkt2D pd[] = new Punkt2D[pArv];
        pd[0] = new Punkt2D(2, 1);
        pd[1] = new Punkt2D(3, 4);
        pd[2] = new Punkt3D(1, 4, 2);
        pd[3] = new Punkt3D(5, 3, 5);
        for (int n = 0; n < pArv; n++) {
            double kaugus = pd[n].kaugusNullist2D();
            if (pd[n] instanceof Punkt3D) {
                Punkt3D p = (Punkt3D) pd[n];
                kaugus = p.kaugusNullist3D();
            }
            if (kaugus > suurim) {
                suurim = kaugus;
            }
        }
        System.out.println(suurim);
    }
}