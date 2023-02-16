import java.util.ArrayList;

public class Pais {

    private String codigoIso;
    private String nome;
    private int populacao;
    private double dimensao;
    private Pais[] vizinhos;
    private int tlVizinho;

    public Pais(String codigoIso, String nome, int populacao, double dimensao, Pais[] vizinhos, int tlVizinho) {
        this.codigoIso = codigoIso;
        this.nome = nome;
        this.populacao = populacao;
        this.dimensao = dimensao;
        this.vizinhos = vizinhos;
        this.tlVizinho = tlVizinho;
    }

    // GET
    public String getCodigoIso() {
        return this.codigoIso;
    }

    public String getNome() {
        return this.nome;
    }

    public int getPopulacao() {
        return this.populacao;
    }

    public double getDimensao() {
        return this.dimensao;
    }

    // SET
    public void setCodigoIso(String newvalue) {
        this.codigoIso = newvalue;
    }

    public void setNome(String newvalue) {
        this.nome = newvalue;
    }

    public void setPopulacao(int newvalue) {
        this.populacao = newvalue;
        ;
    }

    public void setDimensao(double newvalue) {
        this.dimensao = newvalue;
    }

    public void inserirVizinho(Pais vizinho) {
        if (this.tlVizinho < 5) {
            this.vizinhos[tlVizinho] = vizinho;
            this.tlVizinho++;
        } else
            System.out.println("Não tem como inserir mais vizinhos");
    }

    public boolean isIsoCodeEqual(Pais p1) {
        if (p1.codigoIso.equals(this.codigoIso))
            return true;
        return false;
    }

    public boolean isVizinho(Pais p) {
        for (Pais pais : this.vizinhos) {
            if (pais.nome.equals(p.nome))
                return true;
        }
        return false;
    }

    public double getDensidadePopulacional() {
        return this.populacao / this.dimensao;
    }

    public ArrayList<Pais> getSameVizinhos(Pais p) {
        ArrayList<Pais> arrayPais = new ArrayList<>();
        for (int i = 0; i < this.tlVizinho; i++) {
            for (int j = 0; j < p.vizinhos.length; j++) {
                if (this.vizinhos[i].equals(p.vizinhos[j])) {
                    if (!arrayPais.contains(this.vizinhos[i]))
                        arrayPais.add(this.vizinhos[i]);
                }
            }
        }
        return arrayPais;
    }

    public static void main(String[] args)
            throws Exception {
        // Criando alguns objetos Pais
        Pais[] brasilVizinhos = new Pais[3];
        brasilVizinhos[0] = new Pais("UY", "Uruguai", 3477000, 176215, new Pais[] {}, 0);
        brasilVizinhos[1] = new Pais("AR", "Argentina", 44938712, 2780400, new Pais[] {}, 0);
        brasilVizinhos[2] = new Pais("PY", "Paraguai", 7152703, 406752, new Pais[] {}, 0);

        Pais brasil = new Pais("BR", "Brasil", 209500000, 8515767, brasilVizinhos, 3);

        Pais argentina = new Pais("AR", "Argentina", 44938712, 2780400, null, 0);
        Pais uruguai = new Pais("UY", "Uruguai", 3477000, 176215, new Pais[] { brasil, argentina }, 2);
        Pais chile = new Pais("CL", "Chile", 19116209, 756096.3, new Pais[] { uruguai, argentina }, 2);

        // Obtendo a lista de países que são vizinhos comuns de Chile e Uruguai
        ArrayList<Pais> vizinhosComuns = chile.getSameVizinhos(brasil);
        System.out.println("Vizinhos comuns de Chile e Uruguai: ");
        for (Pais vizinho : vizinhosComuns) {
            System.out.println(vizinho.getNome());
        }

        // Calculando a densidade populacional do Chile
        double densidadePopulacional = chile.getDensidadePopulacional();
        System.out.println("Densidade populacional do Chile: " + densidadePopulacional + " habitantes por km².");
    }
}
