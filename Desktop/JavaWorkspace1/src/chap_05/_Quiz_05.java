package chap_05;

public class _Quiz_05 {
    public static void main(String[] args) {
        int[] shoseSizes = new int[10];
        int startShose = 250;
        for (int i = 0; i < shoseSizes.length; i++) {
            shoseSizes[i] = startShose;
            startShose += 5;
        }
        for (int i = 0; i < shoseSizes.length; i++) {
            System.out.println("사이즈 " + shoseSizes[i] + " (재고 있음)");
        }
    }
}
