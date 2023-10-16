class Product {
    private int id;
    private double unitPrice;
    private double discountRate;
    private int stockAmount;
    private String name;
    private Marka brand;

    public Product(int id, double unitPrice, double discountRate, int stockAmount, String name, Marka brand) {
        this.id = id;
        this.unitPrice = unitPrice;
        this.discountRate = discountRate;
        this.stockAmount = stockAmount;
        this.name = name;
        this.brand = brand;
    }

    public int getId() {
        return id;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public double getDiscountRate() {
        return discountRate;
    }

    public int getStockAmount() {
        return stockAmount;
    }

    public String getName() {
        return name;
    }

    public Marka getBrand() {
        return brand;
    }
}
