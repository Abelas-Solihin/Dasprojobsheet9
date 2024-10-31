import java.util.Scanner;
public class ManajemenNilaiMahasiswa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        System.out.print("Masukkan banyaknya nilai mahasiswa yang akan diinput: ");
        int jumlahMahasiswa = sc.nextInt();
    
        int[] nilaiMahasiswa = new int[jumlahMahasiswa];
        
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiMahasiswa[i] = sc.nextInt();
        }
    
        double total = 0;
        int nilaiTertinggi = nilaiMahasiswa[0];
        int nilaiTerendah = nilaiMahasiswa[0];
        
        for (int i = 0; i < jumlahMahasiswa; i++) {
            total += nilaiMahasiswa[i];
            if (nilaiMahasiswa[i] > nilaiTertinggi) {
                nilaiTertinggi = nilaiMahasiswa[i];
            }
            if (nilaiMahasiswa[i] < nilaiTerendah) {
                nilaiTerendah = nilaiMahasiswa[i];
            }
        }
        
        double rataRata = total / jumlahMahasiswa;
    
        System.out.println("\nNilai yang telah dimasukkan:");
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println("Nilai mahasiswa ke-" + (i + 1) + ": " + nilaiMahasiswa[i]);
        }
        
        System.out.println("Rata-rata nilai = " + rataRata);
        System.out.println("Nilai tertinggi = " + nilaiTertinggi);
        System.out.println("Nilai terendah = " + nilaiTerendah);
        
        sc.close();
    }
}
