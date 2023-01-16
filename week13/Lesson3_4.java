public class Lesson3_4 {

    public static void print(Node node) {
        System.out.println(node.n);

        if (node.next != null)
            print(node.next);
    }
    public static void main(String[] args) {
        Node n1 = new Node();
        n1.n = 10;

        Node n2 = new Node();
        n2.n = 20;
        n1.next = n2;

        Node n3 = new Node();
        n3.n = 30;
        n2.next = n3;

        System.out.println(n1.n);
        System.out.println(n1.next);

        Node current = n1;
        print(current);


    }
}