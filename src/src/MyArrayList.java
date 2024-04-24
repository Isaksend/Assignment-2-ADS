import java.util.Iterator;

import java.util.NoSuchElementException;


public class MyArrayList<T> implements MyList<T> {
    private Object[] els;
    private int size;
    private void ensureCapacity() {
        if (size == els.length) {
            int newSize = els.length * 2;
            Object[] newEls = new Object[newSize];
            System.arraycopy(els, 0, newEls, 0, els.length);
            els = newEls;
        }
    }


    public MyArrayList(){
        els = new Object[10];
        size = 0;
    }
    @Override
    public void add(T item){
        ensureCapacity();
        els[size++] = item;
    }
    @Override
    public void set(int index, T item){
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        els[index] = item;
    }

    @Override
    public void add(int index, T item) {

    }

    @Override
    public void addFirst(T item) {

    }

    @Override
    public void addLast(T item) {

    }

    @Override
    public T get(int index) {
        return null;
    }

    @Override
    public T getFirst() {
        return null;
    }

    @Override
    public T getLast() {
        return null;
    }

    @Override
    public void remove(int index) {

    }

    @Override
    public void removeFirst() {

    }

    @Override
    public void removeLast() {

    }

    @Override
    public void sort() {

    }

    @Override
    public int indexOf(Object object) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object object) {
        return 0;
    }

    @Override
    public boolean exists(Object object) {
        return false;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public void clear() {

    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }
}
