public class Main {

    public static void main(String[] args) {
        Expense e1 = new Expense("Groceries", 2500.50, "Food");
        Expense e2 = new Expense("Bus Ticket", 120.00, "Transport");
        Expense e3 = new Expense("Netflix Subscription", 499.00, "Entertainment");

          e1.printDetails();
        e2.printDetails();
        e3.printDetails();
    }

}
