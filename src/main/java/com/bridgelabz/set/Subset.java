package com.bridgelabz.set;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Subset {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Size of set 1");
        int n=sc.nextInt();

        System.out.println("Size of set 2");

        int m=sc.nextInt();

        Set<Integer> s1=new HashSet<>();
        Set<Integer> s2=new HashSet<>();

        System.out.println("Enter "+ n +" Elements of set 1");

        for(int i=0;i<n;i++){
            s1.add(sc.nextInt());
        }

        System.out.println("Enter "+ m +" Elements of set 1");

        for(int i=0;i<m;i++){
            s2.add(sc.nextInt());
        }

        System.out.println("Set 1 "+s1);
        System.out.println("Set 2 "+s2);

        if(s1.containsAll(s2)){
            System.out.println("yes give set is a subset ");
        }
        else {
            System.out.println("No the given set is not subset");
        }
    }
}
