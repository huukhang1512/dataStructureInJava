package DataStructure.Stack;

import java.util.ArrayList;

public class Stack<T>{
    final private ArrayList<T> items;
    public Stack(){
        items = new ArrayList<>();
    }
    public T peek() {
        return items.get(items.size() - 1);
    }

    public T pop() {
        T lastItem = items.get(items.size() - 1);
        items.remove(items.size() - 1);
        return lastItem;
    }

    public void push(T item){
        items.add(item);
    }

    public int size(){
        return items.size();
    }

    public boolean isEmpty(){
        return items.size() == 0;
    }
}
