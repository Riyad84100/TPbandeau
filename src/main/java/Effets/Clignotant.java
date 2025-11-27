package Effets;

import bandeau.Bandeau;

public class Clignotant implements Effet {

    @Override
    public void jouer(Bandeau b) {
        for (int i = 0; i < 6; i++) {
            b.setMessage("Clignote !");
            b.sleep(300);
            b.setMessage("");
            b.sleep(300);
        }
    }
}
