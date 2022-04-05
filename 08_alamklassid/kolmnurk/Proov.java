import java.util.*;

public class Proov {
    public static void main(String[] arg) {
        ArrayList < Kolmnurk > kn = new ArrayList < Kolmnurk > ();
        Kolmnurk tavaline = new Tavaline(5, 2); // 5, sisend - a, h
        Kolmnurk heron = new TavalineHeron(5, 4, 3); // 6, sisend - a, b, c
        Kolmnurk vordhaarne = new Vordhaarne(4, 8); // 15.49, sisend - a, b
        Kolmnurk vordkulgne = new Vordkulgne(7); // 21.22, sisend - a
        kn.add(tavaline);
        kn.add(heron);
        kn.add(vordhaarne);
        kn.add(vordkulgne);
        for (Kolmnurk k: kn) {
            System.out.println(k.pindala());
        }
    }
}