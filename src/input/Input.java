package input;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("정수 입력: ");
        int a = scanner.nextInt();
        System.out.println("정수형: " + a);

        System.out.print("실수 입력: ");
        double b = scanner.nextDouble();
        System.out.println("실수형: " + b);

        scanner.nextLine();
        System.out.print("문자열 입력: ");
        String str = scanner.nextLine();
        System.out.println("문자열: " + str);
    }
}
