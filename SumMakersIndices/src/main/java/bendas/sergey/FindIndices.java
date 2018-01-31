package bendas.sergey;

import java.util.HashMap;
import java.util.Map;

public class FindIndices {

  public static int[] solve(int[] array, int target) {
    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < array.length; i++) {

      int element = array[i];
      if (map.containsKey(target - element)) {
        int index1 = map.get(target - element);
        return new int[]{index1, i};
      }
      map.put(element, i);
    }
    throw new RuntimeException("No elements that makes sum");
  }
}
