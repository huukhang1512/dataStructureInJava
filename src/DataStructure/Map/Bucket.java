package DataStructure.Map;
import java.util.*;
public class Bucket {
    // why Linkedlist ? it is used to prevent collision in case 2 values has the same hashcode
    private List<KeyValueEntry> entries;
    public Bucket(){
        if(entries == null){
            entries = new LinkedList<>();
        }
    }
    public List<KeyValueEntry> getEntries(){
        return entries;
    }
    public void addEntry(KeyValueEntry entry){
        this.entries.add(entry);
    }
    public void removeEntry(KeyValueEntry entry){
        this.entries.remove(entry);
    }
}
