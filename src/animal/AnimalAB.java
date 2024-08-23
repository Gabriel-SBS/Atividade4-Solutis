package animal;

public abstract class AnimalAB implements AnimalIF {
	
	protected String nome;
    protected String tipo;
    protected int idade;
    protected String habitat;
    protected double altura;
    protected double peso;
    
	protected int comida;
	protected int distancia;
	protected int sono;
	
	public AnimalAB(String nome, String tipo, int idade, String habitat, double altura, double peso) {
		this.nome = nome;
		this.tipo = tipo;
		this.idade = idade;
		this.habitat = habitat;
		this.altura = altura;
		this.peso = peso;
		this.comida = 0;
		this.distancia = 0;
		this.sono = 0;
	}
	
	@Override
	public abstract void comer();

	@Override
	public abstract void moverse();

	@Override
	public abstract void dormir();
	
	@Override
    public abstract String toString();
	
	public void exibir() {
		System.out.println("Nome: " + nome);
        System.out.println("Tipo: " + tipo);
        System.out.println("Idade: " + idade + " anos");
        System.out.println("Habitat: " + habitat);
        System.out.println("Altura: " + altura + " metros");
        System.out.println("Peso: " + peso + " kg");
		System.out.println("Comida ingerida: " + comida + " gramas");
        System.out.println("Caminho percorrido: " + distancia + " metros");
        System.out.println("Horas dormidas: " + sono + " horas");
        System.out.println();
	}

}
