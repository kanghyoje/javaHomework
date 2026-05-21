package chap_04;

public class _Quiz_04 {
    public static void main(String[] args) {
        int time = 10;
        boolean smallCar = false;
        boolean disabled = true;
        int money = time * 4000;

        if (money > 30000) {
            money = 30000;
        }

        if (smallCar || disabled){
            money /= 2;
        }

        System.out.println("주차 요금은 " + money + "입니다.");
    }
}
