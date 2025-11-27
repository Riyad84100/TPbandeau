package Effets;

import bandeau.Bandeau;
import java.awt.Color;
import java.awt.Font;
import java.util.Random;


public class Duplique implements Effet {

    @Override
    public void jouer(Bandeau b) {

        String mot = b.getMessage();

        for (int k = 0; k < 5; k++) {

            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < 25; i++) {     // Nombre de lignes
                for (int j = 0; j < 15; j++) { // Nombre de mots par ligne
                    sb.append(mot).append(" ");
                }
                sb.append("\n"); // Retour à la ligne
            }

            b.setMessage(sb.toString());
            b.sleep(600);
        }

        b.setMessage(mot);
    }
}