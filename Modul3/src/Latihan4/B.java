/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan4;

/**
 *
 * @author Asus
 */
public class B extends A{
    private int B;
    void setB(int nilai){
       B = nilai;
    }
    public int getB(){
        return B;
    }
    
    // Melakuka Override terhadap method tampilkanNilai ()
    // yang terdapat pada class a
    public void tampilkanNilai(){
        super.tampilkanNilai(); // MEMANGGIL METHOD METHOD DALAM KELAS A
        System.out.println("Nilai B : " + getB());
    }
}
