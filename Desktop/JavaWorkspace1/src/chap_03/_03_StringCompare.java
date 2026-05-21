package chap_03;

public class _03_StringCompare {
    public static void main(String[] args) {

        String s1 = "Java";
        String s2 = "Python";
        System.out.println(s1.equals("Java"));
        System.out.println(s2.equalsIgnoreCase("python")); // 대소문자 상관없이

        s1 = "1234"; //변수값 공동사용, 메모리 하나 사용
        s2 = "1234";

        System.out.println(s1.equals(s2));
        System.out.println(s1 == s2);

        s1 = new  String("1234");
        s2 = new String("1234");
        System.out.println(s1.equals(s2));
        System.out.println(s1 == s2);
    }
}
