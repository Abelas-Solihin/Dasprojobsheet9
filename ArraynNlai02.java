import java.util.Scanner;
public class ArraynNlai02 {
    public static void main(String[] args) {

        Scanner sc = new java.util.Scanner(System.in);
        int[] nilaiAkhir = new int [10];
        
        for (int i = 0; i < 10 ; i++){
        System.out.println("Masukkan nilai akhir ke-" + i + ":");
        nilaiAkhir[i] = sc.nextInt();
        }
        for (int i = 0; i < 10; i++){
            System.out.println("Niai akhir ke-" + i + "adalah" + nilaiAkhir [i]);
        }
        sc.close();
    }
}
