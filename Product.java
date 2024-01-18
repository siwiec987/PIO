public class Product {
    private String name;
    private String code;
    private int price;

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public int getPrice() {
        return price;
    }

    public Product() {};
    public Product(String name, String code, int price) {
        if(name != null && code.matches("J[A-Z]{2}-[0-9]{4}") && price > 0) {
            this.name = name;
            this.code = code;
            this.price = price;
        } else {
            throw new IllegalArgumentException("Nieprawidłowe dane.");
        }
    }
}
