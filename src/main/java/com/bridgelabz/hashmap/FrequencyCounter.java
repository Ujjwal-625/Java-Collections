package com.bridgelabz.hashmap;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class FrequencyCounter {
    public static void main(String[] args) {
        List<String> fruits=new LinkedList<>();

        fruits.add("apple");
        fruits.add("apple");
        fruits.add("mango");
        fruits.add("banana");
        fruits.add("mango");

        System.out.println(fruits);

        Map<String,Integer> mp=new HashMap<>();

        for(String i:fruits){
            if(!mp.containsKey(i)){
                mp.put(i,1);
            }
            else{
                mp.put(i,mp.get(i)+1);
            }
        }

        System.out.println("Frequncy of fruits ");
        System.out.println(mp);
    }
}
