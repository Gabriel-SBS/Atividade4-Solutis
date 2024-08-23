package animal;

public class Peixe extends AnimalMarinhoAB {

	public Peixe(String nome, int idade, String habitat, double altura, double peso) {
        super(nome, "Peixe", idade, habitat, altura, peso);
    }
	
	@Override
	public void comer() {
		comida += 5;
		System.out.println("O pombo comeu 60 gramas de comida.");
	}
	
	@Override
	public void nadar() {
		distancia += 1000;
		System.out.println("O pombo voou 1000 metros.");
	}
	
	@Override
	public void dormir() {
		sono += 8;
		System.out.println("O pombo dormiu por 8 horas");
	}
}