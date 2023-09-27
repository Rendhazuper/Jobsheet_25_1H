package Jobsheet_25_1H;
import java.util.Scanner; 
public class PemilihanPercobaan125 {
    
    public static void main(String[] args) {
        
        Scanner input25 = new Scanner (System.in);

        System.out.println("Masukkan angka : ");
        int angka = input25.nextInt();

        if (angka %2 == 0){
            System.out.println("Angka "+angka+" Bilangan genap");
        } else {
            System.out.println("Angka "+angka+" Bilangan ganjil");
        }
    }
}
