package Multilevel_caching;

public class ListNode {
    public int key;
    public int val;
    public ListNode prev;
    public ListNode next;

    public ListNode(int key, int value) {
        this.key = key;
        this.val = value;
        this.prev = null;
        this.next = null;
    }
}
