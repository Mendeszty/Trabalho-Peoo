package Questao03;

public class Veiculomain {
    public static void main(String[] args) {
        Veiculo meuCarro = new Carro();
        Veiculo minhaBicicleta = new Bicicleta();

        meuCarro.mover();       
        meuCarro.parar();

        minhaBicicleta.mover(); 
        minhaBicicleta.parar();
       
    }
}
