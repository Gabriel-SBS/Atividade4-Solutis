package animal;

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
	    public void exibir() {
	        super.exibir();
	        System.out.println("Quantidade de patas: " + quantidadePatas);
	    }
}

