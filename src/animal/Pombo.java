package animal;

public class Pombo extends AnimalVoadorAB {

	public Pombo(String nome, int idade, String habitat, double altura, double peso, double envergaduraAsas) {
        super(nome, "Pombo", idade, habitat, altura, peso, 2, envergaduraAsas);
    }
	
	@Override
	public void comer() {
		comida += 60;
		System.out.println("O pombo comeu 60 gramas de comida.");
	}
	
	@Override
	public void voar() {
		distancia += 1000;
		System.out.println("O pombo voou 1000 metros.");
	}
	
	@Override
	public void dormir() {
		sono += 8;
		System.out.println("O pombo dormiu por 8 horas");
	}
}
