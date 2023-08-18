package com.epam.mjc.collections.combined;

import java.util.*;

public class LessonsGetter {
    public Set<String> getLessons(Map<String, List<String>> timetable) {
        Set<String> out = new HashSet<>();
        Collection<List<String>> values = timetable.values();
        for(
                List<String> item:
                values
        ){
            out.addAll(item);
        }
        return out;
    }
}
