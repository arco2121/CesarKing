/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cesar.king;
import java.util.Scanner;
/**
 *
 * @author 10934253
 */
public class CesarKing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner idio = new Scanner(System.in);
        System.out.println("Cifrario - Inserisci chiave : ");
        int chiave = 0;
        chiave = Integer.parseInt(idio.nextLine());
        System.out.print("Nuova scelta: ");
        int choise = Integer.parseInt(idio.nextLine());
        do
        {
            if(choise == 1)
            {
                String f = idio.nextLine();
                String k = Cesar.cripta(f, chiave);
                System.out.print("Cifrato:\t" + k + "\n");
            }else if(choise == 2)
            {
                String f = idio.nextLine();
                String k = Cesar.decripta(f, chiave);
                System.out.print("Decifrato:\t" + k + "\n");
            }
            else if(choise == 3)
            {
                int f = Integer.parseInt(idio.nextLine());
                chiave = f;
                System.out.print("Chiave Cambiata\n");
            }
            System.out.print("Nuova scelta: ");
            choise = Integer.parseInt(idio.nextLine());
        }while(choise != 0);
        return;
    }
}
