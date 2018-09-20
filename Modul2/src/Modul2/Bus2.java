package Modul2;

public class Bus2 {
    private int penumpang;
    private int maxPenumpang;
    
    public Bus2(int maxPenumpang){
       this.maxPenumpang = maxPenumpang;
       penumpang = 0;
    }
    public void addPenumpang(int penumpang){
        int temp;
        temp = this.penumpang + penumpang;
        if(temp >= maxPenumpang){
            System.out.println("Penumpang Melebihi Kuota");
        }else{
            this.penumpang = temp;
        }
    }
    public void cetak(){
        System.out.println("Penumpang Bus Sekarang Adalah : " + penumpang);
        System.out.println("Penumpang Max Seharusnya Adalah : " + maxPenumpang);
    }

    public int getPenumpang() {
        return penumpang;
    }

    public void setPenumpang(int penumpang) {
        this.penumpang = penumpang;
    }

    public int getMaxPenumpang() {
        return maxPenumpang;
    }

    public void setMaxPenumpang(int maxPenumpang) {
        this.maxPenumpang = maxPenumpang;
    }
    
}
