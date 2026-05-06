package vector;

import java.util.Scanner;

public class ex07 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite uma palavra: ");
        String texto = scan.nextLine();

        String invertido = "";

        for (int i = texto.length() - 1; i >= 0; i--) {
            invertido += texto.charAt(i);
        }

        if (texto.equalsIgnoreCase(invertido)) {
            System.out.println("E palindromo");
        } else {
            System.out.println("Não é palíndromo");
        }

        scan.close();
    }
}
