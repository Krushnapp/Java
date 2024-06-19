import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapAsSortedMapExample {
  public static void main(String[] args) {
    // Initialization
    TreeMap<String, Integer> map = new TreeMap<>();
    map.put("first", 1);
    map.put("second", 2);
    map.put("third", 3);
    
    // Getting a portion of the map
    SortedMap<String, Integer> subMap = map.subMap("first", "third");
    
    // Other methods
    subMap.size();
    subMap.get("second");
    subMap.containsKey("third");
    subMap.containsValue(1);
    subMap.keySet();
    subMap.values();
  }
}
