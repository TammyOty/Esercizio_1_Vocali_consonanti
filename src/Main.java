import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
     Esercizio 1
Creare un programma che conti quante lettere ci sono in una frase, compresi gli spazi
e specifichi qante sono le vocali e quante le consonanti.


Implementazione:
- per le vocali si possono contare le singole vocali.

         */
        System.out.println("Inserisci una frase: ");
        Scanner sc = new Scanner(System.in);
        String frase = sc.nextLine();

        String vocali = "aeiouAEIOU";
        int contoVocali = 0;
        int contoConsonanti = 0;
        int i;

        for(i = 0; i < frase.length(); i ++)
        { char carattere = frase.charAt(i);
            if (vocali.indexOf(carattere)>=0)
                contoVocali++;
            else if(Character.isLetter(carattere))
                contoConsonanti++;
        }
        System.out.println("il numero di vocali è: " + contoVocali);
        System.out.println("il numero di consonanti è: " + contoConsonanti);
    }
}

