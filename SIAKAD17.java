import java.util.Scanner;

public class SIAKAD17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = input.nextInt();
        System.out.print("Masukkan jumlah mata kuliah: ");
        int jumlahMatkul = input.nextInt();
        int[][] nilai = new int[jumlahMahasiswa][jumlahMatkul];

        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println("Input nilai mahasiswa ke-" + (i + 1));
            for (int j = 0; j < jumlahMatkul; j++) {
                System.out.print("Nilai mata kuliah " + (j + 1) + ": ");
                nilai[i][j] = input.nextInt();
            }
        }

        System.out.println("\n==================================");
        for (int i = 0; i < jumlahMahasiswa; i++) {
            double totalPerSiswa = 0;
            for (int j = 0; j < jumlahMatkul; j++) {
                totalPerSiswa += nilai[i][j];
            }
            System.out.println("Rata-rata nilai mahasiswa ke-" + (i + 1) + ": " + totalPerSiswa / jumlahMatkul);
        }

        System.out.println("\n==================================");
        System.out.println("Rata-rata Nilai setiap Mata Kuliah:");
        for (int j = 0; j < jumlahMatkul; j++) {
            double totalPerMatkul = 0;
            for (int i = 0; i < jumlahMahasiswa; i++) {
                totalPerMatkul += nilai[i][j];
            }
            System.out.println("Mata Kuliah " + (j + 1) + ": " + totalPerMatkul / jumlahMahasiswa);
        }
    }
}
