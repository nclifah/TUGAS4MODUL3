package com.main;
import java.util.Scanner;

public class Main {

    // Refactor 5: Memperkenalkan konstanta untuk format rupiah
    private static final String CURRENCY_FORMAT = "Rp ";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Refactor 1: Move Method - Memindahkan input pengeluaran ke fungsi
        double makanan = inputPengeluaran(scanner, "makanan");
        double transportasi = inputPengeluaran(scanner, "transportasi");
        double lainnya = inputPengeluaran(scanner, "lainnya");

        // Refactor 2: Extract Variable - Memecah total pengeluaran ke variabel terpisah
        double totalPengeluaran = hitungTotalPengeluaran(makanan, transportasi, lainnya);

        // Refactor 3: Mengurangi duplikasi kode dengan fungsi terpisah untuk tampilan
        tampilkanDetailPengeluaran(makanan, transportasi, lainnya, totalPengeluaran);
    }

    // Refactor 1: Fungsi untuk input pengeluaran
    private static double inputPengeluaran(Scanner scanner, String jenisPengeluaran) {
        System.out.print("Masukkan pengeluaran untuk " + jenisPengeluaran + ": " + CURRENCY_FORMAT);
        return scanner.nextDouble();
    }

    // Refactor 2: Fungsi untuk menghitung total pengeluaran
    private static double hitungTotalPengeluaran(double makanan, double transportasi, double lainnya) {
        return makanan + transportasi + lainnya;
    }

    // Refactor 3: Fungsi untuk menampilkan detail pengeluaran
    private static void tampilkanDetailPengeluaran(double makanan, double transportasi, double lainnya, double total) {
        System.out.println("Pengeluaran Makanan: " + CURRENCY_FORMAT + makanan);
        System.out.println("Pengeluaran Transportasi: " + CURRENCY_FORMAT + transportasi);
        System.out.println("Pengeluaran Lainnya: " + CURRENCY_FORMAT + lainnya);
        System.out.println("Total Pengeluaran: " + CURRENCY_FORMAT + total);
    }
}
