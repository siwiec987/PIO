import java.util.ArrayList;
//import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class Cart {
    private final List<Product> products = new ArrayList<>();
    private final int cartCapacity = 5;
    private CartPrinter cartPrinter;

    public void setPrinter(CartPrinter cartPrinter) {
        if(cartPrinter != null) {
            this.cartPrinter = cartPrinter;
        } else {
            throw new IllegalArgumentException("Printer nie może być pusty.");
        }
    }

    public void addProduct(Product product) {
        if(numberOfProducts() < cartCapacity)
            products.add(product);
        else
            throw new IllegalStateException("Przekroczono ilość produktów w koszyku.");
    }

    public void printProducts() {
//        if(products.isEmpty()) {
//            System.out.println("Koszyk jest pusty.");
//            return;
//        }
//        int totalPrice = 0;
//        for(Product product : products) {
//            System.out.println(product.getName());
//            totalPrice += product.getPrice();
//        }
//        System.out.println("Całkowita wartość: " + totalPrice);
        cartPrinter.print(products);
    }

    public void removeAllProducts() {
        products.clear();
    }

    public void removeProduct(String code) {
        if(!products.removeIf(product -> product.getCode().equals(code))) {
            throw new NoSuchElementException("Nie znaleziono towaru.");
        }
    }

    public Product findProduct(String code) {
        for(Product product : products) {
            if(product.getCode().equals(code)) {
                return product;
            }
        }
        throw new NoSuchElementException("Nie znaleziono towaru.");
    }

    public int numberOfProducts() {
        return products.size();
    }
}
