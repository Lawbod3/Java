public class RealQueue {
    private String[] queue;
    private int counter;
    private int nextOnQueue;


    public RealQueue(int size) {
        queue = new String[size];
        counter = 0;
        nextOnQueue = 0;

    }

    public boolean isEmpty() {
       if(queue[nextOnQueue] == null)return true;
       return false;
    }

    public void enqueue(String value) {
        if(nextOnQueue != 0 && counter == queue.length ) moveQueue();
        if(isFull())throw new IndexOutOfBoundsException("Queue is full");
        queue[counter++] = value;


    }

    public boolean isFull() {
        if(nextOnQueue == 0 && counter == queue.length ) return true;
        return false;
    }

    public void dequeue() {
        if(nextOnQueue != 0 && counter == queue.length ) moveQueue();
        if(isEmpty()) throw new IllegalArgumentException("Queue is empty");
        queue[nextOnQueue++] = null;
    }

    public int getSize() {
        return queue.length;
    }

    public String peek() {
        return queue[nextOnQueue];
    }
    private void moveQueue() {
            String[] temp = new String[queue.length];
            counter = 0;
            for (int i = 0; i < queue.length; i++) {
                if (queue[i] != null) temp[counter++] = queue[i];
            }
            nextOnQueue = 0;
            queue = temp;
    }


    public boolean element(String value) {
        for(String element : queue) if (element.equals(value)) return true;
        return false;
    }
}
