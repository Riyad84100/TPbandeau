package Effets;

import bandeau.Bandeau;

public class Danse implements Effet {

    @Override
    public void jouer(Bandeau b) {

        for (int i = 0; i < 8; i++) {
            b.setRotation(Math.toRadians(10));
            b.sleep(150);

            b.setRotation(Math.toRadians(-10));
            b.sleep(150);
        }

        b.setRotation(0);
    }
}
