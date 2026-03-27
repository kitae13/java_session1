package prac;

import java.util.Scanner;

public class Prac5 {
    public static void main(String[] args) {
        //정수 두 개를 입력 받고, 해당 정수들 사이에 있는 값을 출력하자.
        //첫번째 숫자가 두번째 숫자보다 클 때 적용할 두 숫자를 서로 교환하는 조건문도 작성하자.

        //코드 작성하기
        int a, b;

        Scanner scanner = new Scanner(System.in);

        System.out.print("첫 번째 숫자 입력 : ");
        int n1 = scanner.nextInt();
        System.out.print("두 번째 숫자 입력 : ");
        int n2 = scanner.nextInt();
        System.out.print("두 숫자 사이에 있는 수 : ");
        if (n1>n2) {
            b=n1;
            a=n2;
        }
        else {
            a=n1;
            b=n2;
        }
        for (int i = a; i<b; i++) {
            System.out.print(i + ", ");
        }
        System.out.print(b);


        /*
        첫 번째 숫자 입력: 10
        두 번째 숫자 입력: 5
        두 숫자 사이에 있는 수: 5, 6, 7, 8, 9, 10
         */
    }
}
