/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mccow;

import mccow.Administracion.Mesa;
import mccow.Enums.McCowEnum;
import mccow.Pradera.CampoVaca;
import mccow.AutoCar.AutoCow;

/**
 *
 * @author enrique
 * 
 * Clase Principal
 */

public class McCow {
    public static final String BARRA_ESTADO = " ";
    public static final McCowEnum NIVEL_ACTUAL = McCowEnum.INICIAL;
    
    private String nombre;
    private int filetes;
    private int bebidas;
    private double dinero;
    private Mesa []mesas;
    private int n_mesas;
    private int mesas_max;
    private CampoVaca campoVaca;
    private AutoCow autoCow;
    private McCowEnum nivel;
    private double expGanada;

    public McCow (){
        this.nombre = "McCow";
        this.filetes = 0;
        this.bebidas = 0;
        this.dinero = 25.0;
        this.expGanada = 0.0;
       
        this.nivel = NIVEL_ACTUAL;
       
        switch(nivel){
            case nivel.INICIAL:
                this.mesas_max=10;
                break;
            case nivel.INTERMEDIO:
                this.mesas_max=15;
                break;
            case nivel.FINAL:
                this.mesas_max=20;
                break;
            default:
                System.out.println("Error en la eleccion del nivel");
                break;
        }
        this.mesas = new Mesa[mesas_max];
        this.n_mesas = 0;
        this.campoVaca = new CampoVaca();
        this.autoCow = new AutoCow();
    }
   
   // getters / setters
    public String getNombre(){
        return this.nombre;
    }
    public  int getFiletes(){
        return this.filetes;
    }
    public  int getBebidas(){
        return this.bebidas;
    }
    public  double getDinero(){
        return this.dinero;
    }
    public int getMax_mesas(){
        return this.mesas_max;
    }
    public McCowEnum getNivel(){
        return this.nivel;
    }
    public double getExpGanada(){
        return this.expGanada;
    }
    public void informacion(){
        System.out.println(
            this.nombre+" --> \n"+
            "| Filetes: "+this.filetes+"\n"+
            "| Bebidas: "+this.bebidas+"\n"+
            "| Dinero: "+this.dinero+"\n"+
            "| Max Mesas: "+this.mesas_max+"\n"+
            "| N Mesas: "+this.n_mesas+"\n"+
            "| Nivel: "+this.nivel+"\n"+
            "| Experiencia Ganada: "+this.expGanada
        );
        System.out.println();
    }
   
   
   // Metodos de la clase
    public void comprarMesa(){
        this.mesas[this.n_mesas] = new Mesa();
        this.n_mesas++;
        this.dinero -= 5;
    }
    public void venderMesa(){
        this.mesas[this.n_mesas-1] = null;
        this.n_mesas--;
        this.dinero += 5;
    }
    public void verPedidoDeTodasMesas(){
        int i = 0;
        if (this.mesas[i].getNPedidos() > 0){
            for(; i<this.n_mesas;i++){
                System.out.println("Pedido de la mesa nº"+(i+1));
                this.mesas[i].verPedidos();
                System.out.println(" ");
            }
        }
    }
    public void comprarMenu(){
        int i = 0;
        for(; i<this.n_mesas;i++){
            this.mesas[i].anadirMenu();
        }  
    }
    public void comprarSimple(){
        int i = 0;
        for(; i<this.n_mesas;i++){
            this.mesas[i].anadirSimple();
        }  
    }
    public void verGananciasEnCurso(){
        int i = 0;
        if (this.mesas[i].getNPedidos() > 0){
            for(; i<this.n_mesas;i++){
               System.out.println("Dinero obtenido de la mesa nº"+(i+1)+": "+
               this.mesas[i].getIngresos());
               
            }
            
        }
    }
    public void verExpEnCurso(){
        int i = 0;
        if (this.mesas[i].getNPedidos() > 0){
            for(; i<this.n_mesas;i++){
               System.out.println("Experiencia obtenido de la mesa nº"+(i+1)+": "+
               this.mesas[i].getEXP());
               
            }
            
        }
    }

    public void comprarVacas(){

    }

    public void comprarBebidas(){

    }
}

