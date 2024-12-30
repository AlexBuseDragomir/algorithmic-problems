import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

class SolutionHashSet {

    private static final Random random = new Random();
    private final Set<Integer> storage;

    public SolutionHashSet() {
        storage = new HashSet<>();
    }

    public boolean insert(int val) {
        return storage.add(val);
    }

    public boolean remove(int val) {
        return storage.remove(val);
    }

    public int getRandom() {
        int randomPosition = random.nextInt(0, storage.size());
        List<Integer> list = new ArrayList<>(storage);
        return list.get(randomPosition);
    }
}