
import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class Map {
    public static void main(String[] args) {
        HashMap map = new HashMap<Integer, String>();
        System.out.println(map.size());
        System.out.println(map.isEmpty());
        map.put(1, "A");
        map.put(2, "B");
        map.put(3, "C");
        map.put(4, "D");
        HashMap map1 = new HashMap<Integer, String>();
        map.put(5, "E");
        map.put(6, "F");
        map.put(7, "G");
        map.put(8, "H");
        System.out.println(map.size());
        System.out.println(map.isEmpty());
        System.out.println(map.containsKey(1));
        System.out.println(map.containsValue("A"));
        System.out.println(map.containsKey(5));
        System.out.println(map.containsValue("S"));
        // get and remove will return the value present in the key
        System.out.println(map.get(2));
        System.out.println(map.remove(2));
        // put all method will combine two maps
        map.putAll(map1);
        System.out.println(map);
        // Get all keys in map
        Set<Integer> set = map.keySet();
        System.out.println(set);
        Collection<Integer> collection = map.values();
        System.out.println(collection);
        // get or default
        System.out.println(map.getOrDefault(10, "Default Value"));
    }
}