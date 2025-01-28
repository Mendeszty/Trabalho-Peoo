package Questao03;

public class Formamain {
    public static void main(String[] args) {
        Forma meuCirculo = new Circulo(5);
        Forma meuQuadrado = new Quadrado(4);

        System.out.println("Área do círculo: " + meuCirculo.calcularArea()); 
        System.out.println("Área do quadrado: " + meuQuadrado.calcularArea()); 
    }
}
