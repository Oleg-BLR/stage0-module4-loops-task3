package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public static void main(String[] args) {
        printFibonacci(3);
    }

    public static void printFibonacci(int lastFibonacci) {
        for (int i = 0; i <= 2; i++) {
            if (i == 1 || i == 0) {
                System.out.println(i);
            } else {
                int n0 = 0, n1 = 1;
                for (int j = i + 1; j <= lastFibonacci; j++) {
                    int tempNthTerm;
                    tempNthTerm = n0 + n1;
                    n0 = n1;
                    n1 = tempNthTerm;
                    System.out.println(tempNthTerm);
                }
            }
        }
    }
}
