import org.junit.Test;


import static org.junit.Assert.*;

public class QueueTest {
    @Test
    public void testMYQueueMethod_isEmpty() {
        RealQueue MyQueue = new RealQueue(5);
        assertTrue(MyQueue.isEmpty());

    }
    @Test
    public void testMYQueueMethod_add() {
        RealQueue MyQueue = new RealQueue(5);
        MyQueue.enqueue("Bode");
        assertFalse(MyQueue.isEmpty());
    }
    @Test
    public void testMYQueueMethod_pop() {
        RealQueue MyQueue = new RealQueue(5);
        MyQueue.enqueue("Bode");
        MyQueue.dequeue();
        assertTrue(MyQueue.isEmpty());
    }
    @Test
    public void  testMYQueueMethod_isFull() {
        RealQueue MyQueue = new RealQueue(2);
        MyQueue.enqueue("Bode");
        MyQueue.enqueue("Bode");
        assertTrue(MyQueue.isFull());
    }
    @Test
    public void testMYQueueMethodThrowExceptionIfFull() {
        RealQueue MyQueue = new RealQueue(2);
        MyQueue.enqueue("Bode");
        MyQueue.enqueue("Bode");
        assertThrows(IndexOutOfBoundsException.class,() -> MyQueue.enqueue("Bode"));
    }
    @Test
    public void testMYQueueMethodThrowExceptionIfEmpty() {
        RealQueue MyQueue = new RealQueue(2);
        MyQueue.enqueue("Bode");
        MyQueue.enqueue("Bode");
        assertThrows(IndexOutOfBoundsException.class,() -> MyQueue.enqueue("Bode"));
        MyQueue.dequeue();
        MyQueue.dequeue();
        assertThrows(IllegalArgumentException.class,() -> MyQueue.dequeue());
    }
    @Test
    public void testMYQueueMethod_peek() {
        RealQueue MyQueue = new RealQueue(2);
        MyQueue.enqueue("Bode");
        MyQueue.enqueue("Lawal");
        assertEquals("Bode", MyQueue.peek());
    }
    @Test
    public void testMYQueueMethod_element() {
        RealQueue MyQueue = new RealQueue(2);
        MyQueue.enqueue("Bode");
        MyQueue.enqueue("Lawal");
        assertTrue(MyQueue.element("Bode"));
    }
    @Test
    public void testMYQueueMethod_size() {
        RealQueue MyQueue = new RealQueue(2);
        MyQueue.enqueue("Bode");
        assertEquals(2, MyQueue.getSize());
    }

}
