package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        printGCD(0, 24);
        printGCD(0, -24);
        printGCD(0, 0);
        printGCD(2, -24);
    }

    public static void printGCD(int first, int second) {
        int gcd = 0;
        if (first == 0) {
            if (second == 0) {
                System.out.println(gcd);
            } else if (second > 0) {
                gcd = second;
            } else {
                gcd = second * -1;
            }
        } else {
            if (first < 0) {
                first = first * -1;
            }
            if (second < 0) {
                second = second * -1;
            }
            for (int i = 1; i <= first && i <= second; i++) {
                if (first % i == 0 && second % i == 0) {
                    gcd = i;
                }
            }
        }
        System.out.println(gcd);
    }
}
