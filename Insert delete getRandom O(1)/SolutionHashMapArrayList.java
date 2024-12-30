import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

class SolutionHashMapArrayList {

    private final Random random;
    private final List<Integer> list;
    private final Map<Integer, Integer> map;

    public SolutionHashMapArrayList() {
        random = new Random();
        list = new ArrayList<>();
        map = new HashMap<>();
    }

    public boolean insert(int val) {
        if (map.containsKey(val)) {
            return false;
        }
        map.put(val, list.size());
        list.add(val);
        return true;
    }

    public boolean remove(int val) {
        if (!map.containsKey(val)) {
            return false;
        }

        int index = map.get(val);
        int lastElement = list.getLast();

        list.set(index, lastElement);
        map.put(lastElement, index);

        list.removeLast();
        map.remove(val);
        return true;
    }

    public int getRandom() {
        int randomIndex = random.nextInt(list.size());
        return list.get(randomIndex);
    }
}