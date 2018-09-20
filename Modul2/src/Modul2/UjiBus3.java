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
public class UjiBus3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Bus3 siswa = new Bus3();
        siswa.setName("Dimas");
        siswa.setAge(18);
        siswa.setAddres("Tuban");
        
        System.out.println("Name : " + siswa.getName() + "\nAbsen : " + siswa.getAbsen() + "\nAddress : " + siswa.getAddres());
        
    }
    
}
