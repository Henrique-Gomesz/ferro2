import java.time.LocalDate;

public class Vinho{
    private String tipo;

    private String marca;

    private double volume;

    private LocalDate dataProducao;

    private double valor;

    public Vinho(double valor,String tipo,String marca,double volume,LocalDate dataProducao){
        this.dataProducao=dataProducao;
        this.marca=marca;
        this.tipo=tipo;
        this.volume=volume;
        this.valor=valor;
    }

    public String getTipo(){
        return this.tipo;
    }

    public String getMarca(){
        return this.marca;
    }

    public double getVolume(){
        return this.volume;
    }

    public LocalDate getDataProducao(){
        return this.dataProducao;
    }

    public double getValor(){
        return this.valor;
    }

}