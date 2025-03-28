package com.bridgelabz.List;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class RotateElement {

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

    static List<Integer> rotateList(List<Integer> ls,int i){
        List<Integer> ans=new LinkedList<>();

        for(int j=i;j<ls.size();j++){
            ans.add(ls.get(j));
        }
        int j=0;
        while(j<i){
            ans.add(ls.get(j));
            j++;
        }
        return ans;
    }

    public static void main(String[] args) {
        List<Integer> ls=createList();

        System.out.println(ls);

        System.out.println("Enter the number for rotation of list" );
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int index=n%ls.size();

        System.out.println("List after rotation");

        ls=rotateList(ls,index);

        System.out.println(ls);

    }
}
