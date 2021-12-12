+ [Sort List](#sort-list)
+ [Intersection of Two Linked Lists](#intersection-of-two-linked-lists)
+ [Merge Two Sorted Lists](#merge-two-sorted-lists)
+ [Palindrome Linked List](#palindrome-linked-list)
+ [Middle of the Linked List](#middle-of-the-linked-list)
+ [Reverse Linked List](#reverse-linked-list)

[comment]: <> (Stop)

## Sort List

https://leetcode.com/problems/sort-list/

``` java
public ListNode sortList(ListNode head) {
    if (head == null || head.next == null) {
        return head;
    }
    ListNode mid = getMid(head);
    ListNode left = sortList(head);
    ListNode right = sortList(mid);
    return merge(left, right);
}
     
ListNode merge(ListNode list1, ListNode list2) {
    ListNode h = new ListNode();
    ListNode t = h;
    while (list1 != null && list2 != null) {
        if (list1.val > list2.val) {
            t.next = list2;
            list2 = list2.next;
        } else {
            t.next = list1;
            list1 = list1.next;
        }
        t = t.next;
    }
    if (list1 != null){
        t.next = list1;
    } else {
        t.next = list2;
    }
    return h.next;
}

ListNode getMid(ListNode head) {
    ListNode slow = null;
    while (head != null && head.next != null){
        if (slow == null) {
            slow = head;
        } else {
            slow = slow.next;
        }
        head = head.next.next;
    }
    ListNode mid = slow.next;
    slow.next = null;
    return mid;
}

```
## Intersection of Two Linked Lists

https://leetcode.com/problems/intersection-of-two-linked-lists/

``` java
public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
    if (headA == null || headB == null) {
        return null;
    }
    ListNode first = headA;
    ListNode second = headB;
    int list1 = 0;
    int list2 = 0;
    while (first != null) {
        first = first.next;
        list1 += 1;
    }
    while (second != null) {
        second = second.next;
        list2 += 1;
    }
    first = headA;
    second = headB;
    while (list1 < list2) {
        second = second.next;
        list2 -= 1;
    }
    while (list2 < list1) {
        first = first.next;
        list1 -= 1;
    }
    while (first != null && second != null) {
        if (first == second) {
            return first;
        }
        first = first.next;
        second = second.next;
    }
    return null;
}

```
## Merge Two Sorted Lists

https://leetcode.com/problems/merge-two-sorted-lists/

``` java
public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
    ListNode head = new ListNode();
    ListNode t = head;
    while (list1 != null && list2 != null) {
        if (list1.val > list2.val) {
            t.next = list2;
            list2 = list2.next;
        } else {
            t.next = list1;
            list1 = list1.next;
        }
        t = t.next;
    }
    if (list1 != null){
        t.next = list1;
    } else {
        t.next = list2;
    }
    return head.next;
}

```
## Palindrome Linked List

https://leetcode.com/problems/palindrome-linked-list/

``` java
public boolean isPalindrome(ListNode head) {
    if (head == null || head.next == null) {
        return true;
    }
    ListNode slow = head;
    ListNode fast = head;
    while (fast != null && fast.next != null) {
        slow = slow.next;
        fast = fast.next.next;
    }
    if (fast != null) {
        slow = slow.next;
    }
    ListNode prev = null;
    ListNode curr = slow;
    ListNode next = null;
    while (curr != null) {
        next = curr.next;
        curr.next = prev;
        prev = curr;
        curr = next;
    }
    while (prev != null) {
        if (prev.val != head.val) {
            return false;
        }
        head = head.next;
        prev = prev.next;
    }
    return true;
}

```
## Middle of the Linked List

https://leetcode.com/problems/middle-of-the-linked-list/

``` java
public ListNode middleNode(ListNode head) {
    ListNode slow = head;
    ListNode fast = head;
    while (fast != null && fast.next != null){
        slow = slow.next;
        fast = fast.next.next;
    }
    return slow;
}

```
## Reverse Linked List

https://leetcode.com/problems/reverse-linked-list/

``` java
public ListNode reverseList(ListNode head) {
    ListNode curr = head;
    ListNode prev = null;
    ListNode next = null;
    while (curr != null) {
        next = curr.next;
        curr.next = prev;
        prev = curr;
        curr = next;
    }
    return prev;
}

```