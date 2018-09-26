/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas1;

/**
 *
 * @author Asus
 */
public class Materi extends Mapel{
    private String Materi;
    
     public Materi(int q){
         super(q);
        if(q == 1){
            System.out.println("Materi Dari Fisika Adalah ");
            System.out.println("1. Gaya");
            System.out.println("2. Daya");
            System.out.println("3. Energi Mekanik");
        }else{
            System.out.println("Materi Dari Kimia Adalah");
            System.out.println("1. Struktur Atom");
            System.out.println("2. Hakikat Ilmu Kimia");
        }
    }
     
     public void tampil(){
         super.tampil();
         super.Guru();
     }
}
