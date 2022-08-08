import DataStructure.Heap.*;
import DataStructure.Stack.Stack;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        MinHeap heap = new MinHeap();
        for (int i = 0; i <= 30;i++){
            heap.insert((int)Math.floor(Math.random()*(10+1)+0));
        }

        heap.printHeap();

        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < 30; i++){
            stack.push(i);
        }

        while(!stack.isEmpty()){
            int item = stack.pop();
            System.out.println(item);
        }
    }
}