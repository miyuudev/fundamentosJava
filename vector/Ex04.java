package vector;

import java.util.Scanner;

public class Ex04 {
    public static void main (String[] args){

        Scanner scan = new Scanner(System.in);
        
        int[] vectorA = new int[5];
        int[] vectorB = new int[vectorA.length];
        int[] vectorC = new int[vectorB.length];
        for (int i=0; i < vectorA.length; i++){
            System.out.println("Entre com o valor da posicao: " + i);
            vectorA[i] = scan.nextInt();
        }
        System.out.println();

        for (int i=0; i < vectorC.length; i++){
            System.out.println("Entre com o valor da posicao: " + i);
            vectorB[i] = scan.nextInt();
            vectorC[i] = vectorA[i] + vectorB[i];
        }
        System.out.println();

        System.out.print("Vetor A: ");
        for (int i=0; i < vectorA.length; i++){
            System.out.print(vectorA[i] + " ");
        }
        System.out.println();

        System.out.print("Vetor B: ");
        for (int i=0; i < vectorB.length; i++){
            System.out.print(vectorB[i] + " ");
        }
        System.out.println();

        System.out.print("Vetor C: ");
        for (int i=0; i < vectorC.length; i++){
            System.out.print(vectorC[i] + " ");
        }
        System.out.println();


        scan.close();
    }
}
