package animal;

public class Cachorro extends AnimalTerrestreAB {
	
    public Cachorro(String nome, int idade, String habitat, double altura, double peso) {
        super(nome, "Cachorro", idade, habitat, altura, peso, 4);
    }
	
	@Override
	public void comer() {
		comida += 500;
		System.out.println("O cachorro comeu 500 gramas de comida.");
	}
	
	@Override
	public void dormir() {
		sono += 12;
        System.out.println("O cachorro dormiu por 12 horas.");
	}

	@Override
	public void andar() {
		distancia += 100;
		System.out.println("O cachorro se moveu 100 metros.");	
	}
}
