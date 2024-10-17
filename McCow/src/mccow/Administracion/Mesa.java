/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mccow.Administracion;

import mccow.Almacen.Bebida;
import mccow.Almacen.Hamburguesa;
import java.util.ArrayList;

/**
 *
 * @author enrique
 */
public class Mesa{
    
    public static final String ICONO = " ";
    public static final int DURACION = 2;
    public static final int PRECIO_VENTA = 2;
    
    private String icono;
    private int duracionMesa;
    private double experienciaRecolectada;
    private int precioVenta;
    private ArrayList<Pedido> pedidos;
    private int n_pedido;
    private double ingresos;
    
    
    public Mesa(String icono, int duracionMesa, int precioVenta){
        this.icono = icono;
        this.duracionMesa = duracionMesa;
        this.experienciaRecolectada = 0;
        this.precioVenta = precioVenta;
        this.pedidos = new ArrayList<>();
        this.n_pedido = 0;
        this.ingresos = 0;
    }
    public Mesa(){
        this(ICONO,DURACION,PRECIO_VENTA);
    }
    public Mesa(Mesa otraMesa){
        this(otraMesa.icono,otraMesa.duracionMesa,otraMesa.precioVenta);
    }
    
    // getters / setters
    public String getIcono(){
        return this.icono;
    }
    public int getDuracion(){
        return this.duracionMesa;
    }
    public double getEXP(){
        return this.experienciaRecolectada;
    }
    public int getPrecioVenta(){
        return this.precioVenta;
    }
    public int getNPedidos(){
        return this.n_pedido;
    }
    public double getIngresos(){
        return this.ingresos;
    }
    
    public void anadirMenu(){
        Hamburguesa h = new Hamburguesa();
        Bebida b = new Bebida();
        Pedido nuevo = new Pedido(b, h);
        
        this.pedidos.add(nuevo);
        this.n_pedido++;
        
        this.ingresos += this.pedidos.getLast().getPrecio();
        this.experienciaRecolectada += this.pedidos.getLast().getExp();
    }
    public void anadirSimple(){
        Hamburguesa h = new Hamburguesa();
        Pedido nuevo = new Pedido(h);
        
        this.pedidos.add(nuevo);
        this.n_pedido++;
        
        this.ingresos += this.pedidos.getLast().getPrecio();
        this.experienciaRecolectada += this.pedidos.getLast().getExp();
    }
    
    public void verPedidos(){
        for(Pedido pedido: this.pedidos){
            var p = pedido.getPedido();
            System.out.println(p);
        }
    }
}
