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
					"\nQuantidade de patas: " + quantidadePatas;
	}
}

