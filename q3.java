import java.util.Scanner;

public class q3 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("첫 번째 정수를 입력하세요:");
            int num1 = sc.nextInt();

            System.out.println("두 번째 정수를 입력하세요:");
            int num2 = sc.nextInt();

            int sum = num1 + num2;
            int difference = num1 - num2;
            int product = num1 * num2;
            double quotient;

            if (num2 != 0) {
                quotient = (double) num1 / num2;
            } else {
                System.out.println("0으로 나눌 수 없습니다.");
                return;
            }

            System.out.println("덧셈 결과: " + sum);
            System.out.println("뺄셈 결과: " + difference);
            System.out.println("곱셈 결과: " + product);
            System.out.println("나눗셈 결과: " + quotient);

            sc.close();
        }
}
