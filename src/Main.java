import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PatikaStore patikaStore = new PatikaStore();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("PatikaStore Ürün Yönetim Paneli !");
            System.out.println("1 - Notebook İşlemleri");
            System.out.println("2 - Cep Telefonu İşlemleri");
            System.out.println("3 - Marka Listele");
            System.out.println("0 - Çıkış Yap");
            System.out.print("Tercihiniz: ");
            int choice = scanner.nextInt();

            if (choice == 0) {
                break;
            }

            switch (choice) {
                case 1:
                    patikaStore.listProducts("Notebook");
                    break;
                case 2:
                    patikaStore.listPhone("Cep Telefonu");
                    break;
                case 3:
                    patikaStore.listBrands();
                    break;
                default:
                    System.out.println("Geçersiz bir seçenek girdiniz.");
            }
        }
    }
}
