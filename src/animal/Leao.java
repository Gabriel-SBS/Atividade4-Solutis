package animal;

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
		distancia += 200;
		System.out.println("O leão se moveu 150 metros.");
	}
	
	@Override
	public void dormir() {
		sono += 18;
        System.out.println("O leão dormiu por 18 horas.");
	}
}