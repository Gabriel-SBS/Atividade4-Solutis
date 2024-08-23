package animal;

public abstract class AnimalVoadorAB extends AnimalAB{
	protected int quantidadeAsas;
    protected double envergaduraAsas;
	
    public AnimalVoadorAB(String nome, String tipo, int idade, String habitat, double altura, double peso, int quantidadeAsas, double envergaduraAsas) {
        super(nome, tipo, idade, habitat, altura, peso);
        this.quantidadeAsas = quantidadeAsas;
        this.envergaduraAsas = envergaduraAsas;
    }
    
	public abstract void voar();
	
	@Override
	public void moverse() {
		voar();
	}
	
	@Override
    public void exibir() {
        super.exibir();
        System.out.println("Quantidade de asas: " + quantidadeAsas);
        System.out.println("Envergadura das asas: " + envergaduraAsas + " metros");
    }
	
}
