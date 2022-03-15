import java.util.*;

/**
 * Saadab saabunud teated edasi siia külge registreerunud logijatele
 */

public class HargnevLogija implements Logija {
    List < Logija > puhver = new ArrayList < Logija > ();
    public void lisaLogija(Logija lg) {
        puhver.add(lg);
    }
    public void logi(String teade) {
        for (Logija abi: puhver) {
            abi.logi(teade);
        }
    }
}