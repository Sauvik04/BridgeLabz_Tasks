import java.util.*;
import java.io.*;
import java.time.LocalDateTime;
class CompanyShares {
    private String symbol;
    private int shares;
    private String dateTime;

    public CompanyShares(String symbol, int shares) {
        this.symbol = symbol;
        this.shares = shares;
        this.dateTime = LocalDateTime.now().toString();
    }

    public String getSymbol() {
        return symbol;
    }

    public int getShares() {
        return shares;
    }

    public void setShares(int shares) {
        this.shares = shares;
    }

    public String toString() {
        return symbol + "," + shares + "," + dateTime;
    }
}
class StockAccount {
    private ArrayList<CompanyShares> list;

    public StockAccount() {
        list = new ArrayList<>();
    }
    public void buy(String symbol, int shares) {
        list.add(new CompanyShares(symbol, shares));
        System.out.println("Bought " + shares + " shares of " + symbol);
    }
    public void sell(String symbol, int shares) {
        for (CompanyShares cs : list) {
            if (cs.getSymbol().equals(symbol)) {
                if (cs.getShares() >= shares) {
                    cs.setShares(cs.getShares() - shares);
                    System.out.println("Sold " + shares + " shares of " + symbol);
                } else {
                    System.out.println("Not enough shares to sell");
                }
                return;
            }
        }
        System.out.println("Company not found");
    }
    public void save() {
        try {
            FileWriter fw = new FileWriter("stock.txt");
            for (CompanyShares cs : list) {
                fw.write(cs.toString() + "\n");
            }
            fw.close();
            System.out.println("Data saved to file (stock.txt)");
        } catch (Exception e) {
            System.out.println("Error saving file");
        }
    }
    public void print() {
        System.out.println("\n--- Stock Report ---");
        for (CompanyShares cs : list) {
            System.out.println(cs.toString());
        }
    }
}
public class Day11Assignment3 {
    public static void main(String[] args) {

        StockAccount account = new StockAccount();
        account.buy("TCS", 10);
        account.buy("INFY", 5);
        account.sell("TCS", 5);
        account.sell("INFY", 10); // invalid case
        account.print();
        account.save();
    }
}