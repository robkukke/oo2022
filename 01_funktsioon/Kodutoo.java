/**
 * Programm arvutab välja, mitu tundi ja protsenti Sa oma elust maganud oled
 * ning kui palju rohkem/vähem see soovitatud 8st tunnist öö kohta on.
 * Vajaminevad andmed on keskmine une pikkus ja vanus.
 * Vanuse asemel sobib ka aastate arv, et teada saada näiteks kahe aasta statistika.
 */

public class Kodutoo {
	public static double[] reaalarvudeks(String[] sd) {
		double[] v = new double[sd.length];
		for (int i = 0; i < sd.length; i++) {
			v[i] = Double.parseDouble(sd[i]);
		}
		return v;
	}
	public static double unetunnid(double[] arvud) {
		if (arvud.length < 2) {
			throw new RuntimeException("Andmed puuduvad!");
		}
		double unepikkus = arvud[0];
		double vanus = arvud[1];
		double unikokku = unepikkus * 365 * vanus;
		double soovituslik = 8 * 365 * vanus;
		return soovituslik - unikokku;
	}
	public static void main(String[] args) {
		double[] arvud = reaalarvudeks(args);
		double uni = unetunnid(arvud);
		double unikokku = arvud[0] * 365 * arvud[1];
		double elutunnid = 24 * 365 * arvud[1];
		double protsent = (unikokku / elutunnid) * 100;
		System.out.println("Oled kokku maganud " + unikokku + " tundi ehk " + protsent + "% oma elust.");
		if (uni > 0) {
			System.out.println("Oled maganud " + uni + " tundi vähem soovitatust.");
		} else if (uni < 0) {
			System.out.println("Oled maganud " + Math.abs(uni) + " tundi rohkem soovitatust.");
		} else {
			System.out.println("Oled maganud täpselt piisavalt.");
		}
	}
}