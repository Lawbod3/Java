import java.util.Map;
import java.util.Objects;

public class MyEntry implements Map.Entry<String, String> {
    private String key;
    private String value;
    public MyEntry(String key, String value) {
        authenticateKey(key);
        authenticateValue(value);
    }
    private boolean  validateKey(String key) {
        boolean isValidKey = !key.isEmpty();
        if(isValidKey) return true;
        return false;
    }

    private boolean  validateValue(String value) {
        boolean isValidValue = !value.isEmpty();
        if(isValidValue) return true;
        return false;
    }

    private void authenticateKey(String key) {
        if(!validateKey(key)) throw new IllegalArgumentException("Invalid key");
        this.key = key;
    }
    private void authenticateValue(String value) {
        if(!validateValue(value)) throw new IllegalArgumentException("Invalid value");
        this.value = value;
    }




    @Override
    public String getKey() {
        return this.key;
    }

    @Override
    public String getValue() {
        return this.value;
    }

    @Override
    public String setValue(String value) {
        authenticateValue(value);
        return this.value ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyEntry entry = (MyEntry) o;
       return Objects.equals(key, entry.key) && Objects.equals(value, entry.value);
    }
}
