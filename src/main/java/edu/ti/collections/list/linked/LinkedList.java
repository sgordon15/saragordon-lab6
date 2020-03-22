package edu.ti.collections.list.linked;

public class LinkedList {
    private java.lang.Object Object;

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
    private Node endNode() {
        Node endNode = head;
        while (endNode.getNext() != null) {
            endNode = endNode.getNext();
        }
        return endNode;

    }

    //TODO -- implement size to return number of Nodes in list
    public int size() {
        int size = 0;
        Node currentNode = head;
        while (currentNode.getNext() != null) {
            size++;
            currentNode = currentNode.getNext();
        }
        size += 1; //add 1 to include the last node
        return size;
    }

    //TODO -- implement insert, which inserts Node for object as new head of list
    public void insert(Object object) {
        Node newNode = new Node(object);
        newNode.setNext(head);
        head = newNode;
    }

    //TODO -- implement append, that appends Node to end of list
    public void append(Object object) {
        Node new_node = new Node(object);
        new_node.next = null;
        // If the Linked List is empty, then make the new node as head
        if (isEmpty()) {
            head = new_node;
        } else {
            // traverse till the last node and insert the new_node there
            // Insert the new_node at last node
            Node previous = endNode();
            previous.next = new_node;
        }
    }

    //TODO -- implement get to retrieve the n-th object in the list,
    //        return null if n > (size() - 1)
    public Object get(int n) {
        if (n > size() - 1) {
            return null;
        } else {
            Node last = head;  //point to first node
            for (int i = 0; i<n; i++) {  //run n times
                //while (last.next != null) {  //while there is still another node
                last = last.getNext(); //make the next node be the last node
                // }
            }
            return last.getPayload();  //return node at n position
        }

    }

    //TODO -- implement remove to remove n-th element of list,
    //        return Object if n < size(), null otherwise
    public Object remove(int n) {
        Node currentNode = head, previous = null;
        if (n == 0 && currentNode != null) {   //if u want to delete the first node and there is a first node to delete
            head = currentNode.getNext();      //head points to the next node (which deletes the first node?)
            System.out.println(n + " position element deleted");
            return currentNode.getPayload();  //return data in the current node and end method
        }
        int counter = 0;
        while (currentNode != null) {
            if (counter == n) { //if at the node at n position
                previous.next = currentNode.getNext(); //delete current node
                System.out.println(n + " position element deleted");
                return currentNode.getPayload();          //return current node and end method
            } else { //go to next node
                previous = currentNode;
                currentNode = currentNode.getNext();
                counter++;
            }
        }
        if (currentNode == null) {
            System.out.println(n + " position element not found");
        }
        return currentNode.getPayload();
    }
    //TODO -- implement remove to remove given object from list,
    //        return Object if object is in the list, null otherwise
    public Object remove(Object object) {
        Node currentNode = head, previous = null;
        if (currentNode != null && currentNode.getPayload() == object) {
            head = currentNode.getNext();
            System.out.println(object + " found and deleted");
            return currentNode.getPayload();
        }
        previous = currentNode;          //go to
        currentNode = currentNode.getNext();  //the next node
        if (currentNode != null) {
            previous.next = currentNode.getNext(); //skips/deletes current node
            System.out.println(object + " found and deleted");
        }
        if (currentNode == null) {
            System.out.println(object + " not found");
        }
        return currentNode.getPayload();
    }
}



