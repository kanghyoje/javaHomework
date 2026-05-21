package chap_05;

public class _01_Array {
    public static void main(String[] args) {
//        String[] coffes = new String[4];
//        String coffes[] = new String[4];

//        coffes[0] = "아메리카노";
//        coffes[1] = "카페모카";
//        coffes[2] = "라떼";
//        coffes[3] = "카푸치노";

//        String[] coffes = new String[] {"아메리카노", "카페모카", "라떼", "카푸치노"};

        String[] coffes = {"아메리카노", "카페모카", "라떼", "카푸치노"};

        System.out.println(coffes[0] + " 하나");
        System.out.println(coffes[1] + " 하나");
        coffes[2] = "에스프레소";
        System.out.println(coffes[2] + " 하나");
        System.out.println(coffes[3] + " 하나");
        System.out.println("주세요");

        int[] i = new int[3];
        i[0] = 1;
        i[1] = 2;
        i[2] = 3;
        double[] d = new double[] {10.0, 11.2, 13.5};
        boolean[] b = {true, true, false};

    }
}
