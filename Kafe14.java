package JOBSHEET;

import java.util.Scanner;

public class Kafe14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean keanggotaan;
        int jmlKopi, jmlTeh, jmlRoti;
        double hargaKopi = 12000.0, hargaTeh = 7000.0, hargaRoti = 20000.0;
        float diskon = 10 / 100f;

        System.out.println("Masukan Keanggotaan (true/false): ");
        keanggotaan = input.nextBoolean();
        System.out.println("Masukan jumlah pembelian kopi: ");
        jmlKopi = input.nextInt();
        System.out.println("Masukan jumlah pembelian teh: ");
        jmlTeh = input.nextInt();
        System.out.println("Masukan jumlah pembelian roti: ");
        jmlRoti = input.nextInt();

        double totalHarga = (jmlKopi * hargaKopi) + (jmlTeh * hargaTeh) + (jmlRoti * hargaRoti);
        double nominalBayar = totalHarga - (diskon * totalHarga);
         

        System.out.println("Keanggotaan pelanggan " + keanggotaan);
        System.out.println("Item pembelian " + jmlKopi + " Kopi, " + jmlTeh + " Teh, " + jmlRoti + " Roti");
        System.out.println("Nominal bayar Rp " + nominalBayar);
    }
    
}
