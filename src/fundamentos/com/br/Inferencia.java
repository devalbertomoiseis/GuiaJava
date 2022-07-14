package fundamentos.com.br;

public class Inferencia {
    public static void main(String[] args) {

        double a = 4.5;
        System.out.println(a);
        /*
            a = "..."; Não pode
        */
        var b = 4.5;
        System.out.println(b);

        var c = "Texto";
        System.out.println(c);

        double d; // variável declarada
        d = 40; // variável foi inicializada
        System.out.println(d);// exibida
    }
}
