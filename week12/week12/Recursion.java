package week12;

public class Recursion {
    public static void countBack(int i) {
        System.out.println(i);
        if (i > 0) 
            countBack(i - 1);
    }

    public static void countForward(int i) {
        if (i > 1)
            countForward(i-1);
        System.out.println(i);
    }

    public static void main(String[] args) {
        countBack(5);
        countForward(5);
    }
}
