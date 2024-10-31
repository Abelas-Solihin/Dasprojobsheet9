import java.util.Scanner;

public class SearchNilai02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan banyaknya nilai yang akan di input: ");
        int jumlahElemen = sc.nextInt();

        int[] arrNilai = new int[jumlahElemen];
        for (int i = 0; i < jumlahElemen; i++) {
            System.out.print("Masukkan nilai untuk elemen ke-" + (i + 1) + ": ");
            arrNilai[i] = sc.nextInt();
        }
        
        System.out.print("Masukkan nilai yang ingin dicari: ");
        int key = sc.nextInt();
        
        int hasil = -1; 
        for (int i = 0; i < arrNilai.length; i++) {
            if (key == arrNilai[i]) {
                hasil = i; 
                break;
            }
        }
        if (hasil != -1) {
            System.out.println("Nilai " + key + " ketemu, merupakan nilai mahasiswa ke-" + hasil);
        } else {
            System.out.println("Nilai yang dicari tidak ditemukan.");
        }

        sc.close();
    }
}