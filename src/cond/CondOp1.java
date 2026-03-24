package cond;

public class CondOp1 {
    public static void main(String[] args) {
        int age = 25;
        String status1 = (age >= 18) ? "성인" : "미성년자";

        String status2;
        if (age >= 18) {
            status2 = "성인";
        } else {
            status2 = "미성년자";
        }

        System.out.println(status1);
        System.out.println(status2);
    }
}
