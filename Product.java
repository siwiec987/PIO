public class Product {
    private String name;
    private String code;
    private int price;

    public Product() {};
    public Product(String name, String code, int price) {
        setName(name);
        setCode(code);
        setPrice(price);
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public int getPrice() {
        return price;
    }

    public void setName(String name) {
        if(name != null)
            this.name = name;
        else
            throw new IllegalArgumentException("Nieprawidłowa nazwa towaru");
    }

    public void setCode(String code) {
        if(code.matches("J[A-Z]{2}-[0-9]{4}"))
            this.code = code;
        else
            throw new IllegalArgumentException("Nieprawidłowy kod towaru");
    }

    public void setPrice(int price) {
        if(price > 0)
            this.price = price;
        else
            throw new IllegalArgumentException("Nieprawidłowa cena towaru");
    }
}
