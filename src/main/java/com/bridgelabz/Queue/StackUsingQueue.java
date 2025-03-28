package com.bridgelabz.Queue;

import java.util.LinkedList;
import java.util.Queue;

class StackUsingQueue {
    private Queue<Integer> queue;

    public StackUsingQueue() {
        queue = new LinkedList<>();
    }

    public void push(int x) {
        queue.add(x);
        int size = queue.size();
        // Rotate all other elements behind the newly added one
        for (int i = 0; i < size - 1; i++) {
            queue.add(queue.poll());
        }
    }

    public int pop() {
        if (queue.isEmpty()) {
            throw new RuntimeException("Stack is empty!");
        }
        return queue.poll();
    }

    public int top() {
        if (queue.isEmpty()) {
            throw new RuntimeException("Stack is empty!");
        }
        return queue.peek();
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public void display() {
        System.out.println("Stack: " + queue);
    }

    public static void main(String[] args) {
        StackUsingQueue stack = new StackUsingQueue();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.display(); // Output: Stack: [3, 2, 1]

        System.out.println("Top: " + stack.top()); // Output: 3
        System.out.println("Popped: " + stack.pop()); // Output: 3
        stack.display(); // Output: Stack: [2, 1]
    }
}

