public class Main {

    public static void main(String[] args) {
        Transaction t1 = new Transaction("Salary", 50000, "Income");
        Transaction t2 = new Transaction("Groceries", 2000, "Expense");

        t1.printDetails();
        t2.printDetails();
    }

}

