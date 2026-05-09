package teste;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // // TIPOS PRIMITIVOS
        
        // byte b = 0;
        // short s = 10000;
        // int i = 100000;
        // long l = 100000L;
        // float f = 10.5f;
        // char c = 'A';
        double d = 5.5;
        String str = "sakura";
        boolean bool = true;

        // PA
        int termo = 1; // a1
        int r = 1;  // razao
        int n = 5;

        Condicoes condicoes = new Condicoes();
        condicoes.verificarBoolean(bool);
        condicoes.verificarString(str);
        condicoes.verificarEquals(str);
        condicoes.verificarBlank(str);
        condicoes.countdown(d);
        int resposta=condicoes.pa(termo, r, n);
        System.out.println(resposta);

        Scanner scan = new Scanner(System.in);
        System.out.println("digite um valor: ");
        int horario = scan.nextInt();
        condicoes.rotina(horario);
       

        ExCondicoes exCondicoes = new ExCondicoes();
        System.out.println("Digite um numero: ");
        int numero = scan.nextInt();
        exCondicoes.posneg(numero);

        scan.nextLine(); // quando le o numero, sobra o ⏎ no buffer 🔥comando limpa o buffer e a plicacao prossegue 

        System.out.println("Digite um usuario: ");
        String usuario = scan.nextLine();

        System.out.println("Digite uma senha: ");
        String senha = scan.nextLine();
        exCondicoes.login(usuario, senha);

        System.out.println("[1] segunda\n[2] terca\n[3] quarta\n[4] quinta\n[5] sexta\n[6] sabado\n[7] domingo");
        System.out.println("Digite um numero: ");
        int semana = scan.nextInt();
        exCondicoes.mostraSemana(semana);

        scan.nextLine();

        System.out.println("Digite um numero: ");
        int numero1 = scan.nextInt();
        System.out.println("Digite outro numero: ");
        int numero2 = scan.nextInt();

        scan.nextLine();

        System.out.println("Digite o operador[+, -, *, / ]: ");
        String operacao = scan.nextLine();
        exCondicoes.calculadora(numero1, numero2, operacao);


        int inicial = 0;
        exCondicoes.contador(inicial);

        System.out.println("Digite um numero: ");
        int num6 = scan.nextInt();
        
        exCondicoes.soma(num6);

        scan.nextLine();

        Matrix matrix = new Matrix();
        matrix.posicao();

        scan.close();
    }
}
