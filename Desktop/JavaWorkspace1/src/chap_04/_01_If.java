package chap_04;

public class _01_If {
    public static void main(String[] args) {
        int hour = 15;

        if (hour < 14)
            System.out.println("아이스 아메리카노 +1");

        if (hour < 14) {
            System.out.println("아이스 아메리카노 +1");
            System.out.println("샷추가");
        }
        System.out.println("커피 주문 완료 #1");

        hour = 15;
        boolean morningCoffee = true;
        //if (hour < 14 && morningCoffee == false) {
        // 알면 좋음
        if (hour < 14 && !morningCoffee) {
            System.out.println("아이스 아메리카노 +1");
        }
        System.out.println("커피 주문 완료 #2");

        hour = 15;
        morningCoffee = true;
        if (hour >= 14 || morningCoffee) {
            System.out.println("아이스 아메리카노(디카페인) +1");
        }
        System.out.println("커피 주문 완료 #3");
    }
}
