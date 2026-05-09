package teste;
public class ExCondicoes {

    // [IF/ELSE] 👉 Verifique se um número é positivo, negativo ou zero
    public void posneg(int num) {
        if (num > 0) {
            System.out.println("Positivo");
        } else if (num < 0) {
            System.out.println("Negativo");
        } else {
            System.out.println("Zero");
        }
    }

    // 🔥 Desafio

    // 👉 Simule um sistema de login:

    // Regras:

    // usuário correto: "admin"
    // senha correta: "1234"

    // Saída:

    // login válido
    // usuário incorreto
    // senha incorreta
    public void login(String user, String senha) {

        if(!user.equals("admin")){
            System.out.println("usuario incorreto.");
        } else if(!senha.equals("1234")) {
            System.out.println("senha incorreta");
        } else {
            System.out.println("login valido");
        }
    }

    // 🟢 Fácil

    // 👉 Receba um número (1 a 7) e mostre o dia da semana

    // 1 → Domingo  
    // 2 → Segunda  
    // ...
    public void mostraSemana(int num) {

        switch (num) {
            case 1:
                System.out.println("segunda-feira");
                break;
            case 2:
                System.out.println("terca-feira");
                break;
            case 3:
                System.out.println("quarta-feira");
                break;
            case 4:
                System.out.println("quinta-feira");
                break;
            case 5:
                System.out.println("sexta-feira");
                break;
            case 6:
                System.out.println("sabado");
                break;
            case 7:
                System.out.println("domingo");
                break;
        
            default:
                System.out.println("Nao e dia da semana");
                break;
        }
    }

    // 🔥 Desafio

    // 👉 Calculadora simples:

    // Entrada:

    // número 1
    // número 2
    // operação (+, -, *, /)

    // Saída:

    // resultado da operação
    public void calculadora( int num1, int num2, String operador) {
        switch (operador) {
            case "+" -> System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
            case "-" -> System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
            case "*" -> System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
            case "/" -> System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
        
            default -> System.out.println("Nao e um operador");
        }
    }


    // 👉 Conte de 1 até 10 usando while
    public void contador(int num) {
        while (num < 10) {
            int res = num += 1;
            System.out.println(res);
        }
    }

    // 🔥 Desafio

    // 👉 Soma dos números pares de 1 até N
    public void soma(int n) {
        int soma = 0;
        System.out.print("N = " + n + " -> ");
        for(int i = 1; i <= n; i++){
            if (i % 2 == 0) {
                soma += i;
                System.out.print(i + " + ");
            }
        }
        System.out.println(" = " + soma);
    }
}
