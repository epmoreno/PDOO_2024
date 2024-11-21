/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mccow;

import mccow.Administracion.Mesa;
import mccow.Enums.McCowEnum;
import mccow.Pradera.CampoVaca;
import mccow.AutoCar.AutoCow;
import mccow.Pradera.Vaca;
import mccow.Almacen.Bebida;

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
                System.err.println("Error en la eleccion del nivel");
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
    public int getN_mesas(){
        return this.n_mesas;
    }
    public McCowEnum getNivel(){
        return this.nivel;
    }
    public double getExpGanada(){
        return this.expGanada;
    }
    public Mesa[] getMesas() {
        return mesas;
    }

    public void setMesas(Mesa[] mesas) {
        this.mesas = mesas;
    }

    public int getMesas_max() {
        return mesas_max;
    }

    public void setMesas_max(int mesas_max) {
        this.mesas_max = mesas_max;
    }

    public CampoVaca getCampoVaca() {
        return campoVaca;
    }

    public void setCampoVaca(CampoVaca campoVaca) {
        this.campoVaca = campoVaca;
    }

    public AutoCow getAutoCow() {
        return autoCow;
    }

    public void setAutoCow(AutoCow autoCow) {
        this.autoCow = autoCow;
    }
    public void verMesa(int n){
        System.out.println("\nMesa Numero "+(n+1)+" : \n"+mesas[n]);
    }
    
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("McCow {\n");
        sb.append("     Filetes = ").append(filetes).append("\n");
        sb.append("     Bebidas = ").append(bebidas).append("\n");
        sb.append("     Dinero = ").append(dinero).append("\n");
        sb.append("     Maximo de Mesas = ").append(mesas_max).append("\n");
        sb.append("     Numero de Mesas'(Activas)' = ").append(n_mesas).append("\n");
        sb.append("     Nivel Actual = ").append(nivel).append("\n");
        sb.append("     Experiencia actual = ").append(expGanada).append("\n");
        sb.append("}\n");
        return sb.toString();
    }
   
   
   // Metodos de la clase
    public void comprarMesa(){
        this.mesas[this.n_mesas] = new Mesa();
        this.mesas[this.n_mesas].setNumeroMesa(this.n_mesas);
        this.n_mesas++;
        this.dinero -= 5;
    }
    public void venderMesa(){
        this.mesas[this.n_mesas-1] = null;
        this.n_mesas--;
        this.dinero += 5;
    }
    public void verInformacionDeTodasMesas(){
        int i = 0;
        for(; i<this.n_mesas;i++){
            System.out.println("Informacion de la mesa nº"+(i+1));
            System.out.println(this.mesas[i]);
        }
    }
    public void verInformacionDePradera(){
        System.out.println(this.campoVaca);
    }

    public void generarPedido(){
        int i = 0;
        for(; i<this.n_mesas;i++){
            this.mesas[i].generarPedido();
        }  
    }
    public void comprarMenuTodas(){
        int i = 0;
        for(; i<this.n_mesas;i++){
            this.mesas[i].anadirMenu();
        }  
    }
    public void comprarSimpleTodas(){
        int i = 0;
        for(; i<this.n_mesas;i++){
            this.mesas[i].anadirSimple();
        }  
    }
    public void verGananciasEnCurso(){
        int i = 0;
        int ingresoT = 0;
        if (this.mesas[i].getN_pedido()> 0){
            for(; i<this.n_mesas;i++){
               ingresoT += this.mesas[i].getIngresos();
            }
            System.out.println("Ingresos Totales: "+ingresoT);
            
        }
    }
    public void verExpEnCurso(){
        int i = 0;
        if (this.mesas[i].getN_pedido()> 0){
            int expT=0;
            for(; i<this.n_mesas;i++){
               expT += this.mesas[i].getExperienciaRecolectada();
            }
            System.out.println("Experiencia Total Obtenida es de: "+expT);
        }
    }
    
    public void recibirDineroExp(){
        int i=0;
        for(;i<this.n_mesas;i++){
            this.dinero += this.mesas[i].getIngresos();
            this.mesas[i].setIngresos(0);
            this.expGanada += this.mesas[i].getExperienciaRecolectada();
            this.mesas[i].setExperienciaRecolectada(0.0);
            limpiarMesa(i);
        }
    }
    
    public boolean limpiarMesa(int m){
        this.mesas[m].eliminarPedidos();
        if(this.mesas[m].getN_pedido() == 0){
            return true;
        }else{
            System.err.println("La mesa no se ha podido limpiar");
            return false;
        }
    }

    public boolean comprarVaca(){
        int cant_original = this.campoVaca.getCantidad_vacas();
        this.campoVaca.addVaca();
        if(this.campoVaca.getCantidad_vacas()> cant_original){
            this.dinero -= Vaca.PRECIOCOMPRA;
            return true;
        }else{
            return false;
        }
    }
    public boolean venderVaca(){
        int cant_original = this.campoVaca.getCantidad_vacas();
        this.campoVaca.deleteVaca();
        if(this.campoVaca.getCantidad_vacas()< cant_original){
            this.dinero += Vaca.PRECIOVENTA;
            return true;
        }else{
            return false;
        }
    }

    public boolean comprarBebidas(){
        int cant_anter = this.bebidas;
        this.bebidas++;
        this.dinero -= Bebida.PRECIO_VENTA;
        if(this.bebidas > cant_anter){
            return true;
        }else{
            return false;
        }
    }
    
    public boolean anadirFiletes(){
        int cant_filetes = this.filetes;
        this.filetes += this.campoVaca.recogerFiletes();
        if(cant_filetes < this.filetes)
            return true;
        else
            return false;   
    }
}

