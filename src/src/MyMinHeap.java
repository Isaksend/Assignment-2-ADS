import java.util.Arrays;

public class MyMinHeap {
    //initial parameters
    private int[] heap;
    private int size;
    private int capacity;
    // Constructor to initialize the heap with a given capacity
    public MyMinHeap(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        this.heap = new int[this.capacity];
    }
    // get indexes for nodes
    private int getParentIndex(int childIndex) { return (childIndex - 1) / 2; }
    private int getLeftChildIndex(int parentIndex) { return 2 * parentIndex + 1; }
    private int getRightChildIndex(int parentIndex) { return 2 * parentIndex + 2; }
    private boolean hasParent(int index) { return getParentIndex(index) >= 0; }
    private boolean hasLeftChild(int index) { return getLeftChildIndex(index) < size; }
    private boolean hasRightChild(int index) { return getRightChildIndex(index) < size; }
    private int parent(int index) { return heap[getParentIndex(index)]; }
    private int leftChild(int index) { return heap[getLeftChildIndex(index)]; }
    private int rightChild(int index) { return heap[getRightChildIndex(index)]; }
    //swap two nodes in the heap
    private void swap(int indexOne, int indexTwo) {
        int temp = heap[indexOne];
        heap[indexOne] = heap[indexTwo];
        heap[indexTwo] = temp;
    }
    // Ensure there is space for more elements
    private void ensureExtraCapacity() {
        if (size == capacity) {
            heap = Arrays.copyOf(heap, capacity * 2);
            capacity *= 2;
        }
    }
    // Peek at the smallest element without removing it
    public int peek() {
        if (size == 0) throw new IllegalStateException();
        return heap[0];
    }
    // Remove and return the smallest element
    public int poll() {
        if (size == 0) throw new IllegalStateException();
        int item = heap[0];
        heap[0] = heap[size - 1];
        size--;
        heapifyDown();
        return item;
    }
    // Add a new item to the heap
    public void add(int item) {
        ensureExtraCapacity();
        heap[size] = item;
        size++;
        heapifyUp();
    }
    // Move a node up in the heap until the heap property is restored
    private void heapifyUp() {
        int index = size - 1;
        while (hasParent(index) && parent(index) > heap[index]) {
            swap(getParentIndex(index), index);
            index = getParentIndex(index);
        }
    }
    // Move a node down in the heap until the heap property is restored
    private void heapifyDown() {
        int index = 0;//start from the root
        while (hasLeftChild(index)) {
            int smallerChildIndex = getLeftChildIndex(index);
            if (hasRightChild(index) && rightChild(index) < leftChild(index)) {
                smallerChildIndex = getRightChildIndex(index);
            }

            if (heap[index] < heap[smallerChildIndex]) {//correct position
                break;
            } else {
                swap(index, smallerChildIndex);//swap with smaller child
            }
            index = smallerChildIndex;// Move down to the smaller child
        }
    }
}
