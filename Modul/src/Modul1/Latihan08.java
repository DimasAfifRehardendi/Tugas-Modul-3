package Modul1;
import java.util.Scanner;
public class Latihan08 {

    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        System.out.println("Masukan Nilai TPA : ");
        int TPA = masukan.nextInt();
        System.out.println("Masukan Nilai Bahasa Inggris : ");
        int BahasaInggris = masukan.nextInt();
        if((TPA > 85) && (BahasaInggris > 80 )){
            System.out.println("Siswa Dapat Beasiswa");
        }else{
            System.out.println("Siwa Tidak Dapat Beasiswa");
        }
    }

}
