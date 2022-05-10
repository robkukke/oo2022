import java.util.*;
import java.io.*;

public class Proov3 {
    public static void main(String[] arg) {
        String str;
        boolean esimeneGeen, teineGeen;

        ArrayList < Geen > geenid = new ArrayList < > ();
        ArrayList < String > nimed = new ArrayList < > ();

        try {
            BufferedReader br = new BufferedReader(new FileReader("inimesed.txt"));

            while ((str = br.readLine()) != null) {
                String[] line = str.split(",");
                Alleel alleel = new Alleel(line[1], Boolean.parseBoolean(line[2]));
                geenid.add(new Geen(alleel, alleel));
                nimed.add(line[0]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        Scanner sc = new Scanner(System.in);

        System.out.println("Sisestage otsitava geeni nimetus: ");
        String nimetus = sc.nextLine();

        for (int i = 0; i < geenid.size(); i++) {
            if (geenid.get(i).nimetus1.equals(nimetus)) {
                System.out.println(nimed.get(i) + ": ");
                System.out.println(geenid.get(i).andmed());
            }
        }

        System.out.println("Sisestage esimese inimese nimi: ");
        String esimeneNimi = sc.nextLine();
        int esimeneNumber = nimed.indexOf(esimeneNimi);

        System.out.println("Sisestage teise inimese nimi: ");
        String teineNimi = sc.nextLine();
        int teineNumber = nimed.indexOf(teineNimi);

        esimeneGeen = geenid.get(esimeneNumber).kasGeenOnPositiivne();
        teineGeen = geenid.get(teineNumber).kasGeenOnPositiivne();

        Geen jarglaseGeen = new Geen(new Alleel(nimetus, esimeneGeen), new Alleel(nimetus, teineGeen));

        System.out.println("\nLapse geen:\n" + jarglaseGeen.andmed());

        File file = new File("lapsegeen.txt");

        try {
            FileWriter fw = new FileWriter("lapsegeen.txt", true);
            fw.write(jarglaseGeen.andmed());
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}