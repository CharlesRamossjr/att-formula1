package formula1;

public class Piloto extends Pessoa {
    private int numeroVitorias;

    public Piloto(String nome, int idade, String nacionalidade, int numeroVitorias) {
        super(nome, idade, nacionalidade);
        this.numeroVitorias = numeroVitorias;
    }

    public void exibirDados() {
        System.out.println("Piloto: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Nacionalidade: " + nacionalidade);
        System.out.println("Vitórias: " + numeroVitorias);
    }
}