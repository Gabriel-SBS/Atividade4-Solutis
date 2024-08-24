package animal.model;

public abstract class AnimalTerrestreAB extends AnimalAB {

	protected int quantidadePatas;
	
	public AnimalTerrestreAB(String nome, String tipo, int idade, String habitat, double altura, double peso, int quantidadePatas) {
        super(nome, tipo, idade, habitat, altura, peso);
        this.quantidadePatas = quantidadePatas;
    }
	
	public abstract void andar();
	
	@Override
	public void moverse() {
		andar();
	}
	
	@Override
	public String toString() {
        return super.toString() +
               "\nQuantidade de Patas: " + quantidadePatas;
    }
}

