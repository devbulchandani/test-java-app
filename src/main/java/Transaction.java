public class Transaction {
    private String description;
    private double amount;
    private String type; // "income" or "expense"

    // Constructor
    public Transaction(String description, double amount, String type) {
        this.description = description;
        this.amount = amount;
        this.type = type;
    }

    public void printDetails() {
        System.out.println("Description: " + description);
        System.out.println("Amount: ₹" + amount);
        System.out.println("Type: " + type);
        System.out.println("---------------------------");
    }
}
