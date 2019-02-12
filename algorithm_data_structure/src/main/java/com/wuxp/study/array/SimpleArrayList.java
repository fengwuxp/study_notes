package com.wuxp.study.array;


import java.io.Serializable;
import java.util.*;


/**
 * 自定义实现的 List
 *
 * @param <E>
 */
public class SimpleArrayList<E> implements List<E>, RandomAccess, Serializable {


    /**
     * Default initial capacity.
     */
    private static final int DEFAULT_CAPACITY = 10;

    /**
     * Shared empty array instance used for empty instances.
     */
    private static final Object[] EMPTY_ELEMENTS = {};

    /**
     * Shared empty array instance used for default sized empty instances. We
     * distinguish this from EMPTY_ELEMENTS to know how much to inflate when
     * first element is added.
     */
    private static final Object[] DEFAULTCAPACITY_EMPTY_ELEMENTDATA = {};

    /**
     * 存放数据的数组
     */
    transient Object[] elements;

    /**
     * 数据长度
     */
    private int size;


    public SimpleArrayList() {
        this.elements = EMPTY_ELEMENTS;
    }


    public SimpleArrayList(int initialCapacity) {
        if (initialCapacity > 0) {
            this.elements = new Object[initialCapacity];
        } else if (initialCapacity == 0) {
            this.elements = EMPTY_ELEMENTS;
        } else {
            throw new IllegalArgumentException("Illegal Capacity: " +
                    initialCapacity);
        }
    }

    public int size() {
        return this.size;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public boolean contains(Object o) {

        return this.indexOf(0) > -1;
    }

    public Iterator<E> iterator() {
        return null;
    }

    public Object[] toArray() {
        return Arrays.copyOf(elements, size);
    }

    public <T> T[] toArray(T[] a) {
        if (a.length < size){
            // Make a new array of a's runtime type, but my contents:
            return (T[]) Arrays.copyOf(elements, size, a.getClass());
        }
        System.arraycopy(elements, 0, a, 0, size);
        if (a.length > size)
            a[size] = null;
        return a;
    }

    public boolean add(E e) {
        return false;
    }

    public boolean remove(Object o) {
        return false;
    }

    public boolean containsAll(Collection<?> c) {
        return false;
    }

    public boolean addAll(Collection<? extends E> c) {
        return false;
    }

    public boolean addAll(int index, Collection<? extends E> c) {
        return false;
    }

    public boolean removeAll(Collection<?> c) {
        return false;
    }

    public boolean retainAll(Collection<?> c) {
        return false;
    }

    public void clear() {

    }

    public E get(int index) {
        return null;
    }

    public E set(int index, E element) {
        return null;
    }

    public void add(int index, E element) {

    }

    public E remove(int index) {
        return null;
    }

    public int indexOf(Object o) {
        if (o == null) {
            for (int i = 0; i < this.size; i++) {
                if (this.elements[i] == null) {
                    return i;
                }
            }
        } else {
            for (int i = 0; i < this.size; i++) {
                if (o.equals(this.elements[i])) {
                    return i;
                }
            }
        }
        return -1;
    }

    public int lastIndexOf(Object o) {
        //last index of 从最后一个元素开始找
        if (o == null) {
            for (int i = size - 1; i >= 0; i++) {
                if (this.elements[i] == null) {
                    return i;
                }
            }
        } else {
            for (int i = size - 1; i >= 0; i++) {
                if (o.equals(this.elements[i])) {
                    return i;
                }
            }
        }
        return -1;
    }

    public ListIterator<E> listIterator() {
        return null;
    }

    public ListIterator<E> listIterator(int index) {
        return null;
    }

    public List<E> subList(int fromIndex, int toIndex) {
        return null;
    }
}
