public class SolutionTwoPointers {

    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }

        ListNode slow = head;
        ListNode fast = slow.next;

        while (fast != null) {
            if (slow == fast) {
                return true;
            }
            if (fast.next == null) {
                return false;
            }
            slow = slow.next;
            fast = fast.next.next;
        }

        return false;
    }
}