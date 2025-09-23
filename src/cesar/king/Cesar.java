/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cesar.king;

/**
 *
 * @author 10934253
 */
public class Cesar
{
    public static String cripta(String messaggio, int passi) {
        StringBuilder risultato = new StringBuilder();
        for (char c : messaggio.toCharArray()) {
            Lettera l = new Lettera(c);
            l.traslazione(true, passi);
            risultato.append(l.getCarattere());
        }
        return risultato.toString();
    }

    public static String decripta(String messaggio, int passi) {
        StringBuilder risultato = new StringBuilder();
        for (char c : messaggio.toCharArray()) {
            Lettera l = new Lettera(c);
            l.traslazione(false, passi);
            risultato.append(l.getCarattere());
        }
        return risultato.toString();
    }
}
