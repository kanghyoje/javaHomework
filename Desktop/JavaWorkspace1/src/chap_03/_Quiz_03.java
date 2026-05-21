package chap_03;

public class _Quiz_03 {
    public static void main(String[] args) {
        String RRN = "901231-1234567";
        System.out.println(RRN.substring(0, 8));
        System.out.println(RRN.substring(0,RRN.indexOf("-") + 2));

    }
}
