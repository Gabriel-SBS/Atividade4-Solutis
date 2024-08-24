package animal.entities;

import animal.model.AnimalTerrestreAB;

public class Gato extends AnimalTerrestreAB {
	
    public Gato(String nome, int idade, String habitat, double altura, double peso) {
        super(nome, "Gato", idade, habitat, altura, peso, 4);
    }
	
	@Override
	public void comer() {
		comida += 70;
		System.out.println("O gato comeu 70 gramas de comida.");
	}

	@Override
	public void andar() {
		distancia += 50;
		System.out.println("O gato se moveu 50 metros.");
	}
	
	@Override
	public void dormir() {
		sono += 15;
        System.out.println("O gato dormiu por 15 horas.");
	}
}