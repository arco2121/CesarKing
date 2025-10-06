package vigenere;

import java.util.Scanner;

public class VigenereKing {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Cifrario di Vigenere - Inserisci chiave (numeri separati da spazio, es: 3 1 4 2):");
        String[] chiaveInput = in.nextLine().trim().split(" ");
        int[] chiave = new int[chiaveInput.length];
        for (int i = 0; i < chiaveInput.length; i++) {
            chiave[i] = Integer.parseInt(chiaveInput[i]);
        }

        System.out.print("Nuova scelta (1=cifra, 2=decifra, 3=cambia chiave, 0=esci): ");
        int scelta = Integer.parseInt(in.nextLine());

        do {
            if (scelta == 1) {
                System.out.print("Testo da cifrare: ");
                String testo = in.nextLine();
                String cifrato = Vigenere.cripta(testo, chiave);
                System.out.println("Cifrato:\t" + cifrato);
            } else if (scelta == 2) {
                System.out.print("Testo da decifrare: ");
                String testo = in.nextLine();
                String decifrato = Vigenere.decripta(testo, chiave);
                System.out.println("Decifrato:\t" + decifrato);
            } else if (scelta == 3) {
                System.out.println("Nuova chiave (numeri separati da spazio): ");
                chiaveInput = in.nextLine().trim().split(" ");
                chiave = new int[chiaveInput.length];
                for (int i = 0; i < chiaveInput.length; i++) {
                    chiave[i] = Integer.parseInt(chiaveInput[i]);
                }
                System.out.println("Chiave aggiornata!");
            }

            System.out.print("Nuova scelta: ");
            scelta = Integer.parseInt(in.nextLine());
        } while (scelta != 0);

        in.close();
    }
}