public class Bento extends Product{
    private String description;
    // In theory should have more elaborate description (several parameters), but I'll skip

    public Bento(int code, int price, String description) {
        super(code, price);
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
