package vector;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] vectorA = new int[8];
        int[] vectorB = new int[vectorA.length];

        for(int i=0; i<vectorA.length; i++) {
            System.out.println("Entre com o valor da posicao: " + i);
            vectorA[i] = scan.nextInt();

            vectorB[i] = vectorA[i] * 2;
        }
        System.out.println();

        System.out.print("Vector A: ");
        for(int i=0; i<vectorA.length; i++){
            System.out.print(vectorA[i] + " ");
        }
        System.out.println();

        System.out.print("Vector B: ");
        for(int i=0; i<vectorB.length; i++){
            System.out.print(vectorB[i] + " ");
        }
        System.out.println();
        
        scan.close();
    }
}
