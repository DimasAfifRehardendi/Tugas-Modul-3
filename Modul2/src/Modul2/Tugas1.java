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
public class Tugas1 {
    private double penumpang;
    private double maxPenumpang;
    private double average;
    private double berat;
    private double password;
    private double penumpangBaru;
    
     public Tugas1(double maxpenumpang){
                this.maxPenumpang = maxpenumpang;
                penumpang = 0;
            }
            public void addpenumpang(double penumpang){
                double temp ;
                temp = this.penumpang + penumpang;
                if(temp > maxPenumpang){
                    System.out.println("Penumpang Melebihi Kuota !!");
                }else { 
                    this.penumpang = temp;
                }
            }
            public void getpenumpang(int password){
                if(password == 24){
                    System.out.println("Password Benar ");
                }else{
                    System.out.println("Password Salah ");
                }
            }
            public double getavarage(){
                average = berat / penumpang;
        return average;
            }
            public void cetakpenumpang(){
                System.out.println("Penumpang Bus Sekarang : " + penumpang);
                System.out.println("Maksimum Penumpang yang Sebernarnya Adalah : " + maxPenumpang);
            }            

    public double getPenumpang() {
        return penumpang;
    }

    public void setPenumpang(double penumpang) {
        this.penumpang = penumpang;
    }

    public double getMaxPenumpang() {
        return maxPenumpang;
    }

    public void setMaxPenumpang(double maxPenumpang) {
        this.maxPenumpang = maxPenumpang;
    }

    public void setAverage(double average) {
        this.average = average;
    }

    public double getBerat() {
        return berat;
    }

    public void setBerat(double berat) {
        this.berat = berat;
    }

    public double getPassword() {
        return password;
    }

    public void setPassword(double password) {
        this.password = password;
    }          
    }

