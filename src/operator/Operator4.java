package operator;

public class Operator4 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        b = b + ++a;
        System.out.println("a: " + a + ", b: " + b);

        int c = 1;
        int d = 2;
        d = d + c++;
        System.out.println("c: " + c + ", d: " + d);
    }
}
