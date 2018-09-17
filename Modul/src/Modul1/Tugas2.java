package Modul1;

import java.util.Scanner;

public class Tugas2 {

    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        int c = 78, r, f, k, hasil, pilihan;

        System.out.println("Suhu Dalam Celcius : " + c + "Derajat");
        System.out.println("Pilihan Konversi : ");
        System.out.println("1. Reamur");
        System.out.println("2. Fahrenheit");
        System.out.println("3. Kelvin");
        System.out.println("Masukan Pilihan Anda : ");
        pilihan = masukan.nextInt();

        if (pilihan == 1) {
            System.out.println("###REAMUR###");
            System.out.println("Rumus : 4 / 5 * " + c);
            System.out.println("Hasil : " + (c * 4 / 5));
        } else if (pilihan == 2) {
            System.out.println("***FAHRENHEIT***");
            System.out.println("Rumus : (9 / 5 * " + c + ") + 32");
            System.out.println("Hasil : " + (c * 9 / 5 + 32));
        } else if (pilihan == 3) {
            System.out.println("&&&KELVIN&&&");
            System.out.println("Rumus : (5 / 5 * " + c + ") + 273.15");
            System.out.println("Hasil : " + (c * 5 / 5 + 273.15));
        }

    }

}
