public class Sum_Of_5 {
    public static int sum (int n) {
        if (n > 0) 
            return (n + sum(n - 1));
        return n;
    }
    public static void main(String[] args) {
        System.out.println(sum(10));
    }
}
