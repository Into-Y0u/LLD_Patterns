package Multilevel_caching;

import java.util.Hashtable;

class LRUCache {
    public int cap;
    public Hashtable<Integer, ListNode> nodeMap;
    public ListNode leftMax;
    public ListNode rightMax;

    public LRUCache(int capacity) {
        this.cap = capacity;
        this.nodeMap = new Hashtable<Integer, ListNode>();
        leftMax = new ListNode(-1, -1);
        rightMax = new ListNode(-1, -1);
        leftMax.next = rightMax;
        rightMax.prev = leftMax;
    }

    public void addNode(ListNode node) {
        ListNode temp1 = rightMax.prev;
        ListNode temp2 = rightMax;
        temp1.next = node;
        temp2.prev = node;
        node.prev = temp1;
        node.next = temp2;

    }

    public void removeNode(ListNode node) {
        ListNode temp1 = node.prev;
        ListNode temp2 = node.next;
        temp1.next = temp2;
        temp2.prev = temp1;
    }

    public int get(int key) {
        int val = -1;
        if (nodeMap.containsKey(key)) {
            ListNode node = nodeMap.get(key);
            val = node.val;
            removeNode(node);
            addNode(node);
        }
        return val;
    }

    public void put(int key, int value) {
        if (nodeMap.containsKey(key)) {
            ListNode node = nodeMap.get(key);
            removeNode(node);
        }
        ListNode freshNode = new ListNode(key, value);
        addNode(freshNode);

        if (nodeMap.size() > cap) {
            ListNode lru = leftMax.next;
            removeNode(lru);
            nodeMap.remove(lru.key);
        }

    }
}
