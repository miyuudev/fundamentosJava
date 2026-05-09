package teste;

public class Condicoes {

    public void verificarBoolean(boolean bool) {
        if (bool) {
            System.out.println("verdadeira");
        } else {
            System.out.println("Falso");
        }
    }

    public void verificarString(String str) {
        if ("sakhura".equals(str)) {
            System.out.println("verdadeira");
        } else {
            System.out.println("Falso");
        }
    }

    public void verificarEquals(String str) {
        if ("sakura".equals(str)) {
            System.out.println("verdadeira");
        } else {
            System.out.println("Falso");
        }
    }

    // if else
    public void verificarBlank(String str) {
        if (str.isBlank()) {
            System.out.println("verdadeira");
        } else if ("sakura".equals(str)) {
            System.out.println("sakura ok");
        } else {
            System.out.println("Falso");
        }
    }

    // WHILE
    public void countdown(double d) {
        double countdown = d;
        
        while (countdown > 0) {
            System.out.print(countdown + " || ");
            countdown -= 0.5;
        }

        System.out.println("Finish");
    }

    // FOR com progressao aritmetica
    public int pa(int termo, int r, int n) {

        int soma = 0;

        for (int i = 0; i < n; i++) {
        soma += termo;
        termo += r; // termo recebe a soma de termo + r 
        }

        return soma;
    }
 
    // SWITCH
    public void rotina(int horario) {
        
        switch (horario) {
            case 6:
            case 7:
            case 8:
                System.out.println("Estudo (6~8)");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("trabalho (9~11)");
                break;
            default:
                System.out.println("A rotina de hoje esta completa");
                break;
        }
    }
}