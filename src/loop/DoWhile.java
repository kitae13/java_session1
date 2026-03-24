package loop;

public class DoWhile {
    public static void main(String[] args) {
        int i = 10;

        do {
            System.out.println("현재 숫자: " + i);
            i += 1;
        } while (i < 10);
    }
}
