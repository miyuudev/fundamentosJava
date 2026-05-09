package matriz;

import java.util.Random;

public class MaiorNum {
    public static void main(String[] args) {
        
        int[][] matriz = new int[4][4];
        Random random = new Random();
        int maior = 0;
        for(int i = 0; i < matriz.length; i++){
            System.out.print(" | ");

            for(int j = 0; j < matriz[i].length; j++){

                matriz[i][j] = random.nextInt(100);
                System.out.print(matriz[i][j] + " | ");
                if(matriz[i][j] > maior){
                    maior = matriz[i][j];
                }
            }
            System.out.println("\n");
        }
        System.out.println("maior numero: " + maior);
    }
}
