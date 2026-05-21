package practice;

public class _02_practice {
    public static String reverse(String word){
        String ChangeWord = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            ChangeWord += word.charAt(i);
        }
        return ChangeWord;

    }
    public static void main(String[] args) {
        System.out.println(reverse("banana"));
    }
}
