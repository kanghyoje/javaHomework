package chap_06;

public class _05_Overloading {

    public static int getPower(int number, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        return result;
    }

    public static int getPower(String strnumber) {
        int number = Integer.parseInt(strnumber);
        return number * number;
    }
    public static int getPower(int number) {
        int result = number * number;
        return result;
    }

    public static void main(String[] args) {
        //메소드 오버로딩
        // 전달값의 타입이 다르거나 전달값의 갯수가 다를때
        System.out.println(getPower(3));
        System.out.println(getPower("4"));
        System.out.println(getPower(3, 3));
    }
}
