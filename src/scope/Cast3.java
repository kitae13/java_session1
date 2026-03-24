package scope;

public class Cast3 {
    public static void main(String[] args) {
        int div1 = 3/2;
        System.out.println("int + int -> int: " + div1);

        double div2 = 3/2;
        System.out.println("int + int -> double: " + div2);

        double div3 = 3.0/2;
        System.out.println("double + int -> double: " + div3);

        double div4 = (double) 3 / 2;
        System.out.println("double + int -> double: " + div4);
    }
}
