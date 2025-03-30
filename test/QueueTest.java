import org.junit.Test;


import static org.junit.Assert.*;

public class QueueTest {
    @Test
    public void testMYQueueMethod_isEmpty() {
        Queue MyQueue = new Queue(5);
        assertTrue(MyQueue.isEmpty());

    }
    @Test
    public void testMYQueueMethod_add() {
        Queue MyQueue = new Queue(5);
        MyQueue.add("Bode");
        assertFalse(MyQueue.isEmpty());
    }
    @Test
    public void testMYQueueMethod_pop() {
        Queue MyQueue = new Queue(5);
        MyQueue.add("Bode");
        MyQueue.pop();
        assertTrue(MyQueue.isEmpty());
    }
    @Test
    public void  testMYQueueMethod_isFull() {
        Queue MyQueue = new Queue(2);
        MyQueue.add("Bode");
        MyQueue.add("Bode");
        assertTrue(MyQueue.full());
    }
    @Test
    public void testMYQueueMethodThrowExceptionIfFull() {
        Queue MyQueue = new Queue(2);
        MyQueue.add("Bode");
        MyQueue.add("Bode");
        assertThrows(IllegalArgumentException.class,() -> MyQueue.add("Bode"));
    }
    @Test
    public void testMYQueueMethodThrowExceptionIfEmpty() {
        Queue MyQueue = new Queue(2);
        MyQueue.add("Bode");
        MyQueue.add("Bode");
        assertThrows(IllegalArgumentException.class,() -> MyQueue.add("Bode"));
        MyQueue.pop();
        MyQueue.pop();
        assertThrows(IllegalArgumentException.class,() -> MyQueue.pop());
    }
    @Test
    public void testMYQueueMethod_peek() {
        Queue MyQueue = new Queue(2);
        MyQueue.add("Bode");
        MyQueue.add("Lawal");
        assertEquals("Bode", MyQueue.peek());
    }
    @Test
    public void testMYQueueMethod_element() {
        Queue MyQueue = new Queue(2);
        MyQueue.add("Bode");
        MyQueue.add("Lawal");
        assertTrue(MyQueue.element("Bode"));
    }
    @Test
    public void testMYQueueMethod_size() {
        Queue MyQueue = new Queue(2);
        MyQueue.add("Bode");
        assertEquals(1, MyQueue.size());
    }

}
