package Seminar_5.HW_5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class PhoneBook {
    
    private Map<String, List<String>> map = new HashMap<>();
    
    void addRecord(String name, String phone) {
        if (map.containsKey(name)) {
            List<String> phones = map.get(name);
            phones.add(phone);
        } else {
            List<String> phones = new ArrayList<>();
            phones.add(phone);
            map.put(name, phones);
        }
    }

    String getByName(String name) {
        return name + " : " + map.get(name);
    }

    void getSorted() {
        List<Map.Entry<String, List<String>>> sortedMap = new ArrayList<>(map.entrySet());

        Collections.sort(sortedMap, new Comparator<Map.Entry<String, List<String>>>() {
            @Override
            public int compare(Map.Entry<String, List<String>> entry1, Map.Entry<String, List<String>> entry2) {
                return entry2.getValue().size() - entry1.getValue().size();
            }
        });

        for (Map.Entry<String, List<String>> entry : sortedMap) {
            String name = entry.getKey();
            List<String> numbersList = entry.getValue();
            System.out.println(name + ": " + numbersList.toString());
        }
    }
}