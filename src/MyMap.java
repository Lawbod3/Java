import java.util.*;

public class MyMap<K,V> {
    List<MyGenericEntry> myEntries;


    public MyMap() {
        myEntries = new ArrayList<>();
    }


    public boolean isEmpty() {
        if (myEntries.isEmpty()) return true;
        return false;
    }

    public void put(K key, V value) {
        myEntries.add(new MyGenericEntry<>(key, value));
    }

    public String get(K key) {
        for (MyGenericEntry entry : myEntries) {
            if (entry.getKey().equals(key))return entry.getValue().toString();
        }
        return null;
    }

    public boolean containsKey(K key) {
        for (MyGenericEntry entry : myEntries) {
            if (entry.getKey().equals(key))return true;
        }
        return false;
    }

    public boolean containsValue(V value) {
        for (MyGenericEntry entry : myEntries) {
            if (entry.getValue().equals(value))return true;
        }
        return false;
    }

    public void remove(K key) {
        for(MyGenericEntry entry : myEntries) {
            if (entry.getKey().equals(key))myEntries.remove(entry);
        }
    }

    public void clear() {
        myEntries.clear();
    }


    public List<K> keySet() {
        List<K> keys = new ArrayList<>();
        for (MyGenericEntry entry : myEntries) {
            keys.add((K) entry.getKey());
        }
        return keys;

    }

    public List<V> values() {
        List<V> values = new ArrayList<>();
        for (MyGenericEntry entry : myEntries) {
            values.add((V) entry.getValue());
        }
        return values;
    }
}
