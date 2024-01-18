import java.util.List;

public class SimpleCartPrinter implements CartPrinter{
    public void print(List<Product> products) {
        if(products.isEmpty()) {
            System.out.println("Koszyk jest pusty.");
            return;
        }
        int totalPrice = 0;
        for(Product product : products) {
            System.out.println(product.getName());
            totalPrice += product.getPrice();
        }
        System.out.println("Całkowita wartość: " + totalPrice);
    }
}
