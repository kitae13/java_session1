package method;

public class Method3 {
    public static void main(String[] args) {
        int sum = add(1,2);
        System.out.println("sum: " + sum);

        boolean isAdult = check(25);
        System.out.println("성인인가?: " + isAdult);
    }

    public static int add (int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static boolean check (int age) {
        if (age >= 18) {
            return true;
        }
        else {
            return false;
        }
    }
}
