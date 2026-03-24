package array;

public class Array2 {
    public static void main(String[] args) {
        int[] scores; //배열 선언
        scores = new int[5]; //배열 생성

        scores[0] = 10; //배열 초기화
        scores[1] = 20;
        scores[2] = 30;
        scores[3] = 40;
        scores[4] = 50;

        System.out.println("score1: " + scores[0]);
        System.out.println("score2: " + scores[1]);
        System.out.println("score3: " + scores[2]);
        System.out.println("score4: " + scores[3]);
        System.out.println("score5: " + scores[4]);

        System.out.println("scores 참조값: " + scores);
    }
}
