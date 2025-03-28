package com.bridgelabz.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class UnionIntersection {


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

        Set<Integer> union=new HashSet<>(s1);
        union.addAll(s2);

        System.out.println("Union : "+union);

        Set<Integer> Intersection =new HashSet<>(s1);
        Intersection.retainAll(s2);

        System.out.println("Intersection : "+Intersection);
    }
}
