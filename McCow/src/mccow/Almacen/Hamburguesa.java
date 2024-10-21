/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mccow.Almacen;

/**
 *
 * @author enrique
 */
public class Hamburguesa {
    public static final String ICONO = " ";
    public static final double EXP = 1.5;
    public static final int PRECIO_VENTA = 5;
    
    private String icono;
    private int precioVenta;
    private double exp;
    
    public Hamburguesa(String icono, int precioVenta){
        this.icono = icono;
        this.exp = EXP;
        this.precioVenta = precioVenta;
    }
    public Hamburguesa(){
        this(ICONO,PRECIO_VENTA);
    }
    public Hamburguesa(Hamburguesa original){
        this(original.icono,original.precioVenta);
    }
    
    // getters / setters
    public String getIcono(){
        return this.icono;
    }
    public int getPrecioVenta(){
        return this.precioVenta;
    }
    public double getExperiencia(){
        return this.exp;
    }
}
