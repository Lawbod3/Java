public class Set {
     private int[] elements;
     private int count;
    public Set(int size) {
        elements = new int[size];
        count = 0;

    }

    public boolean isEmpty() {
        if (count == 0) return true;
        return false;

    }

    public void add(int element) {
        if(contain(element)) return;
        if (count == elements.length) throw new IllegalArgumentException("Set is Full");
        elements[count++] = element;

    }


    public int remove(int element) {
        if (count == 0) throw new IllegalArgumentException("Set is Empty");
        return elements[--count] = element ;
    }

    public int size() {
        return count;
    }


    public boolean contain(int value) {
        for(int element : elements) if (element == value) return true;

    return false;
    }


    public void clear() {
        elements = new int[elements.length];
        count = 0;
    }


    public String printSet() {
        String result = "[";
        for(int counter = 0; counter < count; counter++){
            if(counter < count) result +=elements[counter];
            else result += "empty";
            if(counter < count-1) result +=",";

        }
        result += "]";
        return result;
    }
}
