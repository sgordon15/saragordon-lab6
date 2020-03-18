package edu.ti.collections.list.linked;

import org.junit.Test;

import static org.junit.Assert.*;

public class LinkedListTest {
    @Test
    public void testNewListIsEmpty() {
        LinkedList linkedList = new LinkedList();
        assertTrue(linkedList.isEmpty());
    }
}