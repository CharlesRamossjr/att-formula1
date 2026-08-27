package formula1;

public class Equipe {
    private String nome;
    private int anoFundacao;
    private Patrocinador[] patrocinadores;

    public Equipe(String nome, int anoFundacao, Patrocinador[] patrocinadores) {
        this.nome = nome;
        this.anoFundacao = anoFundacao;
        this.patrocinadores = patrocinadores;
    }

    public void exibirDados() {
        System.out.println("Equipe: " + nome);
        System.out.println("Ano de fundação: " + anoFundacao);

        System.out.println("Patrocinadores:");
        for (Patrocinador p : patrocinadores) {
            p.exibirDados();
        }
    }
}