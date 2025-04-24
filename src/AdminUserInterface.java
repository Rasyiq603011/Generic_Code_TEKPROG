import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

public class AdminUserInterface {
    private static final Scanner scanner = new Scanner(System.in);
    private Inventory<Electronic> inventory_electronic;
    private Inventory<Clothing> inventory_clothing;
    private Inventory<Food> inventory_food;

    public AdminUserInterface() {
        this.inventory_electronic = new Inventory<>();
        this.inventory_clothing = new Inventory<>();
        this.inventory_food = new Inventory<>();
    }

    public void add_to_inventory(Electronic T){
        this.inventory_electronic.add_item(T);
    }

    public void add_to_inventory(Clothing T){
        this.inventory_clothing.add_item(T);
    }
    public void add_to_inventory(Food T){
        this.inventory_food.add_item(T);
    }

    public void menu() {
        boolean running = true;
        while (running) {
            System.out.println("\n===== INVENTORY MANAGEMENT SYSTEM =====");
            System.out.println("1. INVENTORY ELECTRONIC");
            System.out.println("2. INVENTORY CLOTHING");
            System.out.println("3. INVENTORY FOOD");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            int choice = inputHandler();
            switch (choice) {
                case 1:
                    electronic_management();
                    break;
                case 2:
                    clothing_management();
                    break;
                case 3:
                    food_management();
                    break;
                case 4:
                    running = false;
                    System.out.println("Thank you for using the Inventory Management System!");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    private void electronic_management(){
        boolean submenuRunning = true;
        while (submenuRunning) {
            System.out.println("\n===== ELECTRONIC MANAGEMENT SYSTEM =====");
            System.out.println("1. ADD PRODUCT");
            System.out.println("2. REMOVE PRODUCT");
            System.out.println("3. SEARCH PRODUCT");
            System.out.println("4. SORT BY NAME");
            System.out.println("5. DISPLAY ALL PRODUCT");
            System.out.println("6. Back to Main Menu");
            System.out.print("Choose an option: ");

            int choice = inputHandler();
            switch (choice) {
                case 1:
                    addElectronic();
                    break;
                case 2:
                    removeProduct("electronic");
                    break;
                case 3:
                    searchProduct("electronic");
                    break;
                case 4:
                    inventory_electronic.sort_by_name();
                    System.out.println("Products sorted by name!");
                    break;
                case 5:
                    System.out.println("\n===== ALL PRODUCTS =====");
                    List<Electronic> products = inventory_electronic.get_all_items();
                    
                    if (products.isEmpty()) {
                        System.out.println("No products in inventory!");
                    } else {
                        for (Electronic product : products) {
                            System.out.println(product.get_info());
                        }
                    }
                    break;
                case 6:
                    submenuRunning = false;
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    private void clothing_management(){
        boolean submenuRunning = true;
        while (submenuRunning) {
            System.out.println("\n===== CLOTHING MANAGEMENT SYSTEM =====");
            System.out.println("1. ADD PRODUCT");
            System.out.println("2. REMOVE PRODUCT");
            System.out.println("3. SEARCH PRODUCT");
            System.out.println("4. SORT BY NAME");
            System.out.println("5. DISPLAY ALL PRODUCT");
            System.out.println("6. Back to Main Menu");
            System.out.print("Choose an option: ");

            int choice = inputHandler();
            switch (choice) {
                case 1:
                    addClothing();
                    break;
                case 2:
                    removeProduct("clothing");
                    break;
                case 3:
                    searchProduct("clothing");
                    break;
                case 4:
                    inventory_clothing.sort_by_name();
                    System.out.println("Products sorted by name!");
                    break;
                case 5:
                    System.out.println("\n===== ALL PRODUCTS =====");
                    List<Clothing> products = inventory_clothing.get_all_items();
                    
                    if (products.isEmpty()) {
                        System.out.println("No products in inventory!");
                    } else {
                        for (Clothing product : products) {
                            System.out.println(product.get_info());
                        }
                    }
                    break;
                case 6:
                    submenuRunning = false;
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    private void food_management(){
        boolean submenuRunning = true;
        while (submenuRunning) {
            System.out.println("\n===== FOOD MANAGEMENT SYSTEM =====");
            System.out.println("1. ADD PRODUCT");
            System.out.println("2. REMOVE PRODUCT");
            System.out.println("3. SEARCH PRODUCT");
            System.out.println("4. SORT BY NAME");
            System.out.println("5. DISPLAY ALL PRODUCT");
            System.out.println("6. Back to Main Menu");
            System.out.print("Choose an option: ");

            int choice = inputHandler();
            switch (choice) {
                case 1:
                    addFood();
                    break;
                case 2:
                    removeProduct("food");
                    break;
                case 3:
                    searchProduct("food");
                    break;
                case 4:
                    inventory_food.sort_by_name();
                    System.out.println("Products sorted by name!");
                    break;
                case 5:
                    System.out.println("\n===== ALL PRODUCTS =====");
                    List<Food> products = inventory_food.get_all_items();
                    
                    if (products.isEmpty()) {
                        System.out.println("No products in inventory!");
                    } else {
                        for (Food product : products) {
                            System.out.println(product.get_info());
                        }
                    }
                    break;
                case 6:
                    submenuRunning = false;
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    private int inputHandler() {
        try {
            return Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            return -1;
        }
    }

    private void addElectronic() {
        System.out.println("\n===== ADD ELECTRONIC =====");
        
        System.out.print("Enter ID: ");
        String id = scanner.nextLine();
        
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter Price: ");
        double price;
        try {
            price = Double.parseDouble(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Invalid price format. Electronic not added.");
            return;
        }
        
        System.out.print("Enter Brand: ");
        String brand = scanner.nextLine();
        
        System.out.print("Enter Jenis: ");
        String jenis = scanner.nextLine();
        
        Electronic electronic = new Electronic(id, name, price, brand, jenis);
        inventory_electronic.add_item(electronic);
        
        System.out.println("Electronic added successfully!");
    }

    private void addClothing() {
        System.out.println("\n===== ADD CLOTHING =====");
        
        System.out.print("Enter ID: ");
        String id = scanner.nextLine();
        
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter Price: ");
        double price;
        try {
            price = Double.parseDouble(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Invalid price format. Clothing not added.");
            return;
        }

        System.out.print("Enter Brand: ");
        String brand = scanner.nextLine();
        
        System.out.print("Enter Model: ");
        String model = scanner.nextLine();

        System.out.print("Enter Bahan: ");
        String bahan = scanner.nextLine();

        System.out.print("Enter Size: ");
        String size = scanner.nextLine();
        
        Clothing clothing = new Clothing(id, name, price, brand, model, bahan, size);
        inventory_clothing.add_item(clothing);
        
        System.out.println("Clothing added successfully!");
    }

    private void addFood() {
        System.out.println("\n===== ADD FOOD =====");
        
        System.out.print("Enter ID: ");
        String id = scanner.nextLine();
        
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter Price: ");
        double price;
        try {
            price = Double.parseDouble(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Invalid price format. Food not added.");
            return;
        }
        
        System.out.print("Enter Category: ");
        String category = scanner.nextLine();
        
        System.out.print("Enter Expiry Date (yyyy-MM-dd): ");
        String dateStr = scanner.nextLine();
        LocalDate expiryDate;
        try {
            expiryDate = LocalDate.parse(dateStr, DateTimeFormatter.ISO_LOCAL_DATE);
        } catch (Exception e) {
            System.out.println("Invalid date format. Food not added.");
            return;
        }
        
        Food food = new Food(id, name, price, category, expiryDate);
        inventory_food.add_item(food);
        
        System.out.println("Food added successfully!");
    }

    // Method for removing products from specific inventory
    private void removeProduct(String type) {
        System.out.println("\n===== REMOVE PRODUCT =====");
        System.out.print("Enter product ID to remove: ");
        String id = scanner.nextLine();
        
        boolean removed = false;
        
        if (type.equalsIgnoreCase("electronic")) {
            List<Electronic> products = inventory_electronic.get_all_items();
            for (Electronic product : products) {
                if (product.getId().equals(id)) {
                    inventory_electronic.remove_item(product);
                    removed = true;
                    break;
                }
            }
        } else if (type.equalsIgnoreCase("clothing")) {
            List<Clothing> products = inventory_clothing.get_all_items();
            for (Clothing product : products) {
                if (product.getId().equals(id)) {
                    inventory_clothing.remove_item(product);
                    removed = true;
                    break;
                }
            }
        } else if (type.equalsIgnoreCase("food")) {
            List<Food> products = inventory_food.get_all_items();
            for (Food product : products) {
                if (product.getId().equals(id)) {
                    inventory_food.remove_item(product);
                    removed = true;
                    break;
                }
            }
        }
        
        if (removed) {
            System.out.println("Product removed successfully!");
        } else {
            System.out.println("Product not found!");
        }
    }

    // Method for searching products in specific inventory
    private void searchProduct(String type) {
        System.out.println("\n===== SEARCH PRODUCT =====");
        System.out.print("Enter product name to search: ");
        String name = scanner.nextLine();
        
        boolean found = false;
        
        if (type.equalsIgnoreCase("electronic")) {
            Electronic product = inventory_electronic.search_item(name);
            if (product != null) {
                System.out.println(product.get_info());
                found = true;
            }
        } else if (type.equalsIgnoreCase("clothing")) {
            Clothing product = inventory_clothing.search_item(name);
            if (product != null) {
                System.out.println(product.get_info());
                found = true;
            }
        } else if (type.equalsIgnoreCase("food")) {
            Food product = inventory_food.search_item(name);
            if (product != null) {
                System.out.println(product.get_info());
                found = true;
            }
        }
        
        if (!found) {
            System.out.println("No products found with that name!");
        }
    }
}