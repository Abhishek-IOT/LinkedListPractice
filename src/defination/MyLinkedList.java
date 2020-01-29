package defination;

import adt.LinkedListADT;

public class MyLinkedList<E> implements LinkedListADT<E> {
    private Node<E> Head = null;
    private int size = 0;

    private void addFirst(E data) {
        Head = new Node<E>(data, Head);
        size++;
    }

    private Node<E> getNode(int index) {
        Node<E> temp = Head;
        for (int i = 0; i < index; i++) {
            temp = temp.getNext();
        }
        return temp;
    }

    @Override
    public void add(E item) {

    }

    private void addAfter(E data, Node<E> node) {
        node.next = new Node<E>(data, node.next);
        size++;
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
        Node<E> temp = Head;
        while (temp.next != null) {
            System.out.println(temp);
            temp = temp.next;
        }

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

        @Override
        public String toString() {
            final StringBuffer sb = new StringBuffer("Node{");
            sb.append("data=").append(data);
            sb.append(", next=").append(next);
            sb.append('}');
            return sb.toString();
        }
    }
}