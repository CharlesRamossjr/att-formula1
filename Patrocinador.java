package formula1;

public class Patrocinador {
    private String nome;
    private double valorPatrocinio;

    public Patrocinador(String nome, double valorPatrocinio) {
        this.nome = nome;
        this.valorPatrocinio = valorPatrocinio;
    }

    public void exibirDados() {
        System.out.println(nome + " - R$ " + valorPatrocinio);
    }
}