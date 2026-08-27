package formula1;

public class Teste {
    public static void main(String[] args) {

        // Patrocinadores
        Patrocinador p1 = new Patrocinador("Shell", 5000000);
        Patrocinador p2 = new Patrocinador("Santander", 3000000);

        Patrocinador[] patrocinadores = {p1, p2};

        // Equipe
        Equipe ferrari = new Equipe("Ferrari", 1929, patrocinadores);

        // Piloto
        Piloto piloto = new Piloto("Charles Leclerc", 28, "Mônaco", 8);

        // Engenheiro
        Engenheiro engenheiro = new Engenheiro(
                "Carlos Silva",
                40,
                "Brasil",
                piloto
        );

        // Carro
        CarroF1 carro = new CarroF1(16, 1, ferrari, piloto);

        // Exibir dados
        carro.exibirDados();

        System.out.println();

        engenheiro.exibirDados();
    }
}