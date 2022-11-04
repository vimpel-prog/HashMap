import java.util.Objects;

public class Product {
    private final String name;
    private final float price;
    private final int requiredQuantity;
    private boolean checked = false;


    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }

    public int getRequiredQuantity() {
        return requiredQuantity;
    }

    public boolean isChecked() {
        return checked;
    }

    public void setChecked() {
        this.checked = true;
    }

    public Product(String name, float price, int requiredQuantity) {
        if(name==null||name.isBlank()|| price <= 0 || requiredQuantity <= 0){
            throw new RuntimeException("Заполните карточку товара полностью");
        }
        char[] arr = name.toCharArray();
        for (char c : arr) {
            if(c < 'А' || c > 'я'){
                throw new RuntimeException("Назвние продукта не на русском языке");
            }
        }
        this.requiredQuantity = requiredQuantity;
        this.name = name;
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Float.compare(product.price, price) == 0 && requiredQuantity == product.requiredQuantity && Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, requiredQuantity);
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", requiredQuantity=" + requiredQuantity +
                '}';
    }
}
