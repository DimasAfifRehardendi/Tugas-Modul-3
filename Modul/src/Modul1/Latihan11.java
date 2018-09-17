package Modul1;
import java.util.Scanner;
public class Latihan11 {

    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        int a = 0; 
        int total = 0; 
        int bil = 7;
        while (bil != 0){
            a++;
            System.out.println("Masukan Bilangan Ke- " + a + ":"  );
            bil = masukan.nextInt();
            total += bil;
        }
        System.out.print("Total Jumlah : " + (a-1) + "Bilangan : ");
        System.out.println(total);        
    }

}
