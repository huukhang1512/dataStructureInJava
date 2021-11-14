import DataStructure.Map.Map;
public class Main {
    public static void main(String[] args) {
        Map<Integer,Integer> map = new Map<>();
        int[] testArr = {10,20,30,40,50,60,70,80,90,100};

        for(int i = 0; i < 10;i++){
//            System.out.println(i);
            map.put(i,testArr[i]);
        }

        map.put(3,10);
        map.get(3);
        for(int i = 0; i < 10;i++){
            map.getHash(i);
        }
    }
}
