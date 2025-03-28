package com.bridgelabz.Queue;

import java.util.*;

public class ReverseQueue {
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();

        q.add(1);
        q.add(6);
        q.add(5);
        q.add(4);
        q.add(3);
        q.add(2);

        System.out.println(q);

        Stack<Integer> s=new Stack<>();

        while(!q.isEmpty()){
            s.push(q.poll());
        }
        while(!s.empty()){
            q.add(s.pop());
        }
        System.out.println(q);
    }
}
