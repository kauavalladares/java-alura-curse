public class Main {
    public static void main(String[] args) {
        // double armazena dois valores, valores reais e valores inteiros.
        double salario;
        salario = 1250.10;
        // usando o int antes da variavel entre parenteses podemos trasnformar uma variavel real em inteira.
        int valor = (int) salario;
        // o int armazena até 2 bilhoes mais que isso da overflow
        int x = 20000000;
        // armazena um numero que é aproximadamente 2 bi elavado ao quadrado
        long numeroMuitoGrande = 2903344593045895l;
        // armazena um numero bem pequeno rarissimo de se usar
        short valorpequeno = 2131;
        // armazena so até 127 no positivo e no negativo
        byte b =127;


        System.out.println("meu salário é " + salario );
    }

}