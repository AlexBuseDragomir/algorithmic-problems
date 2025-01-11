import java.util.HashSet;
import java.util.Set;

public class SolutionVisitedHashSet {

    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }

        Set<ListNode> visitedSet = new HashSet<>();

        while (head.next != null) {
           if (visitedSet.contains(head)) {
               return true;
           }
           visitedSet.add(head);
           head = head.next;
        }

        return false;
    }
}