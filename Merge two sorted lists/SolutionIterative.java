class SolutionIterative {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) {
            return list2;
        }

        if (list2 == null) {
            return list1;
        }

        ListNode result;
        ListNode currentNode;

        if (list1.val < list2.val) {
            currentNode = list1;
            result = list1;
            list1 = list1.next;
        } else {
            currentNode = list2;
            result = list2;
            list2 = list2.next;
        }

        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                currentNode.next = list1;
                list1 = list1.next;
            } else {
                currentNode.next = list2;
                list2 = list2.next;
            }
            currentNode = currentNode.next;
        }

        while (list1 != null) {
            currentNode.next = list1;
            list1 = list1.next;
            currentNode = currentNode.next;
        }

        while (list2 != null) {
            currentNode.next = list2;
            list2 = list2.next;
            currentNode = currentNode.next;
        }

        return result;
    }
}