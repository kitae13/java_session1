package scope;

public class Cast1 {
    public static void main(String[] args) {
        int intValue = 10;
        long longValue;
        double doubleValue;

        longValue = intValue;
        System.out.println("int -> long cast: " + longValue);

        doubleValue = intValue;
        System.out.println("int -> double cast: " + doubleValue);

        doubleValue = longValue;
        System.out.println("long -> double cast: " + doubleValue);
    }
}
