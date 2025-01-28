package Questao04;

class Pato implements Voar, Nadar {
 @Override
 public void voar() {
     System.out.println("O pato está voando.");
 }

 @Override
 public void nadar() {
     System.out.println("O pato está nadando.");
 }
}
