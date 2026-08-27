package formula1;

public class CarroF1 {
    private int numero;
    private int posicao;
    private Equipe equipe;
    private Piloto piloto;

    public CarroF1(int numero, int posicao, Equipe equipe, Piloto piloto) {
        this.numero = numero;
        this.posicao = posicao;
        this.equipe = equipe;
        this.piloto = piloto;
    }

    public void exibirDados() {
        System.out.println("Número do carro: " + numero);
        System.out.println("Posição: " + posicao);

        equipe.exibirDados();
        piloto.exibirDados();
    }
}
