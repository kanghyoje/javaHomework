package chap_02;

public class _01_Operator1 {
    public static void main(String[] args) {
        System.out.println(4 + 2);
        System.out.println(4 - 2);
        System.out.println(4 * 2);
        System.out.println(4 / 2);
        System.out.println(5 / 2); //정수 간 연산은 소수점 없음
        System.out.println(2 / 4);
        System.out.println(4 % 2);
        System.out.println(5 % 2);

        System.out.println(2 + 2 * 2);
        System.out.println((2 + 2) * 2);
        System.out.println((2 + (2 * 2)));

        int a = 20;
        int b = 10;
        int c;

        c = a + b;
        System.out.println(c);

        c = a - b;
        System.out.println(c);

        c = a * b;
        System.out.println(c);

        c = a / b;
        System.out.println(c);

        c = a % b;
        System.out.println(c);

        int val;
        val = 10;
        System.out.println(val);
        System.out.println(++val);
        System.out.println(val);

        val = 10;
        System.out.println(val);
        System.out.println(val++);
        System.out.println(val);


        val = 10;
        System.out.println(val);
        System.out.println(--val);
        System.out.println(val);

        val = 10;
        System.out.println(val);
        System.out.println(val--);
        System.out.println(val);

        int waiting = 0;
        System.out.println("대기 인원은 : " + waiting++);
        System.out.println("대기 인원은 : " + waiting++);
        System.out.println("대기 인원은 : " + waiting++);
        System.out.println("총 대기 인원 : " + waiting);
    }
}
