package defination;

import adt.LinkedListADT;

public class MyLinkedList<E> implements LinkedListADT<E> {
    private Node<E> Head = null;
    private int size = 0;

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

    //create the node class
    private static class Node<E> {
        private E data;
        private Node<E> next;

        private Node(E data, Node<E> next) {
            this.data = data;
            this.next = next;
        }

        private Node(E data) {
            this.data = data;
            this.next = null;
        }

        private E getData() {
            return data;
        }

        private Node<E> getNext() {
            return next;
        }
    }
}