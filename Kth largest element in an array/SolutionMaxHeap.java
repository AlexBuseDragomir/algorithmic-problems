import java.util.Arrays;
import java.util.PriorityQueue;

import static java.util.Comparator.reverseOrder;
import static java.util.stream.Collectors.toCollection;

class SolutionMaxHeap {

    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> priorityQueue = Arrays.stream(nums)
            .boxed()
            .collect(toCollection(() -> new PriorityQueue<Integer>(reverseOrder())));

        for (int i = 0; i < k - 1; i++) {
            priorityQueue.poll();
        }

        return priorityQueue.poll();
    }
}