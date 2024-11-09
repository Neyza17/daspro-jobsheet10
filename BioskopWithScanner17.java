import java.util.Scanner;

public class BioskopWithScanner17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        int baris, kolom;
        String nama, next;

        String[][] penonton = new String[4][2];

        while (true) {
            System.out.println("=== Menu Bioskop ===");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu (1-3): ");
            int pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.println("Anda memilih untuk input data penonton");
                    System.out.print("Masukkan nama penonton: ");
                    String namaNama = input.nextLine();

                    while (true) {
                        System.out.print("Masukkan baris (1-4): ");
                        baris = input.nextInt();
                        System.out.print("Masukkan kolom (1-2): ");
                        kolom = input.nextInt();
                        input.nextLine();

                        if (baris < 1 || baris > 4 || kolom < 1 || kolom > 2) {
                            System.out.println("Baris atau kolom tidak valid. Silahkan coba lagi.");
                            continue;
                        } 
                        if (penonton[baris - 1][kolom - 1] != null) {
                            System.out.println("Kursi yang dupilih sudah terisi oleh " + penonton[baris - 1][kolom - 1] + ". Silahkan pilih kursi.");
                            continue;
                        }
                        penonton[baris -1][kolom -1] = namaNama;
                        System.out.println("Data penonton berhasil ditambahkan.");
                        break;
                    }
                    break;
                    

                case 2:
                    System.out.println("Daftar penonton: ");
                    for (int i = 0; i < penonton.length; i++) {
                        for (int j = 0; j < penonton[i].length; j++) {
                            String penontonNew = (penonton[i][j] != null) ? penonton[i][j] : "***";
                            System.out.println("Baris " + (i + 1) + ", kolom" + (j + 1) + ": " + penontonNew);
                        }
                    }
                    break;
                case 3:
                    System.out.println("Terima kasih! Program selesai.");
                    sc.close();
                    return;

                default:
                    System.out.println("Pilihan tidak valid. Silahkan pilih lagi");
            }
        }
    }
}
