package com.bridgelabz.hashmap;

import java.util.*;

public class MaxValueFinder {
    public static String findMaxKey(Map<String, Integer> map) {
        if (map.isEmpty()) {
            throw new IllegalArgumentException("Map is empty!");
        }

        String maxKey = null;
        int maxValue = Integer.MIN_VALUE;

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maxValue) {
                maxValue = entry.getValue();
                maxKey = entry.getKey();
            }
        }

        return maxKey;
    }

    public static void main(String[] args) {
        Map<String, Integer> inputMap = new HashMap<>();
        inputMap.put("A", 10);
        inputMap.put("B", 20);
        inputMap.put("C", 15);

        System.out.println("Key with max value: " + findMaxKey(inputMap)); // Output: B
    }
}
