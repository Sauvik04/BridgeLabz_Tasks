public class UC5_GenericClass<T extends Comparable<T>> {
    private T x;
    private T y;
    private T z;
    public UC5_GenericClass(T x, T y,T z){
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public T maximum(){
        T max = x;
        if(y.compareTo(max) > 0){
            max = y;
        }
        if(z.compareTo(max) > 0){
            max = z;
        }
        return max;
    }
    public static void main(String[] args) {
        UC5_GenericClass<Integer> intObj = new UC5_GenericClass<>(10, 20, 15);
        System.out.println("Integer Max: " + intObj.maximum());
        UC5_GenericClass<Float> floatObj = new UC5_GenericClass<>(10.5f, 20.2f, 15.3f);
        System.out.println("Float Max: " + floatObj.maximum());
        UC5_GenericClass<String> stringObj = new UC5_GenericClass<>("Apple", "Peach", "Banana");
        System.out.println("String Max: " + stringObj.maximum());
    }
}
