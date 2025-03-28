package com.bridgelabz.List;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ElementFromEnd {

    static List<Integer> createList(){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Elements of the list And press -1 to stop adding elements to list");

        int n=sc.nextInt();

        List<Integer> ls=new LinkedList<>();

        while(n!=-1){
            ls.add(n);
            System.out.println("You added "+n);
            System.out.println("Enter Elements of the list And press -1 to stop adding elements to list");

            n=sc.nextInt();
        }
        return ls;
    }

    public static void main(String[] args) {
        List<Integer> ls=createList();

        Scanner sc=new Scanner(System.in);
        System.out.println(ls);
        System.out.println("Enter index you want to access from the end ");
        int n=sc.nextInt();

        int i=ls.size()-n;
        if(i<0){
            System.out.println("Index out of bound");
        }
        else{
            System.out.print(i+"th element from the end is ");
            System.out.println(ls.get(i));
        }
    }
}
