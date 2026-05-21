package chap_03;

import java.util.SplittableRandom;

public class _01_String1 {
    public static void main(String[] args) {
        String s = "I like Java and Python and C.";
        System.out.println(s);

        System.out.println(s.length());

        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());

        System.out.println(s.contains("Java"));
        System.out.println(s.contains("C#"));
        System.out.println(s.indexOf("Java"));
        System.out.println(s.indexOf("C#")); // 포함 ㄴㄴ면 -1
        System.out.println(s.indexOf("and")); // 인덱스의 처음 위치
        System.out.println(s.lastIndexOf("and")); // 인덱스 마지막 위치
        System.out.println(s.startsWith("I like"));
        System.out.println(s.endsWith("."));
    }
}
