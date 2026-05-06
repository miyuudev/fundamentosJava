package vector;

public class ex09 {
    public static void main(String[] args) {

        char[] novasenha = new char[12]; // performance extrema, tamanho fixo
        StringBuilder senha = new StringBuilder(); // codigo mais limpo, montar texto 📦
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        
        for (int i = 0; i < 12; i++) {
            int indice = (int)(Math.random() * caracteres.length());
            senha.append(caracteres.charAt(indice));
        }

        System.out.println(senha.toString());

        for(int i = 0; i < novasenha.length; i++) {
            int novoindice = (int)(Math.random() * caracteres.length()); // acha um indice random
            novasenha[i] = caracteres.charAt(novoindice); // adiciona no vetor um valor aleatorio do vetor(caracteres)
        }
    }
}
