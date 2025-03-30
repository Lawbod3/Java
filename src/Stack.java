public class Stack {
    private String[] elements;
    private int count;
    public Stack(int size) {
    elements = new String[size];
    count = 0;


    }
    public boolean isEmpty() {
        if(count == 0) return true;
        return false;
    }

    public void push(String element) {
        if (count == elements.length) throw new IllegalArgumentException("Stack is full");
        elements[count] = element;
        count++;


    }

    public void pop() {
        if(isEmpty())throw new IllegalArgumentException("Stack is Empty");
        elements[--count] = null;
    }

    public boolean full() {
        if(count == elements.length) return true;
        return false;
    }


    public String peek() {
        return elements[count-1];
    }

    public int size() {
        return count;
    }

    public void clear() {
        for (int counter = count; counter > 0; counter--) {
            elements[--count] = null;

        }
    }
}
