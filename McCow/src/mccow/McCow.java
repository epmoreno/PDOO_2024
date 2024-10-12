/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mccow;

import java.util.ArrayList;

/**
 *
 * @author enrique
 * 
 * Clase Principal
 */

public class McCow {
    public static final String BARRA_ESTADO = " ";
    public static final McCowEnum NIVEL_ACTUAL = McCowEnum.INICIAL;
    public static final int PRECION_VENTA = 2;
    
    private String nombre;
    private int filetes;
    private int bebidas;
    private double dinero;
    private Mesas []mesas;
    private int n_mesas;
    private int mesas_max;
    private CampoVacas campoVacas;
    private AutoCow autoCow;
    private McCowEnum nivel;
   
   
    public McCow (){
        this.nombre = "McCow";
        this.filetes = 0;
        this.bebidas = 0;
        this.dinero = 25.0;
       
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
        this.mesas = new Mesas[mesas_max];
        this.n_mesas = 0;
        this.campoVacas = new CampoVacas();
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
    public void informacion(){
        System.out.println(
            this.nombre+" --> \n"+
            "| Filetes: "+this.filetes+"\n"+
            "| Bebidas: "+this.bebidas+"\n"+
            "| Dinero: "+this.dinero+"\n"+
            "| Max Mesas: "+this.mesas_max+"\n"+
            "| N Mesas: "+this.n_mesas+"\n"+
            "| Nivel: "+this.nivel
        );
        System.out.println();
    }
   
   
   // Metodos de la clase
    public void comprarMesa(){
        this.mesas[this.n_mesas] = new Mesas();
        this.n_mesas++;
        this.dinero -= 5;
    }
    public void venderMesa(){
        this.mesas[this.n_mesas-1] = null;
        this.n_mesas--;
        this.dinero += 5;
    }
    public void verPedidoMesas(){
        int i = 0;
        if (this.mesas[i].getNPedidos() > 0){
            for(; i<this.n_mesas;i++){
                System.out.println("Pedido de la mesa nº"+(i+1));
                this.mesas[i].verPedidos();
                System.out.println("\n");
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
    public void venderVacas(){

    }

    public void comprarBebidas(){

    }
    public void venderBebidas(){

    }
   
   
   // MAIN - TEST
    public static void main(String[] args) {
        McCow mcCow = new McCow();
        
        // TEST DE FUNCIONES: 
        mcCow.informacion();
        
        mcCow.comprarMesa();
        mcCow.comprarMesa();
       
        mcCow.comprarMenu();
        mcCow.comprarMenu();
        mcCow.comprarSimple();
          
        mcCow.informacion();
        
        mcCow.verPedidoMesas();
        
        mcCow.verGananciasEnCurso();
        System.out.println();
        mcCow.verExpEnCurso();
        
        //mcCow.venderMesa();
        
        //mcCow.informacion();
        
        

    }
    
}

/**
 * 
 * @author enrique
 * 
 * Creacion del Vestibulo
 */
class Mesas{
    
    public static final String ICONO = " ";
    public static final int DURACION = 2;
    public static final int PRECION_VENTA = 2;
    
    private String icono;
    private int duracionMesa;
    private double experienciaRecolectada;
    private int precioVenta;
    private ArrayList<Pedido> pedidos;
    private int n_pedido;
    private double ingresos;
    
    public Mesas(){
        this.icono = ICONO;
        this.duracionMesa = DURACION;
        this.experienciaRecolectada = 0;
        this.precioVenta = PRECION_VENTA;
        this.pedidos = new ArrayList<>();
        this.n_pedido = 0;
        this.ingresos = 0;
    }
    public Mesas(String icono, int duracionMesa, int experienciaRecolectada, int precioVenta){
        this.icono = icono;
        this.duracionMesa = duracionMesa;
        this.experienciaRecolectada = experienciaRecolectada;
        this.precioVenta = precioVenta;
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
        Bebidas b = new Bebidas();
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
            pedido.verPedido();
        }
    }
}

/**
 * 
 * @author enrique
 * class Pedido
 */
class Pedido{
    private Bebidas bebida;
    private Hamburguesa hamburguesa;
    private double precio;
    private double exp;
    private ArrayList<Object> pedidoRealizado;
    
    public Pedido(Bebidas b,Hamburguesa h){
        this.bebida = b;
        this.hamburguesa = h;
        this.pedidoRealizado = new ArrayList<>();
        this.pedidoRealizado.add(this.bebida);
        this.pedidoRealizado.add(this.hamburguesa);
        this.precio=Bebidas.PRECION_VENTA+Hamburguesa.PRECION_VENTA;
        this.exp = Bebidas.EXP+Hamburguesa.EXP;
    }
    public Pedido(Hamburguesa h){
        this.hamburguesa = h;
        this.pedidoRealizado = new ArrayList<>();
        this.pedidoRealizado.add(h);
        this.precio=Hamburguesa.PRECION_VENTA;
        this.exp = Hamburguesa.EXP;
    }
    
    public void verPedido(){
        int n_bebidas=0,n_hamburguesas=0;
        for(Object obj: this.pedidoRealizado){
            if(obj instanceof Bebidas){
                n_bebidas++;
            }
            else if(obj instanceof Hamburguesa){
                n_hamburguesas++;
            }
        }
        if(n_bebidas>0 && n_hamburguesas>0){
            System.out.println("Te has pedido: Menu");
        }
        if(n_bebidas==0 && n_hamburguesas>0){
            System.out.println("Te has pedido: Simple");
        }
    }
    public double getPrecio(){
        return this.precio;
    }
    public double getExp(){
        return this.exp;
    }
}

class Bebidas{
    public static final String ICONO = " ";
    public static final double EXP = 0.5;
    public static final int PRECION_VENTA = 2;
    
    private String icono;
    private double exp;
    private int precioVenta;
    
    public Bebidas(){
        this.icono = ICONO;
        this.exp = EXP;
        this.precioVenta = PRECION_VENTA;
    }
    public Bebidas(String icono, int precioVenta){
        this.icono = icono;
        this.exp = EXP;
        this.precioVenta = precioVenta;
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

class Hamburguesa{
    public static final String ICONO = " ";
    public static final double EXP = 1.5;
    public static final int PRECION_VENTA = 5;
    
    private String icono;
    private int precioVenta;
    private double exp;
    
    public Hamburguesa(){
        this.icono = ICONO;
        this.exp = EXP;
        this.precioVenta = PRECION_VENTA;
    }
    public Hamburguesa(String icono, int precioVenta){
        this.icono = icono;
        this.exp = EXP;
        this.precioVenta = precioVenta;
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


/**
 * 
 * @author enrique
 * 
 * Creacion del Campo de Vacas
 */

class CampoVacas{
    
}

/**
 * 
 * @author enrique
 * 
 * Creacion del AutoCow
 */
class AutoCow {
    
}
