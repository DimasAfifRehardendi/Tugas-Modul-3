/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul2;
/**
 *
 * @author Asus
 */
public class UjiTugas2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Tugas2 Bola = new Tugas2();
        
        Bola.setjariJari();
        System.out.println("Jari - Jari Bola : " + Bola.getjariJari());
        
        Bola.getDiameter();
        System.out.println("Diameter Bola : " + Bola.getDiameter());
        
        Bola.getluasPermukaan();
        System.out.println("Luas Permukaan Bola : " + Bola.getluasPermukaan());
        
        Bola.getvolume();
        System.out.println("Volume Bola : " + Bola.getvolume());
        
    }
    
}
