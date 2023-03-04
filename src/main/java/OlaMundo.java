public class OlaMundo {
    public static void main (String[] args) {
    /*    System.out.println("Olá, mundo!!!");
        minhaFuncaoNaoRetornaNada();
        System.out.println(minhaFuncaoRetornaInteiro());
        System.out.println("Texto retornado da função: " + minhFuncaoRetornaRecebeString("valor passado"));
    }

    static void minhaFuncaoNaoRetornaNada(){
        System.out.println("Não retorna nada.");
    }

    static int minhaFuncaoRetornaInteiro(){
        System.out.println("Minha função retorna inteiro");
        int numeroRetornado = 10;
        return numeroRetornado;
    }

    static String minhFuncaoRetornaRecebeString(String meuParam){
        meuParam = "Deve retornar esse parâmetro.";
        System.out.println(meuParam);
        return meuParam;
    }
    */

    //Operadores de decisão
    /*    boolean ehVerdade = true;
        if (ehVerdade){           //(ehVerdade == true){
            System.out.println("É verdade");
        }

        ehVerdade = false;

        Todas as linhas de comando abaixo podem ser substituídas pelo comando seguinte.
        if (ehVerdade){         //(ehVerdade == true){
            System.out.println("É verdade.");
        } else{
            System.out.println("Não é verdade.");
        }

        if (!ehVerdade) {
            System.out.println("Não é verdade.");
        }

        //While avalia a condição primeiro, executa o comando e depois incrementa o contador.
        int cont = 0;
        while(cont!=3){
            System.out.println("Valor do contador é "+cont);
            cont++;
        }

        //For avalia a condição, incrementa o contador e depois executa o comando. ???????
        for(int cont2=0;cont2< 3;cont2++){
            System.out.println("Valor do contador do for é "+cont2);
        }
    */

        Carro meuCarro = new Carro();

        System.out.println("Cor do carro default: " + meuCarro.cor);

        meuCarro.numeroPortas = 2;
        meuCarro.comprimento = 4.2;
        meuCarro.cor = "vermelho";


        System.out.println("Cor do carro informada pelo usuário: " + meuCarro.cor);

        meuCarro.acelerar();
        System.out.println(meuCarro.velocidadeAtual);

        meuCarro.brecar();
        System.out.println(meuCarro.velocidadeAtual);
    }
 }
