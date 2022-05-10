import java.util.*;
import java.io.*;

public class Proov2 {
    public static void main(String[] arg) {
        Alleel alleel1 = new Alleel("reesus", true);
        Alleel alleel2 = new Alleel("reesus", false);

        Geen geen1 = new Geen(alleel1, alleel2);
        Geen geen2 = new Geen(alleel1, alleel1);

        // Funktsioon uue geeni tekitamiseks kahest geenist
        Geen geen3 = new Geen(geen1.juhuslikAlleel(), geen2.juhuslikAlleel());

        // Rakendus
        Scanner sc = new Scanner(System.in);

        System.out.println("Sisestage alleeli nimetus: ");
        String nimetus = sc.nextLine();

        System.out.println("Sisestage ema alleeli +/- väärtus (true/false): ");
        boolean positiivne1 = Boolean.parseBoolean(sc.nextLine());

        System.out.println("Sisestage isa alleeli +/- väärtus (true/false): ");
        boolean positiivne2 = Boolean.parseBoolean(sc.nextLine());

        Alleel alleelEma = new Alleel(nimetus, positiivne1);
        Alleel alleelIsa = new Alleel(nimetus, positiivne2);

        Geen geenLaps = new Geen(alleelEma, alleelIsa);

        System.out.println(geenLaps.andmed());

        File file = new File("lapsegeen.txt");

        try {
            FileWriter fw = new FileWriter("lapsegeen.txt", true);
            fw.write(geenLaps.andmed());
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}