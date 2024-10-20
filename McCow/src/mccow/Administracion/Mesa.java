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
    private int numeroMesa;
    
    
    public Mesa(String icono, int duracionMesa, int precioVenta){
        this.icono = icono;
        this.duracionMesa = duracionMesa;
        this.experienciaRecolectada = 0;
        this.precioVenta = precioVenta;
        this.pedidos = new ArrayList<>();
        this.n_pedido = 0;
        this.ingresos = 0;
        this.numeroMesa = 0;
    }
    public Mesa(){
        this(ICONO,DURACION,PRECIO_VENTA);
    }
    public Mesa(Mesa otraMesa){
        this(otraMesa.icono,otraMesa.duracionMesa,otraMesa.precioVenta);
    }
    
    ///////////////////////////////////////////////////////////
    public String getIcono(){
        return this.icono;
    }
    public int getDuracionMesa(){
        return this.duracionMesa;
    }
    public double getExperienciaRecolectada() {
        return experienciaRecolectada;
    }
    public ArrayList<Pedido> getPedidos() {
        return pedidos;
    }
    public int getN_pedido() {
        return n_pedido;
    }
    public int getPrecioVenta(){
        return this.precioVenta;
    }
    public double getIngresos(){
        return this.ingresos;
    }
    public int getNumeroMesa(){
        return this.numeroMesa;
    }
    
    public void setIcono(String icono) {
        this.icono = icono;
    }
    public void setDuracionMesa(int duracionMesa) {
        this.duracionMesa = duracionMesa;
    }
    public void setPrecioVenta(int precioVenta) {
        this.precioVenta = precioVenta;
    }
    public void setIngresos(double ingresos) {
        this.ingresos = ingresos;
    }
    public void setNumeroMesa(int numeroMesas){
        this.numeroMesa = numeroMesas;
    }
    public void setN_pedido(int n_pedido) {
        this.n_pedido = n_pedido;
    }
    public void setExperienciaRecolectada(double experienciaRecolectada) {
        this.experienciaRecolectada = experienciaRecolectada;
    }
    public void setPedidos(ArrayList<Pedido> pedidos) {
        this.pedidos = pedidos;
    }
    ////////////////////////////////////////////////
    
    
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Mesa {\n");
        sb.append("     Ingresos = ").append(ingresos).append("\n");
        sb.append("     Expreciencia Recolectada = ").append(experienciaRecolectada).append("\n");
        sb.append("     Pedidos Realizados = ").append(n_pedido).append("\n");
        sb.append("     Los pedidos son = \n");
        sb.append(pedidos);
        sb.append("\n}\n");
        return sb.toString();
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
            System.out.println(pedido);
        }
    }
    
    public void eliminarPedidos(){
        int i=n_pedido-1;
        for(;i>=0;i--){
            this.pedidos.remove((i));
        }
        this.n_pedido = 0;
    }
}
