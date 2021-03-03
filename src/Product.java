public abstract class Product {

    private int code;
    protected String description;
    private double price;

    public Product(double price){
        this.price = price;
    }

    public double getPrice(){
        return this.price;
    }

    public int getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
