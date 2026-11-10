package inventorymanagementsystem;

public class Product {
	
	// The Product class
	//Declaration of all the attributes with the correct access modifiers(private) and data types
	
	private String productId;
    private String productName;
    private String productCategory;
    private double unitPrice;       
    private int quantityInStock;
    
    
    
    
    // Uses the setters so validation rules apply from the moment an object is created.
    public Product(String productId, String productName, String productCategory,
                   double unitPrice, int quantityInStock) {
        setProductId(productId);
        setProductName(productName);
        setProductCategory(productCategory);
        setUnitPrice(unitPrice);
        setQuantityInStock(quantityInStock);
    }
    
    // Getters for all the attributes
    public String getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public int getQuantityInStock() {
        return quantityInStock;
    }
    
    //Setters with validation
    
    /*
              *productId.trim().isEmpty()
     .trim()- this removes spaces from the start and end of the string so that we do not have error messages due to extra spaces
     
     .isEmpty- this returns a TRUE value if the string has zero characters
     Together they catch strings that are blank or just white space.
     
     
              *new IllegalArgumentException("Product ID cannot be empty")
     It creates an error object
     Its a class that already exists in java that is meant for situations where the method gets an argument that is not acceptable
     The text in the parenthesis is the error message that describes what went wrong
     
     
              *throw
     Is a key word that takes the error message and shows it to tell the person to stop, something went wrong
     
     */
    public void setProductId(String productId) {
        if (productId == null || productId.trim().isEmpty()) {
            throw new IllegalArgumentException("Product ID cannot be empty.");
        }
        this.productId = productId.trim();
    }

    public void setProductName(String productName) {
        if (productName == null || productName.trim().isEmpty()) {
            throw new IllegalArgumentException("Product name cannot be empty.");
        }
        this.productName = productName.trim();
    }

    public void setProductCategory(String productCategory) {
        if (productCategory == null || productCategory.trim().isEmpty()) {
            throw new IllegalArgumentException("Product category cannot be empty.");
        }
        this.productCategory = productCategory.trim();
    }

    public void setUnitPrice(double unitPrice) {
        if (unitPrice < 0) {
            throw new IllegalArgumentException(
                    "Invalid price: " + unitPrice + ". Price cannot be negative.");
        }
        this.unitPrice = unitPrice;
    }

    public void setQuantityInStock(int quantityInStock) {
        if (quantityInStock < 0) {
            throw new IllegalArgumentException(
                    "Invalid quantity: " + quantityInStock + ". Stock cannot be negative.");
        }
        this.quantityInStock = quantityInStock;
    }

}
