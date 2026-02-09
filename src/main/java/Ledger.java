import java.util.ArrayList;
import java.util.List;

public class Ledger {
    private List<Transaction> transactions = new ArrayList<>();


    public void addTransaction(Transaction t) {
        transactions.add(t);
    }

    public void printLedger() {
        System.out.println("========== TRANSACTION LEDGER ==========");
        System.out.printf("%-15s | %-10s | Amount%n", "Description", "Type");
        System.out.println("----------------------------------------");

        for (Transaction t : transactions) {
            t.printDetails();
        }

        System.out.println("========================================");
    }
}
