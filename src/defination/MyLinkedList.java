package defination;

import adt.LinkedListADT;

public class MyLinkedList<E> implements LinkedListADT<E> {
    //create the node class
    private static class Node<E> {
        private E data;
        private Node<E> next;

        public Node(E data, Node<E> next) {
            this.data = data;
            this.next = next;
        }

        public E getData() {
            return data;
        }


        public Node<E> getNext() {
            return next;
        }



        private Node(E data) {
            this.data = data;
            this.next = null;
        }
    }

    public void add(E item) {

    }

    public E remove(E item) {
        return null;
    }

    public int search(E item) {
        return 0;
    }

    public void sort() {

    }

    public void print() {

    }
}