package Modul1;
import java.util.Scanner;
public class Tugas3 {

    public static void main(String[] args) {
        String nama, nis, tempatlahir, tangallahir, jeniskelamin, alamatdimalang, mottohidup;
        Scanner masukan = new Scanner(System.in);
        System.out.println("Nama : ");
        nama = masukan.next();
        System.out.println("NIS : ");
        nis = masukan.next();
        System.out.println("Tempatlahir :");
        tempatlahir = masukan.next();
        System.out.println("Tanggal Lahir : ");
        tangallahir = masukan.next();
        System.out.println("Jenis Kelamin : ");
        jeniskelamin = masukan.next();
        System.out.println("Alamat di Malang : ");
        alamatdimalang = masukan.next();
        System.out.println("Motto Hidup : ");
        mottohidup = masukan.next();
    }

}
