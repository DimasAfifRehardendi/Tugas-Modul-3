package biodatakeluarga;

import java.util.Scanner;

public class TestSiswa {

    public static void main(String[] args) {
        BiodataKeluarga bio = new BiodataKeluarga();
        Scanner masukan = new Scanner(System.in);
        
        System.out.println("===Biodata Keluarga===");
        System.out.println();
        
        System.out.print("Nama Ayah         : " );
        String namaAyah = masukan.nextLine();
        bio.setNamaAyah(namaAyah);
        
        System.out.print("Nama Ibu          : ");
        String namaIbu = masukan.nextLine();
        bio.setNamaibu(namaIbu);
        
        System.out.print("Nama Kakak        : ");
        String namaKakak = masukan.nextLine();
        bio.setNamaKakak(namaKakak);
        
        System.out.print("Nama Saya         : ");
        String namaSaya = masukan.nextLine();
        bio.setNamaSaya(namaSaya);
        
        System.out.print("Nama Adik         : ");
        String namaAdik = masukan.nextLine();
        bio.setNamaAdik(namaAdik);
        
        System.out.print("Alamat            : ");
        String alamat = masukan.nextLine();
        bio.setAlamat(alamat);
        
        System.out.print("Tempat Lahir      : ");
        String tempatLahir = masukan.nextLine();
        bio.setTempatLahir(tempatLahir);
        
        System.out.print("Tanggal Lahir     : ");
        String tanggalLahir = masukan.nextLine();
        bio.setTaggalLahir(tanggalLahir);
        
        System.out.print("Hobi              : ");
        String hobi = masukan.nextLine();   
        bio.setHobi(hobi);
        
        System.out.print("Cita - Cita       : ");
        String citacita = masukan.nextLine();
        bio.setCitaCita(citacita);
        
        System.out.print("Nomer Telepon     : ");
        String notelepon = masukan.nextLine();
        bio.setNoTelepon(notelepon);
        
        System.out.println();
        
        System.out.println("====Hasil Biodata Keluarga====");
        System.out.println();
        System.out.println("Nama Ayah       : " + bio.getNamaAyah());
        System.out.println("Nama Ibu        : " + bio.getNamaibu());
        System.out.println("Nama Kakak      : " + bio.getNamaKakak());
        System.out.println("Nama Saya       : " + bio.getNamaSaya());
        System.out.println("Nama Adik       : " + bio.getNamaAdik());
        System.out.println("Alamat          : " + bio.getAlamat());
        System.out.println("Tempat Lahir    : " + bio.getTempatLahir());
        System.out.println("Tanggal Lahir   : " + bio.getTaggalLahir());
        System.out.println("Hobi            : " + bio.getHobi());
        System.out.println("Cita - Cita     : " + bio.getCitaCita());
        System.out.println("Nomer Telepon   : " + bio.getNoTelepon());
    }

}
