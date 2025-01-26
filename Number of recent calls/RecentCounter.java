import java.util.LinkedList;
import java.util.List;

class RecentCounter {

    int counter;
    List<Integer> queue;

    public RecentCounter() {
        this.counter = 0;
        this.queue = new LinkedList<>();
    }

    public int ping(int t) {
        queue.add(t);
        while (queue.getFirst() < t - 3000) {
            queue.removeFirst();
        }
        return queue.size();
    }
}