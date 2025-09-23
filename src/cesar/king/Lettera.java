/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cesar.king;


/**
 *
 * @author 10934253
 */
public class Lettera {
    private char carattere;
    private static final int MIN_ASCII = 32;  // spazio
    private static final int MAX_ASCII = 126; // ~

    public Lettera(char c) {
        this.carattere = c;
    }

    /**
     * Trasla il carattere nella tabella ASCII.
     * @param spostaAvanti true per cripta (avanti), false per decripta (indietro)
     * @param passi numero di posizioni da spostare
     */
    public void traslazione(boolean spostaAvanti, int passi) {
        int ascii = (int) carattere;
        if (ascii < MIN_ASCII || ascii > MAX_ASCII) {
            // Carattere non stampabile, non si sposta
            return;
        }

        if (spostaAvanti) {
            ascii = MIN_ASCII + (ascii - MIN_ASCII + passi) % (MAX_ASCII - MIN_ASCII + 1);
        } else {
            ascii = MAX_ASCII - (MAX_ASCII - ascii + passi) % (MAX_ASCII - MIN_ASCII + 1);
        }

        carattere = (char) ascii;
    }

    public char getCarattere() {
        return carattere;
    }
}