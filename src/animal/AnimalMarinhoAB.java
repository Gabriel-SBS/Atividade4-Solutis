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
				"\nHoras dormidas: " + sono + " horas";
	}

}
