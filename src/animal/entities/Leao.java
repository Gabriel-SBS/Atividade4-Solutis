package animal.entities;

import animal.model.AnimalTerrestreAB;

public class Leao extends AnimalTerrestreAB {
	
	public Leao(String nome, int idade, String habitat, double altura, double peso) {
        super(nome, "Leão", idade, habitat, altura, peso, 4);
    }
	
	@Override
	public void comer() {
		comida += 7000;
		System.out.println("O leão comeu 7kg de comida.");
	}

	@Override
	public void andar() {
		distancia += 800;
		System.out.println("O leão se moveu 800 metros.");
	}
	
	@Override
	public void dormir() {
		sono += 18;
        System.out.println("O leão dormiu por 18 horas.");
	}
}