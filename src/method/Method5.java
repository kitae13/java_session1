package method;

public class Method5 {
    public static void main(String[] args) {
        int sum1 = add(1,2);
        System.out.println("sum1: " + sum1);

        int sum2 = add(1,2,3);
        System.out.println("sum2: " + sum2);
    }

    public static int add (int a, int b) {
        System.out.println("첫번째 add 메서드");
        return a + b;
    }

    public static int add (int a, int b, int c) {
        System.out.println("두번째 add 메서드");
        return a + b + c;
    }
}
