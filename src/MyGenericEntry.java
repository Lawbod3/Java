import java.util.Map;
import java.util.Objects;

public class MyGenericEntry<K, V> implements Map.Entry<K, V> {
    private  K key;
    private V value;

    public MyGenericEntry(K key, V value){
        this.key = key;
        this.value = value;
    }

    @Override
    public K getKey() {
        return key;
    }

    @Override
    public V getValue() {
        return value;
    }

    @Override
    public V setValue(V value) {
        V oldValue = this.value;
        this.value = value;
        return oldValue;
    }
    @Override
    public  boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyGenericEntry that = (MyGenericEntry) o;
        return Objects.equals(key, that.key) && Objects.equals(value, that.value);
    }
    @Override
    public int hashCode() {
        return Objects.hash(key, value);
    }

    @Override
    public String toString() {
        return "MyGenericEntry{Key=" + key + ", value=" + value + '}';
    }
}
