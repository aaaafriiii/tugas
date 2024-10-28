import java.awt.*;
import java.util.Scanner;

public class Restaurant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Order order = new Order();

        Menu bakso = new Menu("Bakso", 50000);
        Menu Mie = new Menu("Mie", 20000);
        Menu Soda = new Menu("Soda", 10000);

        System.out.println("Selamat datang di Restoran");
        System.out.println("Menu:");
        System.out.println("1. " +bakso.getName() + " - RP " + bakso.getPrice());
        System.out.println("2. " +Mie.getName() + " - RP " + Mie.getPrice());
        System.out.println("3. " +Soda.getName() + " - RP " + Soda.getPrice());

        System.out.println("Silahkan masukkan nomor menu yang akan ingin dipesan (ketik 0 untuk selesai) :");
        while (true) {
            int choice = scanner.nextInt();
            if (choice == 0) {
                break;
            }
            switch (choice) {
                case 1:
                    order.addItem(bakso);
                    System.out.println("Bakso ditambahkan ke pesanan.");
                    break;
                case 2:
                    order.addItem(Mie);
                    System.out.println("Mie ditambahkan ke pesanan.");
                    break;
                case 3:
                    order.addItem(Soda);
                    System.out.println("Soda ditambahkan ke pesanan.");
                    break;
                default:
                    System.out.println("Menu tidak ditemukan");
            }
        }

        System.out.println("Pesanan Anda: ");
        for (Menu item : order.getItems()) {
            System.out.println("- " + item.getName() + ": RP " + item.getPrice());
        }
        System.out.println("Total: RP " + order.calculateTotal());
        scanner.close();
    }
}