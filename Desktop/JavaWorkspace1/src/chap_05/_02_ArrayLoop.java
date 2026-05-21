package chap_05;

public class _02_ArrayLoop {
    public static void main(String[] args) {
        String[] coffes = {"아메리카노", "카페모카", "라떼", "카푸치노"};
        for (int i = 0; i < 4; i++) {
            System.out.println(coffes[i] + " 하나");
        }
        System.out.println("주세요");

        System.out.println("-------------------");

        for (int i = 0; i < coffes.length; i++) {
            System.out.println(coffes[i] + " 하나");
        }
        System.out.println("주세요");

        System.out.println("-------------------");
        //for each
        for(String coffee : coffes) {
            System.out.println(coffee + " 하나");
        }
        System.out.println("주세요");

    }
}
