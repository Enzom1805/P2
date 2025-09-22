/*Una fábrica de muebles desea organizar su manufactura de manera electrónica. La
fábrica solo produce sillas, mesas y bancos. De cada uno de los productos guarda su
peso, su costo de fabricación, el valor de venta, el tipo de madera y el color. La fábrica
también posee un stock de productos disponibles. Se debe poder calcular el costo de
todos los productos en stock, ya sea precio de fabricación o precio de venta. El precio
de Venta es el precio de costo más un 35%
Consejo: Analizar Clase Vs Instancia
Extra: ¿Qué sucede si se agrega un producto cuyo precio de venta es el 10% más del
costo de fabricación? */
package muebles;

public class Fabrica {
  
    public static void main(String[] args) {
        Mueble m1 = new Mueble("Mesa", "Roble", "Negro", 4.6, 50000, 10);
        Mueble b1 = new Mueble("Banco", "Roble", "Negro", 2.6, 100000, 5);
        Mueble s1 = new Mueble("Silla", "Caoba", "Marron", 10.4, 30000, 3);
        
        System.out.println("Tipo de mueble: " + m1.getTipo() + " Madera de " + m1.getMadera() + " Color " +  m1.getColor() + " Stock disponible " + m1.getStock() + " Peso: " 
        + m1.getPeso() + " Costo de produccion " + m1.getCostoProduccion() +  
        " Costo total por stock: " + (m1.getCostoProduccion() * m1.getStock())  + " Valor de venta: " + m1.getValorVenta() + " Valor de venta total por stock: " + (m1.getValorVenta() * m1.getStock()));
        
        System.out.println("Tipo de mueble: " + b1.getTipo() + " Madera de " + b1.getMadera() + " Color " +  b1.getColor() + " Stock disponible " + b1.getStock() + " Peso: " 
        + b1.getPeso() + " Costo de produccion " + b1.getCostoProduccion() +  
        " Costo total por stock: " + (b1.getCostoProduccion() * b1.getStock())  + " Valor de venta: " + b1.getValorVenta() + " Valor de venta total por stock: " + (b1.getValorVenta() * b1.getStock()));
        
        System.out.println("Tipo de mueble: " + s1.getTipo() + " Madera de " + s1.getMadera() + " Color " +  s1.getColor() + " Stock disponible " + s1.getStock() + " Peso: " 
        + s1.getPeso() + " Costo de produccion " + s1.getCostoProduccion() +  
        " Costo total por stock: " + (s1.getCostoProduccion() * s1.getStock())  + " Valor de venta: " + s1.getValorVenta() + " Valor de venta total por stock: " + (s1.getValorVenta() * s1.getStock()));
        System.out.println(b1);
    }
    
}
