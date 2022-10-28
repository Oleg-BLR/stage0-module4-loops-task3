package school.mjc.stage0.loops.task3;

public class AlphabetPrinter {
    public static void main(String[] args) {
        printAlphabet();
    }
    public static void printAlphabet() {
        for (int i = 'a'; i <= 'z'; i++) {
            System.out.println((char) i);
//            System.out.println(String.valueOf(i));
        }
    }
}
