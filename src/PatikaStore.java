import java.util.ArrayList;
import java.util.List;

class PatikaStore {
    private List<Marka> brands = new ArrayList<>();
    private List<Product> mobilePhones = new ArrayList<>();
    private List<Product> notebooks = new ArrayList<>();

    public PatikaStore() {
        brands.add(new Marka(1, "Samsung"));
        brands.add(new Marka(2, "Lenovo"));
        brands.add(new Marka(3, "Apple"));
        brands.add(new Marka(4, "Huawei"));
        brands.add(new Marka(5, "Casper"));
        brands.add(new Marka(6, "Asus"));
        brands.add(new Marka(7, "HP"));
        brands.add(new Marka(8, "Xiaomi"));
        brands.add(new Marka(9, "Monster"));
    }

    public void addProduct(int id, double unitPrice, double discountRate, int stockAmount, String name, Marka brand, String category) {
        Product newProduct = new Product(id, unitPrice, discountRate, stockAmount, name, brand);

        if ("Cep Telefonu".equals(category)) {
            mobilePhones.add(newProduct);
        } else if ("Notebook".equals(category)) {
            notebooks.add(newProduct);
        }
    }



    public void listProducts(String category) {

        System.out.println("Huaweı");
        System.out.println("Lenova");
        System.out.println("Asus");
    }
    public void listPhone(String category) {

        System.out.println("Samsung");
        System.out.println("İphone");
        System.out.println("Xiaomi");
    }

    public void listBrands() {
        System.out.println("Markalarımız");
        System.out.println("--------------");
        for (Marka brand : brands) {
            System.out.println("- " + brand.getName());
        }
    }
}
