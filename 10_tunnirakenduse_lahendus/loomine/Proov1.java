public class Proov1 {
    public static void main(String[] arg) {
        SamaTyypiPaar < Integer > asukoht = new SamaTyypiPaar < > ();
        asukoht.esimene = 7;
        asukoht.teine = 4;
        System.out.println(asukoht.esimene);
        System.out.println(asukoht);
        // Looge objekt inimese ees- ja perekonnanime tarbeks. Käivitage ja katsetage
        SamaTyypiPaar < String > nimi = new SamaTyypiPaar < > ();
        nimi.esimene = "Juku";
        nimi.teine = "Mänd";
        System.out.println(nimi);
    }
}