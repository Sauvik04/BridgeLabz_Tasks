class Day11Assignment1 {
    private String name;
    private int shares;
    private double price;

    public Day11Assignment1(String name, int shares, double price) {
        this.name = name;
        this.shares = shares;
        this.price = price;
    }

    public double calculateValue() {
        return shares * price;
    }

    public void display() {
        System.out.println("Stock: " + name +
                ", Shares: " + shares +
                ", Price: " + price +
                ", Value: " + calculateValue());
    }
    public static void main(String[] args) {
        Day11Assignment1 s1 = new Day11Assignment1("Company1", 10, 1000);
        Day11Assignment1 s2 = new Day11Assignment1("Company2", 5, 1500);
        s1.display();
        s2.display();
    }
}