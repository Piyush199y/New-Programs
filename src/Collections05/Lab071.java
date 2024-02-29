package src.Collections05;
import java.util.Map;
import java.util.TreeMap;

public class Lab071 {
    public static void main(String[] args) {
        Map<String, Integer> map = new TreeMap<>();  // Sorting will be done on basis of keys only
        map.put("TestcaseID", 2);
        map.put("TestcaseID4", 1);
        map.put("TestcaseID3", 6);
        map.put("TestcaseID2", 4);

        System.out.println(map);
        System.out.println(map.isEmpty());
        System.out.println(map.size());
        System.out.println(map.containsKey("TestcaseID2"));
        System.out.println(map.containsKey("testcaseID2"));  // false case-sensitive
        System.out.println(map.containsValue(6));
        System.out.println(map.containsValue(12));
        System.out.println(map.get("TestcaseID3"));
        System.out.println(map.keySet());
        System.out.println(map.values());

        for(Map.Entry<String, Integer> item : map.entrySet()){  // Iterator
            System.out.println(item.getKey() + "=" + item.getValue());
        }

    }
}
