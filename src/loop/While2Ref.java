package loop;

public class While2Ref {
    public static void main(String[] args) {
        int count = 0;
        int i = 1;
        int endNum = 5;

        while (i <= endNum) {
            count += i;
            i += 1;
        }
        System.out.println(count);
    }
}
