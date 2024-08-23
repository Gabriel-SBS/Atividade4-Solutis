package animal;

public abstract class AnimalMarinhoAB extends AnimalAB {
	
	public AnimalMarinhoAB(String nome, String tipo, int idade, String habitat, double altura, double peso) {
        super(nome, tipo, idade, habitat, altura, peso);
    }
	
	public abstract void nadar();
	
	@Override
	public void moverse() {
		nadar();
	}

}
