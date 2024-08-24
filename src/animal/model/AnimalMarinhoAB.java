package animal.model;

public abstract class AnimalMarinhoAB extends AnimalAB {
	
	protected int quantidadePatas;
	
	public AnimalMarinhoAB(String nome, String tipo, int idade, String habitat, double altura, double peso, int quantidadePatas) {
        super(nome, tipo, idade, habitat, altura, peso);
        this.quantidadePatas = quantidadePatas;
    }
	
	public abstract void nadar();
	
	@Override
	public void moverse() {
		nadar();
	}
	
	@Override
    public String toString() {
        return super.toString() +
               "\nQuantidade de Patas: " + quantidadePatas;
    }

}
