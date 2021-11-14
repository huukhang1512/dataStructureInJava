package DataStructure.Map;
import java.util.*;
public class Map<K,V> {
    private int CAPACITY = 10;
    private Bucket[] bucket;
    private int size = 0;
    public Map(){
        this.bucket = new Bucket[CAPACITY];
    }
    public int size(){
        return size;
    }
    public boolean containsKey(K key){
        int hash = getHash(key);
        return !(Objects.isNull(bucket[hash]) || Objects.isNull(getEntry(key)));
    }

    private KeyValueEntry getEntry(K key){
        int hash = getHash(key);
        for(int i = 0; i < bucket[hash].getEntries().size();i++){
            KeyValueEntry keyVal = bucket[hash].getEntries().get(i);
            if(keyVal.getKey().equals(key)){
                return keyVal;
            }
        }
        return null;
    }
    public int getHash(K key){
        // bitwise AND operation
        return (key.hashCode() & 0xfffffff) % CAPACITY;
    }

    // CRUD
    public void delete(K key){
        if(containsKey(key)){
            int hash = getHash(key);
            bucket[hash].removeEntry(getEntry(key));
            size--;
        }
    }
    public V get(K key){
        return containsKey(key) ? (V) getEntry(key).getValue() : null;
    }

    public void put (K key, V value){
        if(containsKey(key)){
            KeyValueEntry entry = getEntry(key);
            entry.setValue(value);
        } else {
            int hash = getHash(key);
            if (bucket[hash] == null) {
                bucket[hash] = new Bucket();
            }
            bucket[hash].addEntry(new KeyValueEntry<>(key,value));
            size++;
        }
    }

}

