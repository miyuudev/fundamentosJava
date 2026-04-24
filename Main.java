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
        scan.close();
    }
}
