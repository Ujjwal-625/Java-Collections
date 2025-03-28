package com.bridgelabz.set;

import java.util.*;

public class SetToList {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Size of set");
        int n=sc.nextInt();

        Set<Integer> s1=new TreeSet<>();

        System.out.println("Enter "+ n +" Elements of set 1");

        for(int i=0;i<n;i++){
            s1.add(sc.nextInt());
        }

        List<Integer> list=new LinkedList<>();
        for(int i: s1){
            list.add(i);
        }
        System.out.println("Sorted List "+list);
    }
}
