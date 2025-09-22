package muebles;

public class Mueble {
    private String tipo;
    private String madera;
    private String color;
    private double peso;
    private double valorVenta;
    private double costoProduccion;
    private int stock;

    public Mueble(String tipo, String madera, String color, double peso, int costoProduccion, int stock){
        this.tipo = tipo;
        this.madera = madera;
        this.color = color;
        this.peso = peso;
        this.costoProduccion = costoProduccion;
        this.stock = stock;
    }
    //setters
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setMadera(String madera) {
        this.madera = madera;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public void setCostoProduccion(int costoProduccion) {
        this.costoProduccion = costoProduccion;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }
    //getters
    public String getColor() {
        return color;
    }
    public double getCostoProduccion() {
        return costoProduccion;
    }
    public String getMadera() {
        return madera;
    }
    public double getPeso() {
        return peso;
    }
    public String getTipo() {
        return tipo;
    }
    public double getValorVenta() {
       valorVenta = (costoProduccion * 1.35);
       return valorVenta;
    }
    public int getStock() {
        return stock;
    }
    

}
