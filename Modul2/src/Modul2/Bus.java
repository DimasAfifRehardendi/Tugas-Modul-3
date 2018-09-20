package Modul2;

public class Bus {
    private int penumpang;
    private int maxPenumpang;

    public void cetak(){
        System.out.println("Penumpang Bus Sekarang Adalah : " + penumpang);
        System.out.println("Penumpang maximum Seharusnya Adalah : " + maxPenumpang);
    }

    public void setPenumpang(int penumpang) {
        this.penumpang = penumpang;
    }

    public void setMaxPenumpang(int maxPenumpang) {
        this.maxPenumpang = maxPenumpang;
    }

    public int getPenumpang() {
        return penumpang;
    }

    public int getMaxPenumpang() {
        return maxPenumpang;
    }

    void addPenumpang(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
