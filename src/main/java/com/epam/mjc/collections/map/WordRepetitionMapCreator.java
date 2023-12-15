package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {
        if (sentence.length()==0){
            return new HashMap<>();
        }
        sentence = sentence.replace(",", "");
        sentence = sentence.replace(".", "");;
        Map<String, Integer> map = new HashMap<>();
        String[] sArr = sentence.toLowerCase().split(" ");
        for(String str : sArr){
            map.put(str,map.getOrDefault(str, 0)+1);
        }
        return map;
    }
}
