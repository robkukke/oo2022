import java.util.*;

public class Raamatukogu {
    List < Raamat > raamatud = new ArrayList < Raamat > ();
    public void lisaRaamat(Raamat r) {
        raamatud.add(r);
    }
    public String toString() {
        StringBuffer sb = new StringBuffer();
        for (Raamat r: raamatud) {
            sb.append(r + "\n");
        }
        return sb.toString();
    }
    public Raamat koigeRohkemLoetud() {
        Raamat v = raamatud.get(0);
        for (Raamat r: raamatud) {
            if (r.lugeda() < v.lugeda()) {
                v = r;
            }
        }
        return v;
    }
}