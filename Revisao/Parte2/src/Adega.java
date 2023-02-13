import java.time.LocalDate;
import java.util.Random;

public class Adega {

    private Vinho[][] armazem;

    public Adega(){
        this.armazem = new Vinho[20][10];
    }

    public void putAdega(Vinho v,int posicao){
        int aux = 0;
        for(int i=0;i<armazem.length;i++)
            for(int j=0;j<armazem[i].length;j++){
                if(aux == posicao-1)
                    if(armazem[i][j] == null)
                        armazem[i][j]=v;
                    else
                        System.out.println("Posição já ocupada");
                aux++;
            }      
    }

    public void putRandomAdega(Vinho v){
        int aux = 0;
        Random random = new Random();
        int posicao = random.nextInt(1, 201);
        for(int i=0;i<armazem.length;i++)
            for(int j=0;j<armazem[i].length;j++){
                if(aux == posicao)
                    if(armazem[i][j] == null)
                        armazem[i][j]=v;
                    else
                        System.out.println("Posição já ocupada");
                aux++;
            }      
    }

    public int getQuantidadeVinhosTipo(String tipo){
        int quantidade = 0;
        for(int i=0;i<armazem.length;i++)
            for(int j=0;j<armazem[i].length;j++)
                if(armazem[i][j].getTipo().equals(tipo))
                    quantidade++;
        return quantidade;
    }

    public int getQuantidadeTotalVinhos(){
        int quantidade = 0;
        for(int i=0;i<armazem.length;i++)
            for(int j=0;j<armazem[i].length;j++)
            if(armazem[i][j] != null)
                quantidade++;
        return quantidade;
    }

    public double getValorTotal(){
        double valor=0;
        for(int i=0;i<armazem.length;i++)
            for(int j=0;j<armazem[i].length;j++)
                if(armazem[i][j] != null)
                    valor += armazem[i][j].getValor();
        return valor;
    }

    public Vinho getOldestVinho(){
        LocalDate oldestDate = armazem[0][0].getDataProducao();
        Vinho v = armazem[0][0];
        for(int i=0;i<armazem.length;i++)
            for(int j=0;j<armazem[i].length;j++)
                if(armazem[i][j] != null)
                    if(oldestDate.isAfter(armazem[i][j].getDataProducao())){
                        oldestDate= armazem[i][j].getDataProducao();
                        v= armazem[i][j];
                    }
        return v;
    }

    public boolean popVinho(Vinho v){
        boolean flag;
        flag =false;
        for(int i=0;i<armazem.length;i++)
            for(int j=0;j<armazem[i].length;j++)
                if(armazem[i][j].equals(v)){
                    flag=true;
                    armazem[i][j]=null;
                }
        return flag;
    }



}
