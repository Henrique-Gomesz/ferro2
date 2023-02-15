
public class Pais {

    private String codigoIso;
    private String nome;
    private int populacao;
    private double dimensao;
    private Pais[] vizinhos;
    private int tlVizinho;

    public Pais(String codigoIso, String nome, int populacao, double dimensao) {
        this.codigoIso = codigoIso;
        this.dimensao = dimensao;
        this.nome = nome;
        this.populacao = populacao;
        this.tlVizinho = 0;
        this.vizinhos = new Pais[5];
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

    public Pais[] getSameVizinhos(Pais p){
        int tl=0;
        for(int i=0;i<this.tlVizinho;i++)
        {
            for(int j =0; j< p)
        }
    }
    public static void main(String[] args)
            throws Exception {
        System.out.println("Hello, World!");
        System.out.println("asdasd");
        System.out.println("macaco");

    }
}
