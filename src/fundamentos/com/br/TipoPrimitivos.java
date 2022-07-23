package fundamentos.com.br;

public class TipoPrimitivos {
    public static void main(String[] args) {

        // Tipos númericos inteiros
        byte anosDeEmpresa = 25;
        short numerosDeVoos = 455;
        int id = 4598;
        long pontosAcumulados = 3_145_456_633L;

        //Tipos numéricos reais
        float salario = 11_415.44F;
        double vendasAcumuladas = 2_142_698_140.01;

        //Tipos booleano
        boolean estaDeFerais = false;

        //Tipo de caractere
        char status = 'A';

        System.out.println(anosDeEmpresa * 365);
        System.out.println(numerosDeVoos / 2);
        System.out.println(pontosAcumulados / vendasAcumuladas);
        System.out.println(id + ": ganha -> " + salario);

    }
}
