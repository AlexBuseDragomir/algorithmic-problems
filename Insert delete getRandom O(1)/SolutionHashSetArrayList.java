import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

class SolutionHashSetArrayList {

    private final Random random;
    private final Set<Integer> set;
    private final List<Integer> list;

    public SolutionHashSetArrayList() {
        random = new Random();
        set = new HashSet<>();
        list = new ArrayList<>();
    }

    public boolean insert(int val) {
        boolean inserted =  set.add(val);
        if (inserted) {
            list.add(val);
        }
        return inserted;
    }

    public boolean remove(int val) {
        boolean removed = set.remove(val);
        if (removed) {
            list.remove((Object) val);
        }
        return removed;
    }

    public int getRandom() {
        int randomPosition = random.nextInt(0, set.size());
        return list.get(randomPosition);
    }
}