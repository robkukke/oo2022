package battleship;

public class battleshipTuum1 implements battleshipTuum {
    int laevX, laevY, shipHealth;
    int pommitusX, pommitusY;
    final int laius = 10, korgus = 10, maxHealth = 4;
    public void asetaLaev() {
        laevX = (int)(laius * Math.random());
        laevY = (int)(korgus * Math.random());
        shipHealth = (int)(maxHealth * (Math.random())) + 1;
    }
    public void pommitus(int x, int y) {
        pommitusX = x;
        pommitusY = y;
    }
    public int[] pommita() {
        return new int[] {pommitusX, pommitusY};
    }
    public int[] laevaKoht() {
        return new int[] {laevX, laevY};
    }
    public int laevaX() {
        return laevX;
    }
    public int laevaY() {
        return laevY;
    }
    public String tulemus() {
        if (pommitusX == laevX && pommitusY == laevY) {
            return "pihtas";
        } else {
            return "moodas";
        }
    }
    public void damageShip() {
        shipHealth--;
        System.out.println("Laeva elud: " + Integer.toString(shipHealth));
    }
    public int returnHealth() {
        return shipHealth;
    }
}