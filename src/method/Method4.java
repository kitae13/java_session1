package method;

public class Method4 {
    public static void main(String[] args) {
        int num = 10;
        System.out.println("메서드 호출 전 num: " + num);
        changeNum(num);
        System.out.println("메서드 호출 후 num: " + num);
    }

    public static void changeNum (int num1) {
        System.out.println("changeNum 메서드에서 변경 전 num1: " + num1);
        num1 = 5;
        System.out.println("changeNum 메서드에서 변경 후 num1: " + num1);
    }
}
