package edu.fra.uas.notendurchschnitt;

import org.springframework.stereotype.Component;
import java.util.Scanner;

@Component
public class DurchschnittBerechnen {

    public void berechnen() {

        Scanner scan = new Scanner(System.in);

        System.out.println("Wie viele Noten willst du eingeben?");
        int anzahl = scan.nextInt();

        int[] noten = new int[anzahl];
        for (int i = 0; i < anzahl; i++) {
            System.out.println("Gebe deine " + (i + 1) + ". Note ein: ");
            noten[i] = scan.nextInt();

        }
        double summe = 0;
        for (int i = 0; i < noten.length; i++) {
            summe += noten[i];
        }
        double durchschnitt = summe / (double) anzahl;
        System.out.println("Deine Durchschnittsnote: " + (Math.round(durchschnitt*100)/100.0));
        scan.close();
    }
}
