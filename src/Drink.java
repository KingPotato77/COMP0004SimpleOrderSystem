public class Drink extends Product{
    private String description;
    
    public Drink(int code, int price, String description) {
        super(code, price);
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
