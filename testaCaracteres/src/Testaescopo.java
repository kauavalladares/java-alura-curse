public class Testaescopo {
    public static void main(String[] args) {

        System.out.println("testando condicionais!");

        int idade = 16;
        int quantidadePessoas = 3;

        boolean acompanhado;

        // a variavel nasce e morre dentro do bloco dela

        if(quantidadePessoas >=2){

            //aqui ela ainda não existe
            acompanhado = true; //aqui ela ja existe
        }
        //aqui ela morreu
        else {
            //aqui ela ainda não existe
             acompanhado = false;
        }
        //aqui ela morreu

        System.out.println("valor de acompanhado = " + acompanhado);
        if (idade >= 18  || acompanhado == true ){
            System.out.println("seja bem vindo!");

        } else {
            System.out.println("infelizmente você não pode entrar!");
        }


    }
}
