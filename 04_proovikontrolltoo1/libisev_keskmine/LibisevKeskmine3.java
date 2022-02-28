import java.util.*;

public class LibisevKeskmine3 {
    List < Double > hoidla = new ArrayList < Double > ();
    List < Double > vastused = new ArrayList < Double > ();
    public void lisa(double arv) {
        hoidla.add(arv);
        int n = hoidla.size();
        if (hoidla.size() >= 3) {
            vastused.add((hoidla.get(n - 3) + hoidla.get(n - 2) + hoidla.get(n - 1)) / 3.0);
        }
    }
    public List < Double > libisevKeskmine() {
        return vastused;
    }
}