package scope;

public class Scope2 {
    public static void main(String[] args) {
        int x = 10;
        for (int i = 0; i < 2; i++) {
            System.out.println("for문 안에서 x: " + x);
            System.out.println("for문 안에서 i: " + i);
        }
        System.out.println("for문 밖에서 x: " + x);
        //System.out.println("for문 밖에서 i: " + i); //컴파일 오류 발생
    }
}
