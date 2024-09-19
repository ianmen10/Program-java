import java.util.Scanner;
public class jobsheetgajikaryawan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jumlahJam, upahPerJam, totalGaji;
        double bonusGaji = 0.1, potonganPajak = 0.05, gajiKotor, gajiBersih;

        System.out.println("Jumlah Jam");
        jumlahJam = sc.nextInt();
        System.out.println("Upah per Jam :");
        upahPerJam = sc.nextInt();

        totalGaji = jumlahJam * upahPerJam;
        gajiKotor = totalGaji * totalGaji;
        gajiBersih = gajiKotor * potonganPajak;

        System.out.println("Hasil Gaji: " + totalGaji);
    }
}
