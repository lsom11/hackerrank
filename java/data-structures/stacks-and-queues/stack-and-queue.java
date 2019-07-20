import java.io.*;
import java.util.*;

public class Solution {
    LinkedList<Integer> queue;
    LinkedList<Integer> stack;

    public Solution() {
        queue = new LinkedList<>();
        stack = new LinkedList<>();
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public int peek() {
        return (int) queue.get(0);
    }

    public int size() {
        return queue.size();
    }

    public void pushCharacter(int n) {
        stack.push(n);
    }

    public void enqueueCharacter(int n) {
        queue.addLast(n);
    }

    public int dequeueCharacter() {
        return (int) queue.remove(0);
    }

    public int popCharacter() {
        return (int) stack.pop();
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