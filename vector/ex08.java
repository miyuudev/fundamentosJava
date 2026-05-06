package vector;

import java.util.Arrays;

public class ex08 {
    public static void main(String[] args) {

        int[] vectorA = new int[10];
        System.out.print("Iteracao: ");
        int qtd = 0;
        for(int i = 0; i<vectorA.length; i++) {
            vectorA[i] = (int)(Math.random() * 2); // necessario utilizar cast pq gera double automaticamente
            System.out.print(vectorA[i] + " ");
            if(vectorA[i]==1){
                qtd += 1;
            }
        }
        System.out.println("\nVetorA: " + Arrays.toString(vectorA));
        System.out.println("1: " + qtd*100.0/vectorA.length + "%");
        System.out.println("2: " + (100 - (qtd*100.0/vectorA.length)) + "%");
        System.out.println();


    }
}
