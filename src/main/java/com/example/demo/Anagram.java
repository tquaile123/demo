package com.example.demo;

import java.util.HashMap;

public class Anagram {
    public boolean isAnagram(String s1, String s2) {
        boolean result = false;

        if (s1.length() == s2.length()) {
            HashMap s1Hash = createHashMap(s1);
            HashMap s2Hash = createHashMap(s2);


            if (s1Hash.equals(s2Hash)) {
                result = true;
            }

        }

        return result;
    }

    private HashMap<Character, Integer> createHashMap(String s) {
        HashMap<Character, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);
            if (hashMap.containsKey(c)) {
                Integer value = hashMap.get(c);
                value = value.intValue() + 1;
                hashMap.replace(c, value);
            }
            else {
                hashMap.put(c, 1);
            }
        }

        return hashMap;
    }
}
