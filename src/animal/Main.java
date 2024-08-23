package animal;

public class Main {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("Rex", 5, "Doméstico", 0.6, 20.0);
        Gato gato = new Gato("Felix", 3, "Doméstico", 0.3, 4.0);
        Elefante elefante = new Elefante("Dumbo", 10, "Savanas", 3.5, 6000.0);
        Leao leao = new Leao("Simba", 8, "Savanas", 1.2, 190.0);
        Pombo pombo = new Pombo("Pombo Correio", 3, "Urbano", 0.3, 0.5, 1.0);
        Peixe peixe = new Peixe("Dourado", 2, "Rio", 0.2, 0.4);

        cachorro.comer();
        cachorro.moverse();
        cachorro.dormir();
        cachorro.exibir();

        gato.comer();
        gato.moverse();
        gato.dormir();
        gato.exibir();

        elefante.comer();
        elefante.moverse();
        elefante.dormir();
        elefante.exibir();

        leao.comer();
        leao.moverse();
        leao.dormir();
        leao.exibir();

        pombo.comer();
        pombo.moverse();
        pombo.dormir();
        pombo.exibir();

        peixe.comer();
        peixe.moverse();
        peixe.dormir();
        peixe.exibir();
    }
}

