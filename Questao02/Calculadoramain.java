package Questao02;

public class Calculadoramain {
	   public static void main(String[] args) {
	       Calculadora calc = new Calculadora();

	       int somaInteiros = calc.somar(5, 10);
	       double somaDoubles = calc.somar(5.5, 10.5);

	       System.out.println("Soma de inteiros: " + somaInteiros);
	       System.out.println("Soma de doubles: " + somaDoubles);   
	    }
	}