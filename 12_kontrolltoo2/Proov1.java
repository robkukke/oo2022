public class Proov1 {
    public static void main(String[] arg) {
        Alleel alleel1 = new Alleel("reesus", true);
        Alleel alleel2 = new Alleel("reesus", false);
        Alleel alleel3 = new Alleel("mittereesus", true);

        Geen geen1 = new Geen(alleel1, alleel2);
        Geen geen2 = new Geen(alleel1, alleel1);
        Geen geen3 = new Geen(alleel2, alleel2);
        Geen geen4 = new Geen(alleel1, alleel3);

        // Kas geen1 (true ja false) tagastab true
        if (geen1.kasGeenOnPositiivne()) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }

        // Kas geen2 (true ja true) tagastab true
        if (geen2.kasGeenOnPositiivne()) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }

        // Kas geen3 (false ja false) tagastab false
        if (!geen3.kasGeenOnPositiivne()) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }

        // Kas geen4 (erinevad nimetused) tagastab false
        if (!geen4.kasGeenOnPositiivne()) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }
    }
}