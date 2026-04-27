class Day11Assignment2 {
    private double balance;

    public Day11Assignment2(double balance) {
        this.balance = balance;
    }
    public void debit(double amount) {
        if (amount > balance) {
            System.out.println("Debit amount exceeded account balance");
        } else {
            balance -= amount;
            System.out.println("Debited: " + amount);
        }
    }
    public void displayBalance() {
        System.out.println("Current Balance: " + balance);
    }
    public static void main(String[] args) {
        Day11Assignment2 acc = new Day11Assignment2(1000);
        acc.displayBalance();
        acc.debit(300);
        acc.displayBalance();
        acc.debit(800);
        acc.displayBalance();
    }
}