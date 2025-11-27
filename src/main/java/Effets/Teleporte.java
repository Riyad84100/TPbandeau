package Effets;

import bandeau.Bandeau;
import java.awt.Color;
import java.awt.Font;
import java.util.Random;

public class Teleporte implements Effet {

    @Override
    public void jouer(Bandeau b) {

        Random r = new Random();

        String[] messages = {
                "Hey !",
                "Pouf !",
                "Hop !",
                "Tadaaa !",
                "Je suis là !"
        };

        for (int i = 0; i < messages.length; i++) {

            b.setMessage("");

            b.sleep(200);

            int taille = 15 + r.nextInt(40);
            b.setFont(new Font("Dialog", Font.BOLD, taille));

            b.setForeground(new Color(r.nextInt(256), r.nextInt(256), r.nextInt(256)));

            b.setRotation(Math.toRadians(r.nextInt(90) - 45));

            b.setMessage(messages[i]);

            b.sleep(350);
        }

        b.setRotation(0);
        b.setFont(new Font("Dialog", Font.BOLD, 20));
    }
}
