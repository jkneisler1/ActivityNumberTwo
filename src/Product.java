import java.text.NumberFormat;

public class Product {

    private String code;
    private String description;
    private double price;
    private static int count = 0; // a protected static variable

    // Get and set accessors for the code, description, and price instance variables

    public Product() {
        code = "";
        description = "";
        price = 0;
    }

    @Override
    public String toString() {
        return  "Code:               " + code + "\n" +
                "Description:        " + description + "\n" +
                "Price:              " + this.getFormattedPrice() + "\n";
    }

    @Override
    public boolean equals(Object obj) {
        boolean objIsEqual = false;
        Product prod = (Product) obj;

        if (this.code.equals(prod.code)) { objIsEqual = true; }
        else { objIsEqual = false; }

        if (this.description.equals(prod.description)) { objIsEqual = true; }
        else { objIsEqual = false; }

        if (this.price == prod.price) { objIsEqual = true; }
        else { objIsEqual = false; }

        return objIsEqual;
    }

    private String getFormattedPrice() {
        // Use the NumberFormat class to format the price to 2 decimal places
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        return formatter.format(getPrice());
    }

    // Create public access for the count variable
    public static int getCount() {
        return count;
    }

    // Getters and Setters
    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
}
