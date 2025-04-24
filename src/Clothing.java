public class Clothing extends Product implements Discountable{
    private String brand;
    private String model;
    private String bahan;
    private String size;

    public Clothing(String Id, String Name, double Price, String Brand, String Model, String Bahan, String Size){
        super(Id, Name, Price);
        this.bahan = Bahan;
        this.brand = Brand;
        this.model = Model;
        this.size = Size;
    }

    public String getBahan() {
        return this.bahan;
    }

    public String getBrand() {
        return this.brand;
    }

    public String getModel() {
        return this.model;
    }
    public String getSize() {
        return this.size;
    }

    @Override
    public double get_discount(){

        return 0.0;
    }

    @Override
    public String get_info() {
        return "Clothes - ID: " + getId() + 
               ", Name: " + getName() + 
               ", Price: " + getPrice() + 
               ", Brand: " + this.brand + 
               ", Model: " + this.model + 
               ", Size: " + this.size +
               ", Bahan: " + this.bahan +
               ", Discount: " + (get_discount() * 100) + "%";
    }

}
