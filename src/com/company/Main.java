package com.company;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {


    /**
     * Substring Without Repeating
     *
     * @param str
     * @return
     */
    public static int substringWithoutRepeating(String str) {
        Map<Character, Integer> map = new HashMap<>();

        int maxLength = 0;
        int temp = 0;

        for (int i = 0; i < str.length(); i++) {

            if (map.containsKey(str.charAt(i))) {
                temp = Math.max(temp, map.get(str.charAt(i)) + 1);
            }

            map.put(str.charAt(i), i);
            maxLength = Math.max(maxLength,i - temp +1);

        }

        System.out.println(map);

        return maxLength;

    }

    /**
     * First non-repeated item
     *
     * @param str
     */
    public static void firstNonRepeatedItem(String str) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            if (map.containsKey(str.charAt(i))) {

                map.put(str.charAt(i), 2);

            } else {
                map.put(str.charAt(i), 1);
            }
        }

        for (int i = 0; i < str.length(); i++) {
            if (map.get(str.charAt(i)) == 1) {
                System.out.println(str.charAt(i));
                return;
            }
        }


    }

    /**
     * Duplicate item count
     *
     * @param str
     * @return
     */
    public static int duplicateItemCount(String str) {
        Map<Character, Integer> map = new HashMap<>();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (map.containsKey(str.charAt(i))) {

                map.put(str.charAt(i), 1 + map.get(str.charAt(i)));

            } else {
                map.put(str.charAt(i), 1);
            }
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (Integer.parseInt(String.valueOf(entry.getValue())) > 1) {
                count++;
            }
        }
        return count;
    }

    /**
     * Task 02.Occurred Only Once
     *
     * @param array
     */
    public static void occurredOnlyOnce(String array[]) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            if (map.containsKey(array[i])) {
                map.put(array[i], 2);
            } else {
                map.put(array[i], 1);
            }
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (Integer.parseInt(String.valueOf(entry.getValue())) == 1) {
                System.out.println(entry.getKey());
            }
        }
    }


    /**
     * Task 01. Duplicate Element
     *
     * @param array
     * @return
     */
    public static boolean isDuplicateElement(int array[]) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < array.length; i++) {
            if (set.contains(array[i])) {
                set.remove(array[i]);
                return true;
            }
            set.add(array[i]);
        }
        return false;
    }

    public static void main(String[] args) {

//        System.out.println(isDuplicateElement(new int[]{1, 2, 4, 56, 73}));
//        occurredOnlyOnce(new String[]{"a", "h", "f", "a", "d", "c", "b"});

//        System.out.println(duplicateItemCount("asaasw2wfg"));

//        firstNonRepeatedItem("eef6af6kka0");

        System.out.println(substringWithoutRepeating("abba"));

    }
}
