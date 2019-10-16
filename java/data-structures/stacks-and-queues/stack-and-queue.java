import java.io.*;
import java.util.*;

public class Solution<D> {
    LinkedList<D> queue;
    LinkedList<D> stack;

    public Solution() {
        queue = new LinkedList<>();
        stack = new LinkedList<>();
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public D peek() {
        return queue.get(0);
    }

    public D size() {
        return queue.size();
    }

    public void pushCharacter(D n) {
        stack.push(n);
    }

    public void enqueueCharacter(D n) {
        queue.addLast(n);
    }

    public D dequeueCharacter() {
        return queue.remove(0);
    }

    public D popCharacter() {
        return stack.pop();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();

        // Convert input String to an array of characters:
        char[] s = input.toCharArray();

        // Create a Solution object:
        Solution p = new Solution();


}