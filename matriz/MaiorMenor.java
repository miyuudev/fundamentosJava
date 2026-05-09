package matriz;

import java.util.Random;

public class MaiorMenor {
    public static void main(String[] args) {

        int[][] matriz = new int[5][5];
        Random random = new Random();
        
        for(int i = 0; i < matriz.length; i++){
            int maior = Integer.MIN_VALUE;
            int menor = Integer.MAX_VALUE;
            
            for(int j = 0; j < matriz[i].length; j++){
                matriz[i][j] = random.nextInt(100);
                System.out.print(matriz[i][j] + " ");
                if(matriz[i][j]>maior){
                    maior = matriz[i][j];
                } 
                if(matriz[i][j]<menor) {
                    menor = matriz[i][j];
                }
            }
            System.out.println("\nmaior : " + maior);
            System.out.print( "menor : " + menor);
            System.out.println("\n");
        }
    }
}
