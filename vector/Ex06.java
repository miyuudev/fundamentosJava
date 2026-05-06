package vector;

import java.util.Scanner;

public class Ex06 {
    
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int[] vectorA = new int[3];

        for(int i =0; i<vectorA.length; i++){
            System.out.println("Digite uma idade na posicao: " + i);
            vectorA[i] = scan.nextInt();
        }
        System.out.println();

        System.out.print("Maiores de 35 anos: ");
        int soma = 0;
        for(int i =0; i<vectorA.length; i++){
            if(vectorA[i]>35){
                soma += i;
            } 
            System.out.print(vectorA[i] + " "); 
        }
        System.out.print("Total de pessoas maiores de 35 anos: " + soma);
        System.out.println();

        scan.close();
    }
}
