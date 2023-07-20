import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();
        HotDrink product1 = new HotDrink("Coffee", (double)123, 0.33, 60);
        HotDrink product2 = new HotDrink("Tea", (double)200, 0.33, 60);
        HotDrink product3 = new HotDrink("Coffee", (double)123, 0.33, 60);
        HotDrink product4 = new HotDrink("Coffee", (double)123, 0.33, 60);

        productList.add(product1);
        productList.add(product2);
        productList.add(product3);
        productList.add(product4);

        ArrayList<Product> newProducts = new ArrayList<>();
        newProducts.add(product1);
        newProducts.add(product2);

        HotDrinkVendingMachine hotDrinksVendingMachine = new HotDrinkVendingMachine(productList);

        System.out.println(hotDrinksVendingMachine.getProduct("Coffee", 0.33, 60));

        System.out.println(productList.size());

        hotDrinksVendingMachine.addProduct(newProducts);
        System.out.println(productList.size());

    }
}
