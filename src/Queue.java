public class Queue {
     private String element;
     private int count;
     private String[] elements;

     public Queue(int size) {
         elements = new String[size];
         count = 0;

     }

    public boolean isEmpty() {
         if (count == 0) return true;
         return false;
    }

    public void add(String element) {
         if (count == elements.length) throw new IllegalArgumentException("Queue is full");
         elements[count] = element;
         count++;
    }

    public void pop() {
         if (isEmpty()) throw new IllegalArgumentException("Queue is empty");
         elements[0] = null;
         count--;

    }
    public boolean full() {
         if (count == elements.length) return true;
         return false;
    }

    public String peek() {
         return elements[0];
    }

    public boolean element(String value) {
         for(String element : elements) if (element.equals(value)) return true;
        return false;
    }


    public int size() {
         return count;
    }
}
