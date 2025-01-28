package Questao03;

abstract class Forma {
	 public abstract double calcularArea();
	}


	class Circulo extends Forma {
	 private double raio;

	 public Circulo(double raio) {
	     this.raio = raio;
	 }

	 @Override
	 public double calcularArea() {
	     return Math.PI * raio * raio; // Área do círculo
	 }
	}

	class Quadrado extends Forma {
	 private double lado;

	 public Quadrado(double lado) {
	     this.lado = lado;
	 }

	 @Override
	 public double calcularArea() {
	     return lado * lado; 
	 }
	}
