package Questao03;

abstract class Veiculo {
    
    public abstract void mover();
    
   
    public abstract void parar();
}


class Carro extends Veiculo {
    @Override
    public void mover() {
        System.out.println("O carro está se movendo.");
    }

    @Override
    public void parar() {
        System.out.println("O carro parou.");
    }
}


class Bicicleta extends Veiculo {
    @Override
    public void mover() {
        System.out.println("A bicicleta está se movendo.");
    }

    @Override
    public void parar() {
        System.out.println("A bicicleta parou.");
    }
}
