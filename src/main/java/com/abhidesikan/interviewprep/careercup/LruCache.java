package com.abhidesikan.interviewprep.careercup;

import java.util.HashMap;

/**
 * Created by abhidesikan on 4/24/17.
 */
public class LruCache {

    private static HashMap<Integer, LinkedList> map = new HashMap<Integer, LinkedList>();
    private static LinkedList head;
    private static LinkedList tail;
    private int maxSize = 3;


    class LinkedList {
        int data;
        String value;
        LinkedList prev;
        LinkedList next;

        public LinkedList() {

        }
        public LinkedList(int data, String value) {
            this.data = data;
            this.value = value;
        }
    }

    public static LinkedList getHead() {
        return head;
    }

    public static LinkedList getTail() {
        return tail;
    }

    public void insertValue(int data, String value) {
        if(map.size() >= maxSize) {
            removeTailFromMap();
        }
        if(map.containsKey(data)) {
            removeElement(data);
        }
        if(map.isEmpty()) {
            LinkedList newNode = new LinkedList(data, value);
            head = newNode;
            tail = newNode;
            map.put(data, newNode);
        } else {
            insertElementIntoMap(data, value);
        }
    }

    public String getValue(int data) {
        if(map.containsKey(data)) {
            LinkedList newNode = map.get(data);
            removeElement(data);
            insertValue(data, newNode.value);
            return newNode.value;
        }
        return null;
    }

    public void insertElementIntoMap(int data, String value) {
        LinkedList currentHead = getHead();
        LinkedList newNode = new LinkedList(data, value);
        newNode.next = currentHead;
        currentHead.prev = newNode;
        newNode.prev = null;
        head = newNode;
        map.put(data, newNode);
    }
    public static void removeTailFromMap() {
        System.out.println("Removing last element");
        LinkedList currentTail = getTail();
        currentTail.prev.next = null;
        tail = currentTail.prev;
        map.remove(currentTail.data);
    }

    public static void removeElement(int data) {
        LinkedList list = map.get(data);
        if(list == tail && list == head) {
            head = null;
            tail = null;
        } else if (list == head) {
            list.next.prev = null;
            head = list.next;
        } else {
            list.next.prev = list.prev;
            list.prev.next = list.next;
        }
        map.remove(data);
    }

    public static void main(String args[]) {
        LruCache lruCache = new LruCache();
        lruCache.insertValue(2, "Abhi");
        System.out.println(lruCache.getValue(2));
        System.out.println(head.value);
        lruCache.insertValue(3, "Jicks");
        System.out.println(lruCache.getValue(3));
        System.out.println(tail.value);
        lruCache.insertValue(4, "Roji");
        System.out.println(lruCache.getValue(4));
        System.out.println(tail.value);
        lruCache.insertValue(5, "Sashi");
        System.out.println(lruCache.getValue(5));
        System.out.println(tail.value);
        lruCache.insertValue(5, "Sashi");
        System.out.println(tail.value);
        System.out.println(head.value);



    }
}
