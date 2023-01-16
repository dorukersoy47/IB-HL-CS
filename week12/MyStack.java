//Doing it with arrays
public class MyStack {
    int top = -1;
    int[] numbers = new int[10];
    int total;

    public void push(int value) {
        numbers[top++] = value;
        total++;
    }

    public int peek() {
        return numbers[top];
    }

    public int pop() {
        total--;
        return numbers[top--];
    }
} 
