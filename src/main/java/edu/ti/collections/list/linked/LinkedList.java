package edu.ti.collections.list.linked;

public class LinkedList {
    private class Node {
        Object payload;
        Node next = null;

        public Node(Object payload) {
            this.payload = payload;
        }

        public Object getPayload() {
            return payload;
        }

        public void setPayload(Object payload) {
            this.payload = payload;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }

    private Node head = null;

    public LinkedList() {
        // nothing
    }

    public LinkedList(Object payload) {
        head = new Node(payload);
    }

    public boolean isEmpty() {
        return (head == null);
    }

    //TODO -- implement private helper method end that returns last Node in list
    private Node end() {
        return null;
    }

    //TODO -- implement size to return number of Nodes in list
    public int size() {
        return -1;
    }

    //TODO -- implement insert, which inserts Node for object as new head of list
    public void insert(Object object) {
        //code needed here
    }

    //TODO -- implement append, that appends Node to end of list
    public void append(Object object) {
        //code needed here
    }

    //TODO -- implement get to retrieve the n-th object in the list,
    //        return null if n > (size() - 1)
    public Object get(int n) {
        return null;
    }

    //TODO -- implement remove to remove n-th element of list,
    //        return Object if n < size(), null otherwise
    public Object remove(int n) {
        return null;
    }

    //TODO -- implement remove to remove given object from list,
    //        return Object if object is in the list, null otherwise
    public Object remove(Object object) {
        return null;
    }
}
