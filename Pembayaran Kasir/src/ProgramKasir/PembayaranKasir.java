package ProgramKasir;

import java.util.Scanner;

public class PembayaranKasir {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double hargabarang = 0, jumlahbarang, pilihan, totalhargabarang = 0, ulangi = 0, jumlah;

        int diskon1 = 10;
        int diskon2 = 20;
        int diskon3 = 50;

        do {
            System.out.println("***Selamat Datang ***");
            System.out.println("Barang Yang Tersedia Di Toko Kami");
            System.out.println("1. Pensil ");
            System.out.println("2. Buku ");
            System.out.println("3. Kotak Pensil ");
            System.out.println("4. Orotan");
            System.out.println("5. Tipe-X ");
            System.out.println("6. Bolpoin");
            System.out.println("7. Isi Bolpoin");
            System.out.println("8. Penggaris");

            System.out.println("Masukan Pilihan Barang Yang Ingin Di Beli : ");
            pilihan = in.nextInt();

            if (pilihan == 1) {
                hargabarang = 10000;
                System.out.println("Masukan Jumlah Barang Yang Ingin Di Beli : ");
                jumlahbarang = in.nextInt();
                totalhargabarang = jumlahbarang * hargabarang;
                System.out.println("Total Harga : " + totalhargabarang);
            } else if (pilihan == 2) {
                hargabarang = 12000;
                System.out.println("Masukan Jumlah Barang Yang Ingin Di Beli : ");
                jumlahbarang = in.nextInt();
                totalhargabarang = jumlahbarang * hargabarang;
                System.out.println("Total Harga : " + totalhargabarang);
            } else if (pilihan == 3) {
                hargabarang = 25000;
                System.out.println("Masukan Jumlah Barang Yang Ingin Di Beli : ");
                jumlahbarang = in.nextInt();
                totalhargabarang = jumlahbarang * hargabarang;
                System.out.println("Total Harga : " + totalhargabarang);
            } else if (pilihan == 4) {
                hargabarang = 15000;
                System.out.println("Masukan Jumlah Barang Yang Ingin Di Beli : ");
                jumlahbarang = in.nextInt();
                totalhargabarang = jumlahbarang * hargabarang;
                System.out.println("Total Harga : " + totalhargabarang);
            } else if (pilihan == 5) {
                hargabarang = 12000;
                System.out.println("Masukan Jumlah Barang Yang Ingin Di Beli : ");
                jumlahbarang = in.nextInt();
                totalhargabarang = jumlahbarang * hargabarang;
                System.out.println("Total Harga : " + totalhargabarang);
            } else if (pilihan == 6) {
                hargabarang = 30000;
                System.out.println("Masukan Jumlah Barang Yang Ingin Di Beli : ");
                jumlahbarang = in.nextInt();
                totalhargabarang = jumlahbarang * hargabarang;
                System.out.println("Total Harga : " + totalhargabarang);
            } else if (pilihan == 7) {
                hargabarang = 14000;
                System.out.println("Masukan Jumlah Barang Yang Ingin Di Beli : ");
                jumlahbarang = in.nextInt();
                totalhargabarang = jumlahbarang * hargabarang;
                System.out.println("Total Harga : " + totalhargabarang);
            } else if (pilihan == 8) {
                hargabarang = 12000;
                System.out.println("Masukan Jumlah Barang Yang Ingin Di Beli : ");
                jumlahbarang = in.nextInt();
                totalhargabarang = jumlahbarang * hargabarang;
                System.out.println("Total Harga : " + totalhargabarang);
            }
            if (totalhargabarang > 100000) {
                jumlah = totalhargabarang / diskon1;
                System.out.println("Anda Mendapatkan Diskon 10% : " + jumlah);
            } else if (totalhargabarang > 200000) {
                jumlah = totalhargabarang / diskon2;
                System.out.println("Anda Mendapatkan Diskon 20% : " + jumlah);
            } else if (totalhargabarang > 500000) {
                jumlah = totalhargabarang / diskon3;
                System.out.println("Anda Mendapatkan Diskon 50% : " + jumlah);
            } else if (totalhargabarang < 100000) {
                System.out.println("Maaf Diskon Hanya Berlaku Untuk Pembelian Yang Berjumlah Rp.100.000.- Ke Atas");
            }
            System.out.print("Yang terhormat  apakah ingin menambah barang ? 1 untuk Y, 2 untuk N");
            ulangi = in.nextInt();

        } while (ulangi == 1);
        System.out.println("###Trimakasih Telah Berkunjung Di Toko Kami###");
        System.out.println("=====Semoga Hari Anda Menyenangkan=====");

    }

}
