import java.util.ArrayList;

public interface VendingMachine {

    Product getProduct(String name) throws IllegalStateException;

    boolean addProduct(ArrayList<Product> products);
}