//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

public class Main {
    public static void main(String[] args) {
        Product kebab = new Product("kebab", "JJK-3213", 1500);
        Product pies = new Product("pies", "JPS-0997", 1320);
        Product wieloryb = new Product("wieloryb", "JWB-9999", 15000);
        Product krokodyl = new Product("krokodyl", "JKD-1666", 150);
        Product menel = new Product("menel", "JML-9696", 320);
        Product scur = new Product("scur", "JSR-0000", 52645);

        Cart cart = new Cart();
        cart.setPrinter(new SimpleCartPrinter());
        cart.addProduct(kebab);
        cart.addProduct(pies);
        cart.addProduct(wieloryb);
        cart.addProduct(krokodyl);
//        cart.addProduct(menel);
        cart.addProduct(scur);
        System.out.println(cart.numberOfProducts());
        cart.printProducts();
        cart.removeProduct("JJK-3213");
        System.out.println(cart.numberOfProducts());
        cart.printProducts();
        cart.removeAllProducts();
        System.out.println(cart.numberOfProducts());
        cart.printProducts();
//        Product a = cart.findProduct("JJK-3213");
//        System.out.println(a.name);
    }
}