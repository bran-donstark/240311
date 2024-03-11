import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("첫 번째 정수를 입력하세요:");
        int n = sc.nextInt();

        System.out.println("두 번째 정수를 입력하세요:");
        int m = sc.nextInt();

        if (n > m) {
            System.out.println("n이 더 큽니다.");
        } else if (n < m) {
            System.out.println("m이 더 큽니다.");
        }

        sc.close();
    }
}
