package edu.kis.vh.nursery.list;

public class IntLinkedList {
    public static class node {

        private final int value;
        private node prev;
        private node next;

        public node(int i) {
            value = i;
        }

        public int getValue() {
            return value;
        }

        public node getPrev() {
            return prev;
        }

        public void setPrev(node prev) {
            this.prev = prev;
        }

        public node getNext() {
            return next;
        }

        public void setNext(node next) {
            this.next = next;
        }
    }

    private node last;
    private int i;

    public void push(int i) {
        if (last == null)
            last = new node(i);
        else {
            last.setNext(new node(i));
            last.getNext().setPrev(last);
            last = last.getNext();
        }
    }

    public boolean isEmpty() {
        return last == null;
    }

    public boolean isFull() {
        return false;
    }

    public int top() {
        if (isEmpty())
            return -1;
        return last.getValue();
    }

    public int pop() {
        if (isEmpty())
            return -1;
        int ret = last.getValue();
        last = last.getPrev();
        return ret;
    }

}
