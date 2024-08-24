package animal.model;

public abstract class AnimalVoadorAB extends AnimalAB{
	protected int quantidadeAsas;
    protected double envergaduraAsas;
    protected int quantidadePatas;
	
    public AnimalVoadorAB(String nome, String tipo, int idade, String habitat, double altura, double peso, int quantidadeAsas, double envergaduraAsas, int quantidadePatas) {
        super(nome, tipo, idade, habitat, altura, peso);
        this.quantidadeAsas = quantidadeAsas;
        this.envergaduraAsas = envergaduraAsas;
        this.quantidadePatas = quantidadePatas;
    }
    
	public abstract void voar();
	
	@Override
	public void moverse() {
		voar();
	}
	
	@Override
    public String toString() {
        return super.toString() + "\n" +
                "Quantidade de Asas: " + quantidadeAsas + "\n" +
                "Envergadura das Asas: " + envergaduraAsas + "\n" +
                "Quantidade de Patas: " + quantidadePatas + "\n";
    }
	
}
