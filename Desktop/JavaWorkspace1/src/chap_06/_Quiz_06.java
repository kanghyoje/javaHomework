package chap_06;

public class _Quiz_06 {
    public static String getHiddenDate(String nomalStr, int number){
        String selectstr = nomalStr.substring(0, number);
        int num = nomalStr.length() - selectstr.length();

        for (int i = 0; i < num; i++) {
            selectstr += "*";
        }
        return selectstr;
    }

    public static void main(String[] args) {
        String name = "나코딩";
        String id = "990130-1234567";
        String phone = "010-1234-5678";

        System.out.println("이름: " + getHiddenDate(name, 1));
        System.out.println("주민등록번호: " + getHiddenDate(id, 8));
        System.out.println("전화번호 : " + getHiddenDate(phone, 9));
    }
}
