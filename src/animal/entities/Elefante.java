package animal.entities;

import animal.model.AnimalTerrestreAB;

public class Elefante extends AnimalTerrestreAB {
	
    public Elefante(String nome, int idade, String habitat, double altura, double peso) {
        super(nome, "Elefante", idade, habitat, altura, peso, 4);
    }

	@Override
	public void comer() {
		comida += 200000;
		System.out.println("O elefante comeu 200kg de comida.");
	}

	@Override
	public void andar() {
		distancia += 500;
		System.out.println("O elefante se moveu 500 metros.");
	}
	
	@Override
	public void dormir() {
		sono += 2;
        System.out.println("O elefante dormiu por 2 horas.");
	}
}