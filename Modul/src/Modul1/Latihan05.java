package Modul1;
import java.util.Scanner;
public class Latihan05 {

    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        int nilai;
        System.out.println("Masukan Nilai Akhir PBO : ");
        nilai = masukan.nextInt();
        if(nilai < 70){
            System.out.println("Siswa Tidak Lulus ");
        }
            if(nilai > 70){
                System.out.println("Siswa Lulus     ");
            }
        
    }

}
