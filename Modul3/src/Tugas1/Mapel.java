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
public class Mapel {
    private String matapelajaran;
    private String Guru;
    private int nomer;
    
        public Mapel(int nomer){  
            this.nomer = nomer;
        switch(nomer){
            case 1 : this.matapelajaran = "Fisika";
            break;
            case 2 : this.matapelajaran = "Kimia";
            break;
        }
    }
        
            public void tampil(){
        System.out.println("Pilihan Anda : " + matapelajaran);
    }
        
    public void Guru(){
         if(nomer == 1){
             System.out.println("Guru yang Mengajar Adalah Pak Andri  ");
         }else if (nomer == 2){
             System.out.println("Guru yang Mengajar Adalah Pak Luthfi ");
         }else{
             System.out.println("Guru tidak ada ");

         }
     }
     
    

}
