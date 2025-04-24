import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Inventory<T extends Product> {
    private List<T> items;

    public Inventory(){
        this.items = new ArrayList<>();
    }

    public void add_item(T Product){
        this.items.add(Product);
    } 

    public void remove_item(T Product){
        this.items.remove(Product);
    }

    public T search_item(String name_product){
        if (this.items.isEmpty() || !(this.items.get(0) instanceof Product)) {
            return null;
        }

        for (T item : this.items) {
            if (item instanceof Product) {
                Product product = (Product) item;
                if (product.getName().equalsIgnoreCase(name_product)) {
                    return item;
                }
            }
        }
        return null;
    }

    private final Comparator<T> name_comparator = new Comparator<T>() {
        @Override
        public int compare(T item1, T item2) {
            if (item1 instanceof Product && item2 instanceof Product) {
                Product product1 = (Product) item1;
                Product product2 = (Product) item2;
                return product1.getName().compareTo(product2.getName());
            }
            return 0;
        }
    };

    public void sort_by_name(){
        Collections.sort(this.items, name_comparator);
    }

    public List<T> get_all_items(){
        return new ArrayList<>(this.items);
    }
}
