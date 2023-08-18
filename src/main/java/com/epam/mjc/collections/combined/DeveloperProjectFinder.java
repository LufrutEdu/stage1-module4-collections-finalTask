package com.epam.mjc.collections.combined;

import java.util.*;

public class DeveloperProjectFinder {
    public List<String> findDeveloperProject(Map<String, Set<String>> projects, String developer) {
        List<String> out = new ArrayList<>();
        for (Map.Entry<String, Set<String>> item :
                projects.entrySet()) {
            for (String str :
                    item.getValue()) {
                if (str.equals(developer)) out.add(item.getKey());
            }
        }
        out.sort(
                Comparator.comparing(String::length, Comparator.reverseOrder())
                        .thenComparing(Comparator.reverseOrder())
        );
        return out;
    }
}

