package practice;

public class _01_practice {
    public static String changeIntoStar(String name) {
        String chagename = name.substring(0,1);
        int number = name.length() - 1;
        for (int i = 0; i < number; i++) {
            chagename += "*";
        }
        return chagename;
    }
    public static void main(String[] args) {
        System.out.println(changeIntoStar("michael"));
    }
}
