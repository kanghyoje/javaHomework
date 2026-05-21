package chap_04;

public class _05_For {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            System.out.println("환영합니다. 코나입니다. " + i);
        }

        for (int i = 0; i < 10; i += 2) {
            System.out.print(i);
        }

        System.out.println();

        for (int i = 1; i < 10; i += 2) {
            System.out.print(i);
        }

        System.out.println();

        for (int i = 5; i > 0 ; i--) {
            System.out.print(i);
        }

        System.out.println();

        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
            System.out.println("현재까지 총합은 " + sum + "입니다.");
        }
        System.out.println("1부터 10까지의 모든 수의 총합은 " + sum + "입니다.");
    }
}
