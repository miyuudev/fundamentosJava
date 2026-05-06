package vector;

import java.util.Scanner;

public class Ex05 {
    public static void main (String[] args){

        Scanner scan = new Scanner(System.in);
        int[] vectorA = new int[6];
        
        for(int i=0; i<vectorA.length; i++){
            System.out.println("Defina o elemento da posicao: " + i);
            vectorA[i] = scan.nextInt();
        }
        System.out.println();
        
        System.out.print("pares em vetorA: ");
        for(int i=0; i<vectorA.length; i++){
            if(vectorA[i]%2==0){
                System.out.print(vectorA[i] + " ");
            }
        }
        System.out.println();

        scan.close();
    }
}
