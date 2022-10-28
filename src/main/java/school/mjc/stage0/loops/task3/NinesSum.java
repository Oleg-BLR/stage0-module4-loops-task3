package school.mjc.stage0.loops.task3;

public class NinesSum {
    public static void main(String[] args) {
        calculateSum(-2);
    }
    public static void calculateSum(int lengthOfLastNumber) {
        int sum = 0;
        for (int j = 1; j <= lengthOfLastNumber; j++) {
            int nineNumber = 9;
            int ten = 0;
            for (int i = 1; i <= j; i++) {
                nineNumber = nineNumber + 9 * ten;
                if (ten == 0) {
                    ten = 10;
                } else {
                    ten = ten * 10;
                }
            }
            sum = sum + nineNumber;
        }
        System.out.println(sum);
    }
}
