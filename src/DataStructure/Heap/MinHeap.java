package DataStructure.Heap;

import java.util.Arrays;

public class MinHeap {
    private int[] heap;
    private int capacity = 10;
    private int size = 0;
    public int size(){
        return size;
    }
    public MinHeap(){
        heap = new int[capacity];
    }
    private int parent(int pos){
        return (pos-1)/2;
    }
    private int leftChild(int pos){
        return pos*2 + 1;
    }
    private int rightChild(int pos){
        return pos*2 + 2;
    }
    private boolean hasLeftChild(int index){
        return leftChild(index) < size;
    }
    private boolean hasRightChild(int index){
        return rightChild(index) < size;
    }
    private boolean hasParent(int index){
        return parent(index) >= 0;
    }
    private void swap (int parentPos, int childPos){
        int tmp = heap[parentPos];
        heap[parentPos] = heap[childPos];
        heap[childPos] = tmp;
    }
    private void heapifyUp(){
        int index = size -1;
        while(hasParent(index) && heap[parent(index)] > heap[index]){
            swap(parent(index),index);
            index = parent(index);
        }
    }
    private void heapifyDown(){
        int index = 0;
        while(hasLeftChild(index)){
            int smallerChildIndex = leftChild(index);
            if(hasRightChild(index) && heap[rightChild(index)] < heap[leftChild(index)]){
                smallerChildIndex = rightChild(index);
            }
            if(heap[index] < heap[smallerChildIndex]){
                break;
            } else {
                swap(index,smallerChildIndex);
            }
            index = smallerChildIndex;
        }
    }
    public void insert(int element){
        ensureExtraCapacity();
        heap[size] = element;
        size++;
        heapifyUp();
    }
    public int peek(){
        if(size == 0) throw new IllegalStateException();
        return heap[0];
    }
    public int remove(){
        if(size == 0) throw new IllegalStateException();
        int item = heap[0];
        heap[0] = heap[size - 1 ];
        size--;
        heapifyDown();
        return item;
    }
    private void ensureExtraCapacity(){
        if(size == capacity) {
            heap = Arrays.copyOf(heap, capacity * 2);
            capacity *= 2;
        }
    }
    public void printHeap(){
        for(int i = 0 ; i <= size/2;i++){
            System.out.print("parent " + heap[parent(i)]);
            System.out.print("left" + heap[leftChild(i)]);
            System.out.println("right" + heap[rightChild(i)]);
            System.out.println(heap[i]);

        }
    }

}
