package com.bridgelabz.List;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicate {
    public static void main(String[] args) {
        Set<Integer> s=new HashSet<>();

        Scanner sc=new Scanner(System.in);
        int  n=sc.nextInt();
        System.out.println("Enter "+n+" elements ");
        for(int i=0;i<n;i++){
            s.add(sc.nextInt());
        }
        System.out.println(s);
    }
}
