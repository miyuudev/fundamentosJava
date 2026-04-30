import java.util.Random;

public class Matrix {
    public void posicao(){
        int[][] numAleatorios = new int[4][4];
        Random numRandom = new Random();
        for(int i=0; i<numAleatorios.length; i++){
            for(int j=0; j<numAleatorios[i].length;j++){
                numAleatorios[i][j] = numRandom.nextInt(100);
            }
        }

        int maior = 0;
        int linha =0;
        int col =0;
        for(int i=0; i<numAleatorios.length; i++){
            for(int j=0; j<numAleatorios[i].length;j++){
                if (numAleatorios[i][j]>maior) {
                    maior=numAleatorios[i][j];
                    linha = i;
                    col = j;
                }
            }
        }
        for(int i=0; i<numAleatorios.length; i++){
            for(int j=0; j<numAleatorios[i].length;j++){
                System.out.println(numAleatorios[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("maior: " + maior);
        System.out.println("linha: " + linha);
        System.out.println("col: " + col);
    }
}
