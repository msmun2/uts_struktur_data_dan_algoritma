import java.util.Scanner;
public class MenuMakanan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] menu = {
            "Soto",
            "Rawon",
            "Pecel",
            "Bakso",
            "Siomay"
        };
        int[] harga = {
            15000,
            20000,
            10000,
            12500,
            25000
        };
        int total = 0;
        System.out.print("Isikan Makanan yang dipesan : ");
        String pesanan = input.nextLine();
        String[] data = pesanan.split(" ");
        System.out.println("\nTotal Harga :");
        for(int i = 0; i < data.length; i += 2){
            String namaMakanan = data[i];
            int porsi = Integer.parseInt(data[i + 1]);
            for(int j = 0; j < menu.length; j++){
                if(namaMakanan.equalsIgnoreCase(menu[j])){
                    int subtotal = harga[j] * porsi;
                    System.out.println(
                        "- " + menu[j] +
                        " @" + harga[j] +
                        " * " + porsi +
                        " = " + subtotal
                    );
                    total += subtotal;
                    break;
                }
            }
        }
        System.out.println("Total = " + total);
        input.close();
    }
}