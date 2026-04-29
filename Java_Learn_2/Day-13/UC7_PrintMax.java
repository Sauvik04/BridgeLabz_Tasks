class UC7_PrintMax {
    public static <T extends Comparable<T>> T testMaximum(T x, T y, T z) {
        T max = x;
        if (y.compareTo(max) > 0)
            max = y;
        if (z.compareTo(max) > 0)
            max = z;
        printMax(max);
        return max;
    }
    public static <T> void printMax(T max) {
        System.out.println("Maximum Value: " + max);
    }
    public static void main(String[] args) {

        testMaximum(10, 20, 15);
        testMaximum("Apple", "Mango", "Banana");
    }
}