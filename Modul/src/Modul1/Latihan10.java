package Modul1;
import java.util.Scanner;
public class Latihan10 {

    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        System.out.println("Masukan Batas Bilangan : ");
        int batas = masukan.nextInt();
        int hasil = 0;
        for(int i = 0; i <= batas; i++){
            hasil += 1;
            System.out.println("Total Jumlahnya Adalah : " + hasil);
        }
    }

}
