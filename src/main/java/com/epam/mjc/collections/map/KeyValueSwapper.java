package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class KeyValueSwapper {
    public Map<String, Integer> swap(Map<Integer, String> sourceMap) {
        Map <String, Integer> map = new HashMap<>();
        for(Map.Entry<Integer,String> mapEntry : sourceMap.entrySet()){
            int newVal = mapEntry.getKey();
            String key = mapEntry.getValue();
            int currVal = map.getOrDefault(key, Integer.MAX_VALUE);
            map.put(key, Math.min(currVal, newVal));
        }
        return map;
    }
}
