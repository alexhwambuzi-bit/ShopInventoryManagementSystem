package inventorymanagementsystem;

public class Main {

	public static void main(String[] args) {
		System.out.println("=== CAMPUS SHOP INVENTORY MANAGEMENT SYSTEM ===\n");

        //   Question 3: create at least five objects 
        // Each object gets its own, different details (Q3b, Q3c).
        Product book    = new Product("P001", "Exercise Book (96 pages)", "Stationery",    2500.0,  200);
        Product pen     = new Product("P002", "Blue Ballpoint Pen",       "Stationery",     500.0,  350);
        Product paper   = new Product("P003", "Printing Paper (A4 Ream)", "Printing",     18000.0,   40);
        Product flash   = new Product("P004", "Flash Disk 32GB",          "Electronics",  35000.0,   25);
        Product calc    = new Product("P005", "Scientific Calculator",    "Electronics",  45000.0,   15);

        // Put the objects in an array so we can loop over them when displaying.
        Product[] inventory = {book, pen, paper, flash, calc};

        // To show that objects are independent 
        System.out.println("     Independence check      ");
        System.out.println(book.getProductName() + " price: UGX " + book.getUnitPrice());
        System.out.println(pen.getProductName()  + " price: UGX " + pen.getUnitPrice());
        System.out.println("This demonstrates that changing one object does not affect the others (see updates below).\n");

        // Display all products using getters 
        System.out.println("--- INITIAL STOCK ---");
        displayInventory(inventory);

        //Update price and stock via setters
        System.out.println("\n--- UPDATING PRODUCTS ---");
        book.setUnitPrice(3000.0);        // price of exercise book rises
        flash.setQuantityInStock(18);     // 7 flash disks sold
        System.out.println("Updated price of " + book.getProductName() + " to UGX 3,000");
        System.out.println("Updated stock of " + flash.getProductName() + " to 18 units");

        //Display updated information 
        System.out.println("\n--- UPDATED STOCK ---");
        displayInventory(inventory);

        // Invalid values are rejected ----------
        System.out.println("\n--- VALIDATION DEMONSTRATION ---");
        try {
            pen.setUnitPrice(-100.0);
        } catch (IllegalArgumentException e) {
            System.out.println("Rejected: " + e.getMessage());
        }
        try {
            paper.setQuantityInStock(-5);
        } catch (IllegalArgumentException e) {
            System.out.println("Rejected: " + e.getMessage());
        }
        // Prove the original values were not changed by the invalid attempts.
        System.out.println("Pen price is still UGX " + pen.getUnitPrice());
        System.out.println("Paper stock is still " + paper.getQuantityInStock() + " reams");
    }
	
	
	
	private static void displayInventory(Product[] products) {
        String line = "+------+---------------------------+-------------+--------------+-------+";
        System.out.println(line);
        System.out.printf("| %-4s | %-25s | %-11s | %12s | %5s |%n",
                "ID", "Name", "Category", "Price (UGX)", "Stock");
        System.out.println(line);
        for (Product p : products) {
            System.out.printf("| %-4s | %-25s | %-11s | %,12.2f | %5d |%n",
                    p.getProductId(),
                    p.getProductName(),
                    p.getProductCategory(),
                    p.getUnitPrice(),
                    p.getQuantityInStock());
        }
        System.out.println(line);

	}

}
