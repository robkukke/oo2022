package battleship;

import java.util.*;
import java.io.*;

public class battleshipProov {
    public static void main(String[] arg) throws IOException {
        battleshipTuum mt = new battleshipTuum1();
        int i = 0;
        System.out.println("Mitu laeva genereerime?");
        BufferedReader inputUser = new BufferedReader(new InputStreamReader(System.in));
        int shipAmount = Integer.parseInt(inputUser.readLine());
        mt.asetaLaev();
        System.out.println("Laeva koht: " + Arrays.toString(mt.laevaKoht()) + ". Laeva elud: " + Integer.toString(mt.returnHealth()));
        int x = 0, y = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (i < shipAmount) {
            String rida = br.readLine();
            if (rida.length() > 1) {
                x = Integer.parseInt(Character.toString(rida.charAt(0)));
                y = Integer.parseInt(Character.toString(rida.charAt(1)));
            }
            if (x == mt.laevaX() && y == mt.laevaY()) {
                mt.pommitus(x, y);
                System.out.println("Pommitus: " + Arrays.toString(mt.pommita()));
                System.out.println(mt.tulemus());
                mt.damageShip();
                if (mt.returnHealth() <= 0) {
                    i++;
                    if (i == shipAmount - 1) {
                        break;
                    } else {
                        mt.asetaLaev();
                    }
                }
                System.out.println("Laeva koht: " + Arrays.toString(mt.laevaKoht()) + ". Laeva elud: " + Integer.toString(mt.returnHealth()));
            } else {
                mt.pommitus(x, y);
                System.out.println("Pommitus: " + Arrays.toString(mt.pommita()));
                System.out.println(mt.tulemus());
                System.out.println("Laeva koht: " + Arrays.toString(mt.laevaKoht()) + ". Laeva elud: " + Integer.toString(mt.returnHealth()));
            }
        }
    }
}