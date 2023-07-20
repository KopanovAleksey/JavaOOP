import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class HotDrinkVendingMachine implements VendingMachine {
    private final List<Product> products;

    public HotDrinkVendingMachine(List<Product> products){
        this.products = products;
    }

    public Product getProduct(String name){
        for (var item:products) {
            if(item.getName().equalsIgnoreCase(name)){
                return item;
            }
        }
        throw new IllegalStateException(String.format("Продукт c названием %s не найден.", name));
    }
    public Product getProduct(String name, Double volume, Integer temperature){
        for (Product item:products) {
            if(item.getName().equalsIgnoreCase(name) && Objects.equals(((HotDrink)item).getVolume(), volume) && Objects.equals(((HotDrink)item).getTemperature(), temperature)){
                return item;
            }
        }
        throw new IllegalStateException(String.format("Продукт c названием %s не найден.", name));
    }

    @Override
    public boolean addProduct(ArrayList<Product> products) {
        if (this.products == null && products == null){
            return false;
        }
        for (var item:products) {
            assert this.products != null;
            this.products.add(item);
        }
        return true;
    }
}
