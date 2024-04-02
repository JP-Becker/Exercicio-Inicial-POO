package model;

public class Veiculo {
    private int distancia;
    private double litros;
    
    public Veiculo() {
        this(0, 0);
    }
    
    public Veiculo(int distancia, double litros) {
        this.distancia = distancia;
        this.litros = litros;
    }
    
    public int getDistancia() {
        return distancia;
    }
    
    public void setDistancia(int distancia){
        this.distancia = distancia;
    }
    
    public double getLitros() {
        return litros;
    }
    
    public void setLitros(double litros) {
        this.litros = litros;
    }
    
    public double getConsumo() {
        return (getDistancia()/getLitros());
    }
}
