import Models.LagerModel;

import java.util.ArrayList;
import java.util.List;


// Maven projekt

public class Windsor {
    public static void main(String[] args) {
        List<LagerModel> lagerListe = new ArrayList<>();

        System.out.println("Windsor ERP System\n");

        LagerModel lm1 = new LagerModel();
        lm1.setVarenummer("1");
        lm1.setVareMaengde(10);
        lm1.setKostPris(10.5);
        lagerListe.add(lm1);

       /* for (LagerModel lm : lagerListe) {
            System.out.println(lm);
        }*/
        System.out.println("\n");
        lm1.varenummerVisning();
        lm1.lagerTransaktioner(lm1,2);
        System.out.println(lm1);
        lm1.lagerTransaktioner(lm1,6);
        System.out.println(lm1);
    }
}
