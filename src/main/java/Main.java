public class Main {

    public static void main(String[] args) {
        Ledger ledger = new Ledger();

        ledger.addTransaction(new Transaction("Salary", 50000, "Income"));
        ledger.addTransaction(new Transaction("Groceries", 2000, "Expense"));
        ledger.addTransaction(new Transaction("Freelance", 12000, "Income"));
        ledger.addTransaction(new Transaction("Rent", 15000, "Expense"));

        ledger.printLedger();
    }

}

