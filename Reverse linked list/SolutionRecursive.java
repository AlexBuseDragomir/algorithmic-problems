class SolutionRecursive {

    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }

        if (head.next == null) {
            return head;
        }

        ListNode reversedList = reverseList(head.next);

        head.next.next = head;
        head.next = null;

        return reversedList;
    }
}