package formula1;

public class Engenheiro extends Pessoa {
    private Piloto piloto;

    public Engenheiro(String nome, int idade, String nacionalidade, Piloto piloto) {
        super(nome, idade, nacionalidade);
        this.piloto = piloto;
    }

    public void exibirDados() {
        System.out.println("Engenheiro: " + nome);
        System.out.println("Piloto com quem trabalha: " + piloto.nome);
    }
}