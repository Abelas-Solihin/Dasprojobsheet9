import java.util.Scanner;

public class PemesananMakananKafe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String[] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", 
                         "Kentang Goreng", "Teh Tarik", 
                         "Cappucino", "Chocolate Ice"};

        System.out.println("Menu Makanan:");
        for (String item : menu) {
            System.out.println("- " + item);
        }
        System.out.print("Masukkan nama makanan yang ingin dicari: ");
        String makananDicari = sc.nextLine();
        
      
        boolean found = false;
        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equalsIgnoreCase(makananDicari)) {
                found = true;
                break;
            }
        }

      
        if (found) {
            System.out.println("Makanan " + makananDicari + " tersedia di menu.");
        } else {
            System.out.println("Makanan " + makananDicari + " tidak ada di menu.");
        }

        
    }
}
