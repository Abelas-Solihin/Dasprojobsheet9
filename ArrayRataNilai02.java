import java.util.Scanner;

public class ArrayRataNilai02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = sc.nextInt();
        
        int[] nilaiMhs = new int[jumlahMahasiswa];
        double total = 0, rata2;
        int Lulus = 0;
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiMhs[i] = sc.nextInt();
        }
        for (int i = 0; i < jumlahMahasiswa; i++) {
            total += nilaiMhs[i];
            if (nilaiMhs[i] > 70) {
                Lulus++;
            }
        }
        rata2 = total / jumlahMahasiswa;
        System.out.println("Rata-rata nilai = " + rata2);
        System.out.println("Jumlah mahasiswa yang lulus = " + Lulus);
    }   
}
