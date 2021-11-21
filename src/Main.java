import DataStructure.Map.*;
import DataStructure.Heap.*;

public class Main {
    public static void main(String[] args) {
//        Map<Integer,Integer> map = new Map<>();
        MinHeap heap = new MinHeap();
        for (int i = 0; i <= 30;i++){
            heap.insert((int)Math.floor(Math.random()*(10-0+1)+0));
        }

        heap.printHeap();


    }
}
