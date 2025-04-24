import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Memulai program dengan UI
        AdminUserInterface ui = new AdminUserInterface();
        
        // Tambahkan beberapa data contoh
        add_sample_data(ui);
        
        // Jalankan menu utama
        ui.menu();
    }
    
    // Metode untuk menambahkan beberapa data contoh
    private static void add_sample_data(AdminUserInterface ui) {
        // Contoh Elektronik
        Electronic laptop = new Electronic("E001", "Laptop Asus", 8500000, "Asus", "Laptop");
        Electronic smartphone = new Electronic("E002", "Smartphone Samsung", 3200000, "Samsung", "Smartphone");
        
        // Contoh Pakaian
        Clothing Jaket = new Clothing("C001", "T-Shirt Cotton", 150000, "Erigo", "Jaket", "Polyestern", "M");
        Clothing jeans = new Clothing("C002", "Denim Jeans", 300000, "Levis","Jeans", "Jeans", "L" );
        
        // Contoh Makanan
        Food milk = new Food("F001", "Fresh Milk", 25000, "Minuman",LocalDate.now().plusDays(7));
        Food bread = new Food("F002", "Whole Wheat Bread", 18000,"Makanan", LocalDate.now().plusDays(3));

        ui.add_to_inventory(laptop);
        ui.add_to_inventory(smartphone);
        ui.add_to_inventory(Jaket);
        ui.add_to_inventory(jeans);
        ui.add_to_inventory(milk);
        ui.add_to_inventory(bread);
    }
}