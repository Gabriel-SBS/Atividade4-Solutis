package animal.entities;

import animal.model.AnimalMarinhoAB;

public class Peixe extends AnimalMarinhoAB {

	public Peixe(String nome, int idade, String habitat, double altura, double peso, int quantidadePatas) {
        super(nome, "Peixe", idade, habitat, altura, peso, quantidadePatas);
    }
	
	@Override
	public void comer() {
		comida += 5;
		System.out.println("O peixe comeu 5 gramas de comida.");
	}
	
	@Override
	public void nadar() {
		distancia += 50;
		System.out.println("O peixe nadou 50 metros.");
	}
	
	@Override
	public void dormir() {
		sono += 10;
		System.out.println("O peixe dormiu por 10 horas");
	}
}