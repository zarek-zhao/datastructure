package com.zarek;

/**
 * @author zarek
 * @version 1.0.0
 * @since 1.0.0
 */
public class LinkList<E> {
    private int size;
    private Node<E> head = new Node<>();
    private Node<E> tail = head;

    public static void main(String[] args)
    {
        int[] arr = {128,129};
        int a = arr[1];
        int b = arr[1];

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    static class Node<E> {
        E element;
        Node<E> next;

        public E getElement()
        {
            return element;
        }

        public void setElement(E element)
        {
            this.element = element;
        }

        public Node<E> getNext()
        {
            return next;
        }

        public void setNext(Node<E> next)
        {
            this.next = next;
        }
    }


    public Node<E> add(E element)
    {

        Node<E> node = new Node<>();
        node.setElement(element);
        tail.setNext(node);
        tail = node;
        size++;
        return node;
    }

    public void remove()
    {
        if (head == null) {
            throw new ArrayIndexOutOfBoundsException();
        }


        Node<E> node = head.next;
        for (int i = 0; i < size; i++) {

            if (node.next == null) {

            }

        }
    }


    public int size()
    {
        return size;
    }

    public void clear()
    {
        head = null;
        size = 0;

    }

    @Override
    public String toString()
    {


        StringBuilder stringBuilder = new StringBuilder();

        if (head.next != null) {
            Node<E> node = head.next;
            for (int i = 0; i <= size; i++) {
                stringBuilder.append("index=").append(i).append(" element=").append(node.getElement());
                stringBuilder.append("\n");
                node = node.getNext();
                if (node == null) {
                    break;
                }
            }
        }


        return stringBuilder.toString();
    }

    private Node<E> node(int index)
    {
        if (index > size) {
            throw new ArrayIndexOutOfBoundsException();
        }
        Node<E> node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }
}
