public class Electronic extends Product implements Discountable {
    private String brand;
    private String jenis;

    public Electronic(String Id, String Name, double Price, String Brand, String Jenis){
        super(Id, Name, Price);
        this.jenis = Jenis;
        this.brand = Brand;
    }

    public String getBrand() {
        return brand;
    }

    public String getJenis() {
        return jenis;
    }

    @Override
    public double get_discount(){

        return 0.0;
    }

    @Override
    public String get_info() {
        return "Electronic - ID: " + getId() + 
               ", Name: " + getName() + 
               ", Price: " + getPrice() + 
               ", Brand: " + brand + 
               ", Jenis: " + jenis + 
               ", Discount: " + (get_discount() * 100) + "%";
    }

}
