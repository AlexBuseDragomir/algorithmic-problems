class SolutionIterative {

    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }

        if (head.next == null) {
            return head;
        }

        int[] nodeValues = new int[5000];
        nodeValues[0] = head.val;
        int index = 0;

        while (head.next != null) {
            nodeValues[++index] = head.next.val;
            head = head.next;
        }

        ListNode current = new ListNode(nodeValues[index]);
        ListNode reversedHead = current;

        for (int i = index - 1; i >= 0; i--) {
            current.next = new ListNode(nodeValues[i]);
            current = current.next;
        }

        return reversedHead;
    }
}