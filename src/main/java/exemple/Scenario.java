package exemple;

import bandeau.Bandeau;
import Effets.Effet;
import java.util.ArrayList;

public class Scenario {

    private class Element {
        Effet effet;
        int repetitions;

        Element(Effet e, int r) {
            this.effet = e;
            this.repetitions = r;
        }
    }

    private ArrayList<Element> liste = new ArrayList<>();

    public void ajouterEffet(Effet e, int reps) {
        liste.add(new Element(e, reps));
    }

    public void jouer(Bandeau b) {
        for (Element el : liste) {
            for (int i = 0; i < el.repetitions; i++) {
                el.effet.jouer(b);
            }
        }
    }
}
