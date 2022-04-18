import java.util.*;

public class Proov2 {
    public static void main(String[] arg) {
        Map < Integer, String > valvajad = new HashMap < > ();
        valvajad.put(1, "Juku");
        valvajad.put(2, "Kati");
        valvajad.put(1, "Mati");
        System.out.println(valvajad);
        /* Koostage Map, kus võtmeks on eesnimi ning väärtuseks matemaatika veerandihinne
        Lisage paar väärtust
        Trükkige tulemused
        Saage muutujasse kätte vaid eesnimed, kuvage need */
        Map < String, Integer > hinded = new HashMap < > ();
        hinded.put("Juku", 4);
        hinded.put("Kati", 3);
        hinded.put("Mati", 5);
        System.out.println(hinded);
        System.out.println(hinded.keySet());
    }
}