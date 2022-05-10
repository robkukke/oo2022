import java.util.*;

public class Geen {
    String nimetus1, nimetus2;
    boolean positiivne1, positiivne2;
    ArrayList < Alleel > alleelid = new ArrayList < > ();

    public Geen(Alleel alleel1, Alleel alleel2) {
        this.nimetus1 = alleel1.nimetus;
        this.nimetus2 = alleel2.nimetus;
        this.positiivne1 = alleel1.positiivne;
        this.positiivne2 = alleel2.positiivne;

        this.alleelid.add(alleel1);
        this.alleelid.add(alleel2);
    }

    public boolean kasGeenOnPositiivne() {
        if (this.nimetus1.equals(this.nimetus2)) {
            return this.positiivne1 || this.positiivne2;
        }
        return false;
    }

    public Alleel juhuslikAlleel() {
        int juhuslik = (int)(Math.random() * alleelid.size());
        return alleelid.get(juhuslik);
    }

    public String andmed() {
        return "Nimetus: " + this.nimetus1 + "\nPositiivne: " + kasGeenOnPositiivne() + "\n";
    }
}