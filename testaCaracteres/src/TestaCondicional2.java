public class TestaCondicional2 {
    public static void main(String[] args) {

        System.out.println("testando condicionais!");

        int idade = 16;
        int quantidadePessoas = 3;
        boolean acompanhado = quantidadePessoas >= 2;

        System.out.println("valor de acompanhado = " + acompanhado);
        if (idade >= 18  || acompanhado == true ){
            System.out.println("seja bem vindo!");

        } else {
                System.out.println("infelizmente você não pode entrar!");
            }


        }
    }



