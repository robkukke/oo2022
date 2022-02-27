public class Proov {
    public static void main(String[] arg) {
        Raamat r1 = new Raamat("Rehepapp ehk November", "Andrus Kivirähk", 199, 52);
        Raamat r2 = new Raamat("Kevade", "Oskar Luts", 496, 473);
        Raamatukogu rk = new Raamatukogu();
        rk.lisaRaamat(r1);
        rk.lisaRaamat(r2);
        System.out.println(rk);
        System.out.println("Raamatust " + r1.raamatuPealkiriJaAutor() + " on veel lugeda " + r1.lugeda() + " lk" + r1.kauaLugeda());
        System.out.println("Raamatust " + r2.raamatuPealkiriJaAutor() + " on veel lugeda " + r2.lugeda() + " lk" + r2.kauaLugeda() + "\n");
        System.out.println("Kõige rohkem on loetud raamatust " + rk.koigeRohkemLoetud());
    }
}