/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan5;

/**
 *
 * @author Asus
 */
public class MountainTruck extends Truck{
    
    // THE MOUNTAINTRUCK SUBCLASS ADDS ONE FIELD
    public int seatHeight;
    // THE MOUNTAIN TRUCK SUBCLASS HAS ONE CONSTRUCTOR
    public MountainTruck(int startHeight, int startCadence, int startSpeed, int startGear){
        super(startCadence, startSpeed, startGear);
        seatHeight = startHeight;
    }
    // THE MOUNTAIN TRUCK SUBCLASS ADDS ONE METHOD 
    public void seatHeight(int newValue){
        seatHeight = newValue;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Mulai Berjalan ");
        MountainTruck MB = new MountainTruck(0,0,0,0);
        System.out.println("Gear : " + MB.gear);
        System.out.println("Speed : " + MB.speed);
        MB.setGear(2);
        MB.speedUp(2);
        System.out.println("Gear : " + MB.gear);
        System.out.println("Speed : " + MB.speed);
        MB.speedUp(2);
        System.out.println("Gear : " + MB.gear);
        System.out.println("Speed : " + MB.speed);
    }
}
