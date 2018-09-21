/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan3;

/**
 *
 * @author Asus
 */
public class Gajah extends Hewan{
    public static void testClassMethod(){
        System.out.println("The Class Method in Hewan");
    }
    // Meng-Override method pada class Animal
    public void testInstanceMethod(){
        System.out.println("The Class Method in Gajah");
    }
    public static void main(String[] args){
        Gajah myGajah = new Gajah();
        Hewan myHewan = new Gajah();
        Hewan.testClassMethod();
        myHewan.testInstanceMethod();
    }
}
