package com.amigoscode.examples.ds;

import java.util.HashMap;

public class MostOccurences {
    public HashMap<String, Integer> check(String input) {
        HashMap<String, Integer> map = new HashMap<>();
        String[] split = input.split(",");
        for (String e : split) {
            if (!map.containsKey(e)) {
                map.put(e, 1);
            } else {
                int count = map.get(e) + 1;
                map.put(e, count);
            }
        }
        return map;
    }
}
