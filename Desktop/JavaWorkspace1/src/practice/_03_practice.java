package practice;

public class _03_practice {
    public static int gather(String word) {
        int count = 0;
        char[] gatherArray = {'a', 'e', 'i', 'o', 'u'};
        for(int i = 0; i < word.length(); i++){
            for (int j = 0; j < gatherArray.length; j++) {
                if (word.charAt(i) == gatherArray[j]) {
                    count += 1;
                }
            };
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(gather("bababab"));
    }
}
