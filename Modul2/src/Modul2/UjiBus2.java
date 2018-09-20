package Modul2;

public class UjiBus2 {

    public static void main(String[] args) {
        // membuat object busBesar dari class bus
        Bus2 busBesar = new Bus2(40);
        busBesar.cetak();
        
        //penambahan penumpang
        busBesar.addPenumpang(15);
        busBesar.cetak();
        
        //penambahan penumpang
        busBesar.addPenumpang(5);
        busBesar.cetak();
        
        //penambahan penumpang
        busBesar.addPenumpang(26);
        busBesar.cetak();
    }

}
