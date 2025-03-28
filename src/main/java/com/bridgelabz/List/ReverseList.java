package com.bridgelabz.List;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ReverseList {

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

        System.out.println(ls);

        //reversing list

        System.out.println("Reversing the list");

        Collections.reverse(ls);

        System.out.println(ls);
    }
}

