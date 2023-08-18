package com.epam.mjc.collections.combined;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapFromKeysCreator {
    public Map<Integer, Set<String>> createMap(Map<String, Integer> sourceMap) {
        Map<Integer,Set<String>> out = new HashMap<>();
        for (Map.Entry<String, Integer> item:
             sourceMap.entrySet()) {
            if(out.containsKey(item.getKey().length())){
                Set<String> strSet = out.get(item.getKey().length());
                strSet.add(item.getKey());
            } else {
                Set<String> strSet = new HashSet<>();
                strSet.add(item.getKey());
                out.put(item.getKey().length(), strSet);
            }

        }

      
        return  out;
        }
    }
