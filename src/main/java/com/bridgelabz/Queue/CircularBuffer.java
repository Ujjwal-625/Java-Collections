package com.bridgelabz.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class CircularBuffer {
    private Queue<Integer> queue;
    private int capacity;

    public CircularBuffer(int capacity) {
        this.capacity = capacity;
        this.queue = new LinkedList<>();
    }

    public void enqueue(int value) {
        if (queue.size() == capacity) {
            queue.poll(); // Remove oldest element
        }
        queue.add(value);
    }

    public int dequeue() {
        if (queue.isEmpty()) {
            throw new RuntimeException("Buffer is empty!");
        }
        return queue.poll();
    }

    public void display() {
        System.out.println("Buffer: " + queue);
    }

    public static void main(String[] args) {
        CircularBuffer cb = new CircularBuffer(3);
        cb.enqueue(1);
        cb.enqueue(2);
        cb.enqueue(3);
        cb.display(); // Output: Buffer: [1, 2, 3]

        cb.enqueue(4); // Overwrites 1
        cb.display(); // Output: Buffer: [2, 3, 4]

        cb.dequeue();
        cb.display(); // Output: Buffer: [3, 4]
    }
}

