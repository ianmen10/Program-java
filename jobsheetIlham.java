import java.util.Scanner;

public class jobsheetIlham {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int jumlahKwh;
        double hargaPerKwh = 1500, totalTagihan;

        System.out.println("Masukan jumlah kwh");
        jumlahKwh = input.nextInt();

        totalTagihan = hargaPerKwh * jumlahKwh;
        System.out.println("Total tagihan: " + totalTagihan);

        boolean pengecekan = jumlahKwh >= 500;
        System.out.println(pengecekan);
    }

}
