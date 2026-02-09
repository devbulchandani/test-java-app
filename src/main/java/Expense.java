public class Expense {
    private final String description;
    private final double amount;
    private final String category;

    public Expense(String description, double amount, String category) {
        this.description = description;
        this.amount = amount;
        this.category = category;
    }

    public void printDetails() {
        System.out.println("Description: " + description);
        System.out.println("Amount: ₹" + amount);
        System.out.println("Category: " + category);
        System.out.println("---------------------------");
    }
}
