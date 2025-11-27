package exemple;

import bandeau.Bandeau;
import Effets.Clignotant;
import Effets.Danse;
import Effets.Duplique;
import Effets.Teleporte;

public class ExempleDUtilisation {

    public static void main(String[] args) {

        Bandeau b = new Bandeau();
        b.setMessage("Show !");
        b.sleep(1000);

        Scenario s = new Scenario();

        s.ajouterEffet(new Duplique(), 3);
        s.ajouterEffet(new Danse(), 2);
        s.ajouterEffet(new Teleporte(), 2);
        s.ajouterEffet(new Duplique(), 2);
        s.ajouterEffet(new Clignotant(), 1);

        s.jouer(b);

        b.setMessage("Fin ");
        b.sleep(2000);
        b.close();
    }
}