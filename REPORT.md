# Report: Campus Shop Inventory Management System

## 1. Introduction

This application helps a campus shop attendant record products, view product information, update product details and monitor available stock. It is written in Java and demonstrates classes, objects, encapsulation, getters and setters.

## 2. Classes Implemented

### 2.1 `Product`

`Product` is the blueprint for every item sold in the shop. It has five attributes:

| Attribute | Data type | Reason for the type |
|-----------|-----------|---------------------|
| `productId` | `String` | IDs such as "P001" mix letters and digits |
| `productName` | `String` | Text |
| `productCategory` | `String` | Text |
| `unitPrice` | `double` | Prices can have decimals |
| `quantityInStock` | `int` | Stock is counted in whole items |

All attributes are declared `private`. Other classes cannot read or change them directly. This is **encapsulation**: the data is protected and can only be accessed through the methods the class chooses to offer.

The class also has a **constructor** that takes all five values. It calls the setters, so validation applies from the moment an object is created.

### 2.2 `Main`

`Main` is a separate class that runs the application. It creates the objects, displays them, updates them and demonstrates validation. It contains a helper method, `displayInventory`, which prints a formatted table using only getter methods.

## 3. Getters

A getter is a public method that returns the value of a private attribute. `Product` has five:

- `getProductId()`
- `getProductName()`
- `getProductCategory()`
- `getUnitPrice()`
- `getQuantityInStock()`

`Main` uses them to read product data, for example when printing the inventory table.

## 4. Setters and Validation

A setter is a public method that changes a private attribute. `Product` has five setters, one for each attribute. Each setter checks the new value before accepting it:

- `setUnitPrice` rejects negative prices.
- `setQuantityInStock` rejects negative stock quantities.
- `setProductId`, `setProductName` and `setProductCategory` reject empty or null text.

When a value is invalid, the setter throws an `IllegalArgumentException` with a clear message and the old value stays unchanged. `Main` catches the exception with `try/catch` so the program continues running.

## 5. Objects Created

Five `Product` objects are created in `Main`, each with different details:

| Variable | ID | Name | Category | Price (UGX) | Stock |
|----------|----|------|----------|-------------|-------|
| `book` | P001 | Exercise Book (96 pages) | Stationery | 2,500 | 200 |
| `pen` | P002 | Blue Ballpoint Pen | Stationery | 500 | 350 |
| `paper` | P003 | Printing Paper (A4 Ream) | Printing | 18,000 | 40 |
| `flash` | P004 | Flash Disk 32GB | Electronics | 35,000 | 25 |
| `calc` | P005 | Scientific Calculator | Electronics | 45,000 | 15 |

Each object has its own copy of the attributes. When the price of `book` is changed to 3,000, the price of `pen` stays at 500. This shows that objects are independent.

## 6. Demonstration Summary

1. All five products are displayed in a table.
2. The price of the exercise book is changed from 2,500 to 3,000 using `setUnitPrice`.
3. The stock of the flash disk is changed from 25 to 18 using `setQuantityInStock`.
4. The table is displayed again and shows the changes.
5. A negative price (-100) and a negative stock (-5) are submitted. Both are rejected with an error message and the stored values are unchanged.

## 7. Conclusion

The system meets the project requirements. It uses encapsulation to protect product data, getters to read it, and validating setters to keep it correct. Separating `Product` from `Main` keeps the code organised and easy to extend, for example with sales recording or low-stock alerts.
