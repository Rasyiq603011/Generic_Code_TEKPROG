import java.time.LocalDate;

public class Food extends Product implements Expirable{
    private LocalDate expiry_date;
    private String category;


    public Food(String Id, String Name, double Price, String Category, LocalDate Expiry){
        super(Id, Name, Price);
        this.category = Category;
        this.expiry_date = Expiry;
    }

    public String getCategory() {
        return category;
    }

    public LocalDate getExpiry_date() {
        return expiry_date;
    }
    
    @Override
    public boolean is_expired() {
        // Cek jika tanggal kedaluwarsa sudah lewat dari hari ini
        return LocalDate.now().isAfter(expiry_date);
    }

    @Override
    public String get_info() {
        return "Food - ID: " + getId() + 
               ", Name: " + getName() + 
               ", Price: " + getPrice() + 
               ", Expiry Date: " + this.expiry_date + 
               ", Category: " + this.category + 
               ", Expired: " + (is_expired() ? "Yes" : "No");
    }

}
