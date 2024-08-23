package animal;

public class Main {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("Rex", 5, "Doméstico", 0.6, 20.0);
        Gato gato = new Gato("Felix", 3, "Doméstico", 0.3, 4.0);
        Elefante elefante = new Elefante("Dumbo", 10, "Savanas", 3.5, 6000.0);
        Leao leao = new Leao("Simba", 8, "Savanas", 1.2, 190.0);
        Pombo pombo = new Pombo("Correio", 3, "Urbano", 0.3, 0.5, 1.0);
        Peixe peixe = new Peixe("Nemo", 2, "Mar", 0.2, 0.4);

        cachorro.comer();
        cachorro.moverse();
        cachorro.dormir();
        System.out.println("\n" + cachorro.toString() + "\n");

        gato.comer();
        gato.moverse();
        gato.dormir();
        System.out.println("\n" + gato.toString() + "\n");

        elefante.comer();
        elefante.moverse();
        elefante.dormir();
        System.out.println("\n" + elefante.toString() + "\n");

        leao.comer();
        leao.moverse();
        leao.dormir();
        System.out.println("\n" + leao.toString() + "\n");

        pombo.comer();
        pombo.moverse();
        pombo.dormir();
        System.out.println("\n" + pombo.toString() + "\n");

        peixe.comer();
        peixe.moverse();
        peixe.dormir();
        System.out.println("\n" + peixe.toString() + "\n");
    }
}

