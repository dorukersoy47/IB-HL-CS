import java.util.Stack;

public class StackDataStructure {
    public static void main(String[] args) {
        Stack<String> names = new Stack<String>();
        names.push("Doruk"); //just reads the top element
        names.push("Kerem");
        names.push("Arda");

        System.out.println(names.peek()); //just reads the top element.
        System.out.println(names.pop()); //reads and removes the top element  
        System.out.println(names.isEmpty());//checks if there is nothing left to read

        while (!names.isEmpty())
            System.out.println(names.pop());

            
    }
}


