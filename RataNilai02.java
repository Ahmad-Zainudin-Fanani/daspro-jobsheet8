import java.util.Scanner;

public class RataNilai02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Deklarasi variabel
        int i, j;
        float nilai, totalNilai, rataNilai;

        for (i = 1; i <= 5; i++) { // Loop untuk 5 mahasiswa
            totalNilai = 0; // Reset total nilai untuk setiap mahasiswa
            System.out.println("Input Nilai Mahasiswa ke " + i);
            
            for (j = 1; j <= 5; j++) { // Loop untuk input 5 nilai
                System.out.print("Nilai ke-" + j + " = ");
                nilai = sc.nextFloat(); // Input nilai
                totalNilai += nilai; // Tambahkan nilai ke total
            }
            
            rataNilai = totalNilai / 5; // Hitung rata-rata
            System.out.println("Rata-rata Nilai Mahasiswa ke " + i + " adalah " + rataNilai);
            System.out.println(); // Baris baru untuk memisahkan output
        }
    }
}
