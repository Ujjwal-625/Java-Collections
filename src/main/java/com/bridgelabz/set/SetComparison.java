package com.bridgelabz.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class SetComparison {
    public static void main(String[] args) {
        Set<Integer> s=new HashSet<>();
        Set<Integer> s2=new HashSet<>();

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Element in set 1");

        for(int i=0;i<5;i++){
            s.add(sc.nextInt());
        }

        System.out.println("Enter Element in set 2");

        for(int i=0;i<5;i++){
            s2.add(sc.nextInt());
        }

        System.out.println("Set 1"+s);
        System.out.println("Set 2"+s2);

        Iterator<Integer> i=s.iterator();
        Iterator<Integer> j=s2.iterator();

        while(i.hasNext() && j.hasNext()){
            if(i.next()!=j.next()){
                System.out.println("Not equal");
                return ;
            }
        }
        System.out.println("Both sets are equal ");
    }
}
