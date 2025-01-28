package Questao04;

abstract class AnimalAquático implements Nadar {
 @Override
 public void nadar() {
     System.out.println("O animal aquático está nadando.");
 }
}

class Golfinho extends AnimalAquático implements Voar {
 @Override
 public void voar() {
     System.out.println("O golfinho não pode voar, mas pode saltar.");
 }
}
