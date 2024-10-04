/*Exercici 2*/
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Benvingut al programa.");
        Scanner input = new Scanner (System.in);
        boolean valid;
        boolean descompte;
        double preu;
        int usuariVIP;
        final double percentatge = 0.8;
        do{
            System.out.println("Ets un usuari VIP?");
            System.out.println("1. Sí");
            System.out.println("2. No");
            usuariVIP = input.nextInt();
            input.nextLine();
            valid = (usuariVIP == 1 || usuariVIP == 2);
            if (!valid){
                System.out.println("Opció invàlida. Tornant al menú...");
            }
        } while (!valid);
        do{
            System.out.println("Quin ha sigut l'import de la teva compra?");
            preu = input.nextDouble();
            valid = (preu >= 0);
            if(!valid){
                System.out.println("El valor introduit no és vàlid. Si us plau, introdueix un valor vàlid.");
            }
        } while (!valid);
        descompte = (preu >= 200 || usuariVIP == 1);
        if (descompte){
            System.out.println("Felicitats! Has obtingut un descompte del 20%. El teu preu final és de " + preu*percentatge + "€");
        }
        else{
            System.out.println("El teu preu final és de " + preu + "€");
        }
    }
}