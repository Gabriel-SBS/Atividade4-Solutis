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
	public String toString() {
		return "Nome: " + nome + 
				"\nTipo: " + tipo + 
				"\nIdade: " + idade + " anos" +
				"\nHabitat: " + habitat + 
				"\nAltura: " + altura + " metros" +
				"\nPeso: " + peso + " kg" +
				"\nComida ingerida: " + comida + " gramas" +
				"\nCaminho percorrido: " + distancia + " metros" +
				"\nHoras dormidas: " + sono + " horas" +
				"\nQuantidade de asas: " + quantidadeAsas +
				"\nEnvergadura das asas: " + envergaduraAsas + " metros";
				
	}
	
}
