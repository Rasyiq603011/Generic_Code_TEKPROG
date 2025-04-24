public abstract class Product {
    private String id;
    private String name;
    private double price;

    public Product(String Id, String Name, double Price){
        this.id = Id;
        this.name = Name;
        this.price = Price;
    }

    // ============= GETTER ===================

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public abstract String get_info();

    // ============== SETTER ================

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}
