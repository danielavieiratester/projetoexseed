public class Carro {
    int numeroPortas;
    String cor;
    double comprimento;
    double velocidadeAtual = 0;

    Carro(){
        this.cor = "prateado";  // definindo uma cor padrão, se o usuário não informar cor, vai ser prateado.
    }

    void acelerar() {
        velocidadeAtual = velocidadeAtual + 10;
    }

    void brecar() {
        velocidadeAtual = velocidadeAtual - 10;
    }
}
