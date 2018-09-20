/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul2;

public class Tugas2 {
    private double jariJari;
    private double Diameter;
    private double luasPermukaan;
    private double volume;
    
    public void setjariJari(){
        this.jariJari = jariJari;
    }
    
    public double getjariJari(){
        jariJari = 14;
        return jariJari;
    }
    
    public double getDiameter(){
       Diameter = jariJari + jariJari;
       return Diameter;
    }
    
    public double getluasPermukaan(){
        luasPermukaan = 4 * Math.PI * jariJari * jariJari;
        return luasPermukaan;
    }
    
    public double getvolume(){
        volume = 4 * Math.PI * jariJari * jariJari * jariJari / 3;
        return volume;
    }        
    
}
