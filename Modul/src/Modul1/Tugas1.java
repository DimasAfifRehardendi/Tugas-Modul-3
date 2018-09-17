package Modul1;
import java.util.Scanner;
public class Tugas1 {

    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        int r, nilai;
        double phi = 3.14;
        System.out.println("==========================");
        System.out.println("Masukan Nilai Jari-Jari : ");
        r = masukan.nextInt();
        System.out.println("==========================");
        System.out.println("Perhitungan : 4 X " + phi + " X " + r + " X " + r);
        System.out.println("==========================");
        System.out.println("Hasil " + ((int )4 * phi * r * r));
        
        
    }

}
