/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mccow.Administracion;

import mccow.Almacen.Bebida;
import mccow.Almacen.Hamburguesa;
import mccow.Enums.TipoPedido;
import java.util.ArrayList;

/**
 *
 * @author enrique
 */
public class Pedido{
    private Bebida bebida;
    private Hamburguesa hamburguesa;
    private double precio;
    private double exp;
    private ArrayList<Object> pedidoRealizado;
    private TipoPedido tipo;
    
    public Pedido(Bebida b,Hamburguesa h){
        this.bebida = b;
        this.hamburguesa = h;
        this.pedidoRealizado = new ArrayList<>();
        this.pedidoRealizado.add(this.bebida);
        this.pedidoRealizado.add(this.hamburguesa);
        this.precio=Bebida.PRECIO_VENTA+Hamburguesa.PRECIO_VENTA;
        this.exp = Bebida.EXP+Hamburguesa.EXP;
        this.tipo = TipoPedido.MENU;
    }
    public Pedido(Hamburguesa h){
        this(null,h);
        this.precio=Hamburguesa.PRECIO_VENTA;
        this.exp = Hamburguesa.EXP;
        this.tipo = TipoPedido.SIMPLE;
    }

    public Pedido(Pedido origninal){
        this(origninal.bebida,origninal.hamburguesa);
    }
    public double getPrecio(){
        return this.precio;
    }
    public double getExp(){
        return this.exp;
    }
    public TipoPedido getTipoPedido(){
        return this.tipo;
    }
    
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(" El Pedido {");
        sb.append(" Tipo = ").append(tipo).append("");
        sb.append(" Precio = ").append(precio).append("");
        sb.append(" Experiencia = ").append(exp).append("} ");
        return sb.toString();
    }
}
