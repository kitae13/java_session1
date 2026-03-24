package scope;

public class Scope1 {
    public static void main(String[] args) {
        int i = 10;
        if (true) {
            int j = 5;
            System.out.println("if문 안 i: " + i);
            System.out.println("if문 안 j: " + j);
        }
        System.out.println("if문 밖 i: " + i);
        //System.out.println("if문 밖 j: " + j); //컴파일 오류 발생
    }
}
