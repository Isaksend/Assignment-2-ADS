import java.sql.Array;
import java.util.Iterator;
import java.util.NoSuchElementException;


public class MyArrayList<T extends Comparable<T>>  implements MyList<T> {
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
    @SuppressWarnings("unchecked")
    private T elementData(int index) {
        return (T) els[index];
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
        if (index > size || index < 0) {
            throw new IndexOutOfBoundsException();
        }
        ensureCapacity();
        // Move elements to right
        for (int i = size; i > index; i--) {
            els[i] = els[i - 1];
        }
        els[index] = item;
        size++;
    }

    @Override
    public void addFirst(T item) {
        add(0, item);
    }

    @Override
    public void addLast(T item) {
        add(item);
    }

    @Override
    public T get(int index) {
        if (index >= size || index < 0){
            throw new IndexOutOfBoundsException();
        }
        return elementData(index);

    }

    @Override
    public T getFirst() {
        return get(0);
    }

    @Override
    public T getLast() {
        return get(size-1);
    }

    @Override
    public T remove(int index) {
        if(index >= size || index < 0){
            throw new IndexOutOfBoundsException();
        }
        T item = elementData(index);
        for (int i = index; i < size-1; i++){
            els[i] =  els[i+1];
        }
        els[--size] = null;
        return item;
    }

    @Override
    public void removeFirst() {
        if (size == 0){
            throw new NoSuchElementException();
        }
        remove(0);
    }

    @Override
    public void removeLast() {
        if (size == 0){
            throw new NoSuchElementException();
        }
        remove(size-1);
    }

    @Override
    public void sort() {
        for (int i = 1; i < size; i++) {
            T key = elementData(i);
            int j = i - 1;
            //Insertion sort
            // Move elements that are greater than key to one position ahead
            // of their current position
            while (j >= 0 && elementData(j).compareTo(key) > 0) {
                els[j + 1] = els[j];
                j--;
            }
            els[j + 1] = key;
        }
    }

    @Override
    public int indexOf(Object object) {
        for (int i=0; i<size; i++){
            if (object.equals(els[i])){
                return i;
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object object) {
        for (int i = size-1; i >= 0; i--){
            if (object.equals(els[i])){
                return i;
            }
        }
        return -1;
    }

    @Override
    public boolean exists(Object object) {
        return indexOf(object) >= 0;
    }

    @Override
    public Object[] toArray() {
        Object[] newArray = new Object[size];
        for (int i=0; i < size; i++){
            newArray[i] = els[i];
        }
        return newArray;
    }

    @Override
    public void clear() {
        for (int i = 0; i<size; i++){
            els[i] = null;
        }
        size = 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private int currentIndex = 0;

            @Override
            public boolean hasNext() {
                return currentIndex < size;
            }

            @Override
            public T next() {
                if (!hasNext()){
                    throw new NoSuchElementException();
                }
                return elementData(currentIndex++);
            }
        };
    }
}
