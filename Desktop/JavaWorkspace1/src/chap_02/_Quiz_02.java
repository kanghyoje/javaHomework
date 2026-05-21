package chap_02;

public class _Quiz_02 {
    public static void main(String[] args) {
        int height = 110;
        String boarding = (height >= 120 ? "가능합니다" : "불가능합니다");
        System.out.println("키가 " + height + "cm 이므로 탑승 " + boarding);

    }
}
