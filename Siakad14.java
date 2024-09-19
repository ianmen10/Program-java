package JOBSHEET;

import java .util.Scanner;

public class Siakad14 { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nama, nim;
        char kelas;
        byte absen;
        double nilaiKuis = 0.2, nilaiTugas = 0.15, nilaiUjian = 0.3, nilaiAkhir = 0.35;
        System.out.print("Masukan nama : ");
        nama = sc.nextLine();
        System.out.print("Masukan NIM : ");
        nim = sc.nextLine();
        System.out.print("Masukan kelas : ");
        kelas = sc.nextLine() .charAt(0);
        System.out.print("Masukan nomor absen : ");
        absen = sc.nextByte();  
        
        System.out.println("Masukan nilai kuis : ");
        nilaiKuis = sc.nextInt();
        System.out.println("Masukan nilai tugas : ");
        nilaiTugas = sc.nextInt();
        System.out.println("Masukan nilai ujian : ");
        nilaiUjian = sc.nextInt();

        nilaiAkhir = (nilaiKuis + nilaiTugas + nilaiUjian) / 3;

        System.out.println("Nama: " + nama + " NIM: " + nim);
        System.out.println("Kelas: " + kelas + " Absen: " + absen);
        System.out.println("Nilai Akhir: " + nilaiAkhir);

    }
    
}
