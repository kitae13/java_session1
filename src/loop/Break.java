package loop;

public class Break {
    public static void main(String[] args) {
        int i = 0;
        while (true) {
            if (i >= 5) {
                break;
            }
            i += 1;
            System.out.println(i);
        }
    }
}
