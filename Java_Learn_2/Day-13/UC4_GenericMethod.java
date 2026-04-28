class UC4_GenericMethod {
    public static <T extends Comparable<T>> T testMaximum(T x, T y, T z) {

        T max = x;

        if (y.compareTo(max) > 0)
            max = y;
        if (z.compareTo(max) > 0)
            max = z;
        return max;
    }
    public static void main(String[] args) {
        System.out.println("Integer Max: " + testMaximum(10, 20, 15));
        System.out.println("Float Max: " + testMaximum(10.5f, 20.2f, 15.3f));
        System.out.println("String Max: " + testMaximum("Apple", "Peach", "Banana"));
    }
}