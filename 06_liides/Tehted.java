public class Tehted implements Arvutaja {
    public void liida(double a, double b) {
        System.out.println(a + " + " + b + " = " + (a + b));
    }
    public void lahuta(double a, double b) {
        System.out.println(a + " - " + b + " = " + (a - b));
    }
    public void korruta(double a, double b) {
        System.out.println(a + " * " + b + " = " + (a * b));
    }
    public void jaga(double a, double b) {
        System.out.println(a + " / " + b + " = " + (a / b));
    }
}