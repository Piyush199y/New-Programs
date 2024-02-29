package src.Collections05;
import java.util.HashMap;
import java.util.Map;

public class Lab069 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("TestcaseID", 123);
        map.put("TestcaseID2", 245);
        map.put("TestcaseID3", 894);

        System.out.println(map);
        System.out.println(map.isEmpty());
        System.out.println(map.size());
        System.out.println(map.containsKey("TestcaseID2"));
        System.out.println(map.containsKey("testcaseID2"));  // false case-sensitive
        System.out.println(map.containsValue(123));
        System.out.println(map.containsValue(12));
        System.out.println(map.get("TestcaseID3"));
        System.out.println(map.keySet());
        System.out.println(map.values());

        for(Map.Entry<String, Integer> item : map.entrySet()){  // Iterator
            System.out.println(item.getKey() + "=" + item.getValue());
        }

    }
}
