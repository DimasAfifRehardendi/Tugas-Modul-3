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
public class UjiBus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // membuat objek busMini dari kelas bus
        Bus busmini = new Bus();
        //masukan nilai jumlah penumpang dan penumpang maksimal ke
        //dalam objek busMini
        busmini.setPenumpang(5);
        busmini.setMaxPenumpang(15);
        busmini.cetak();
        
        int penumpang = busmini.getPenumpang();
        busmini.setPenumpang(penumpang += 5);
        busmini.cetak();
        busmini.setPenumpang(penumpang -= 2);
        busmini.cetak();
        busmini.setPenumpang(penumpang += 8);
        busmini.cetak();
        
    }
    
}
