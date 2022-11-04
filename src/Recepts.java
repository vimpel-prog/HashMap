import java.util.*;

public class Recepts {
    private final Map<Product,Integer> setProducts = new HashMap<>();
    private float totalCost;
    private final String name;

    public Recepts(String name) {
        this.name = name;
    }

    public void addToRecept(Product product, int amount) {
        setProducts.put(product, amount);
    }
    public Map<Product, Integer> getSetProducts() {
        return setProducts;
    }

    public String getName() {
        return name;
    }

    public float getTotalCost() {
        for (Map.Entry<Product, Integer> setProduct : setProducts.entrySet()) {
            totalCost+=setProduct.getKey().getPrice()*setProduct.getValue();
        }
        return totalCost;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Recepts recepts = (Recepts) o;
        return Objects.equals(name, recepts.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return name;
    }
}
