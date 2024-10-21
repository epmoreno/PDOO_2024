/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mccow.Pradera;

import java.util.ArrayList;

/**
 *
 * @author enrique
 */
public class CampoVaca {
    private ArrayList<Vaca> listaVacas;
    private int cantidad_vacas;

    public CampoVaca() {
        this.listaVacas = new ArrayList<>();
        this.cantidad_vacas = 0;
    }
    
    ///////////////////////////////////////////////////////////////
    public ArrayList<Vaca> getListaVacas() {
        return listaVacas;
    }

    public void setListaVacas(ArrayList<Vaca> listaVacas) {
        this.listaVacas = listaVacas;
    }

    public int getCantidad_vacas() {
        return cantidad_vacas;
    }

    public void setCantidad_vacas(int cantidad_vacas) {
        this.cantidad_vacas = cantidad_vacas;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CampoVaca{");
        sb.append("listaVacas=").append(listaVacas);
        sb.append(", cantidad_vacas=").append(cantidad_vacas);
        sb.append('}');
        return sb.toString();
    }
    
    
    
    
    ///////////////////////////////////////////////////////////////
    
    public boolean addVaca(){
        Vaca v = new Vaca();
        int size_anter = this.listaVacas.size();
        this.listaVacas.add(v);
        this.cantidad_vacas++;
        if(size_anter < this.listaVacas.size()){
            return true;
        }else{
            return false;
        }
    }
    
    
    public int recogerFiletes(){
        int f_t = 0;
        for(Vaca vacas : this.listaVacas){
            f_t += vacas.getFiletesProducidos();
        }
        return f_t;
    }
    
}
