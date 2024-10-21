/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mccow.Pradera;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author enrique
 */
public class Vaca {
    public static final String ICONO = "";
    public static final double PRECIOVENTA = 5.5;
    public static final double PRECIOCOMPRA = 10.5;
    public static final int DURACIONVIDA = 10;
    
    
    private int numeroVaca;
    private int filetesProducidos;
    
    private String icono;
    private double precioVenta;
    private double precioCompra;
    private int duracionVida;
    
    
    public Vaca(String icono,double precioVenta,double precioCompra, int duracionVida){
        this.icono = icono;
        this.precioVenta = precioVenta;
        this.precioCompra = precioCompra;
        this.duracionVida = duracionVida;
        this.filetesProducidos = generarFiletes();
        this.numeroVaca = 0;
    }
    public Vaca(){
        this(ICONO,PRECIOVENTA,PRECIOCOMPRA,DURACIONVIDA);
    }
    
    ////////////////////////////////////////////////

    public int getNumeroVaca() {
        return numeroVaca;
    }

    public void setNumeroVaca(int numeroVaca) {
        this.numeroVaca = numeroVaca;
    }

    public int getFiletesProducidos() {
        return filetesProducidos;
    }

    public void setFiletesProducidos(int filetesProducidos) {
        this.filetesProducidos = filetesProducidos;
    }

    public String getIcono() {
        return icono;
    }

    public void setIcono(String icono) {
        this.icono = icono;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public double getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(double precioCompra) {
        this.precioCompra = precioCompra;
    }

    public int getDuracionVida() {
        return duracionVida;
    }

    public void setDuracionVida(int duracionVida) {
        this.duracionVida = duracionVida;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nVaca{");
        sb.append("numeroVaca=").append(numeroVaca);
        sb.append(", filetesProducidos=").append(filetesProducidos);
        sb.append(", icono=").append(icono);
        sb.append(", precioVenta=").append(precioVenta);
        sb.append(", precioCompra=").append(precioCompra);
        sb.append(", duracionVida=").append(duracionVida);
        sb.append('}');
        return sb.toString();
    }

    
    
    
    
    ////////////////////////////////////////////////
    
    public int generarFiletes(){
        Random filetesAleatorios = new Random();
        int min = 3;int max = 7;
        int f_a = filetesAleatorios.nextInt(min,max);
        setFiletesProducidos(f_a);
        return f_a;
    }
    
}
