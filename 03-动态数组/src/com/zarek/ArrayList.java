package com.zarek;

/**
 * @author zarek
 * @version 1.0.0
 * @since 1.0.0
 */
public class ArrayList<E> {
    private int size;
    private Object[] elements;
    private static final int DEFAULT_CAPACITY = 10;


    public ArrayList()
    {
        this(DEFAULT_CAPACITY);
    }


    public ArrayList(int capacity)
    {
//        if (capacity < DEFAULT_CAPACITY) {
//            capacity = DEFAULT_CAPACITY;
//        }
        capacity = Math.max(capacity, DEFAULT_CAPACITY);
        this.elements = new Object[capacity];
    }

    public void add(E element)
    {
        if (isCapacity()) {
            expandCapacity();
        }

        elements[size] = element;
        size++;
    }

    private void expandCapacity()
    {
        int newCapacity = (elements.length >> 1) + elements.length;
        Object[] newElements = new Object[newCapacity];
        for (int i = 0; i < elements.length; i++) {
            newElements[i] = elements[i];
        }
        elements = newElements;
    }

    /**
     * 是否需要扩容
     *
     * @return
     */
    private boolean isCapacity()
    {
        return elements.length <= size;
    }

    public void remove()
    {
        if (size <= 0) {
            return;
        }
        elements[size] = null;
        size--;
    }

    public Object get(int index)
    {
        if (index < 0 || index >= size) {
            throw new ArrayIndexOutOfBoundsException("Index:" + index + " Size: " + size);
        }

        return elements[index];

    }

    public Object set(int index, Object element)
    {
        if (index < 0 || index >= size) {
            throw new ArrayIndexOutOfBoundsException("Index:" + index + " Size: " + size);
        }

        Object old = elements[index];
        elements[index] = element;
        return old;
    }

    public int size()
    {
        return size;
    }

    public void clear()
    {
        for (int i = 0; i < size; i++) {
            elements[i] = null;
        }
        size = 0;
    }

    public boolean empty()
    {
        return size == 0;
    }
}
