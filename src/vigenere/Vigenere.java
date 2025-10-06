package vigenere;
import cesar.king.*;

public class Vigenere {

    public static String cripta(String messaggio, int[] chiave) {
        StringBuilder risultato = new StringBuilder();
        int indexChiave = 0;

        for (char c : messaggio.toCharArray()) {
            Lettera l = new Lettera(c);
            l.traslazione(true, chiave[indexChiave]);
            risultato.append(l.getCarattere());
            indexChiave = (indexChiave + 1) % chiave.length; // chiave ciclica
        }
        return risultato.toString();
    }

    public static String decripta(String messaggio, int[] chiave) {
        StringBuilder risultato = new StringBuilder();
        int indexChiave = 0;

        for (char c : messaggio.toCharArray()) {
            Lettera l = new Lettera(c);
            l.traslazione(false, chiave[indexChiave]);
            risultato.append(l.getCarattere());
            indexChiave = (indexChiave + 1) % chiave.length;
        }
        return risultato.toString();
    }
}