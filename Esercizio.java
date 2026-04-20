// LEGGERE LE ISTRUZIONI NEL FILE README.md

import java.util.Scanner;

class Esercizio {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        Pila<Character> pila = new Pila<>();

        String parola;

        do {
            System.out.print("Inserire una parola: ");
            parola = in.nextLine();

            if (!parola.equalsIgnoreCase("X")) {
                
                // Inseriamo i caratteri nella pila (dal primo all'ultimo)
                for (int i = 0; i < parola.length(); ++i) {
                    pila.push(parola.charAt(i));
                }

                // Costruiamo la stringa inversa estraendo dalla pila
                String palindrom = "";
                while (!pila.isEmpty()) {
                    palindrom += pila.pop();
                }

                // Controlliamo se è un palindromo (ignorando maiuscole/minuscole)
                if (parola.equalsIgnoreCase(palindrom)) {
                    System.out.println("La parola: \"" + parola + "\" è palindroma!!");
                } else {
                    System.out.println("La parola: \"" + parola + "\" NON è palindroma.");
                }
            }

        } while (!parola.equalsIgnoreCase("x"));

        in.close();
    }
}