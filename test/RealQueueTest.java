import org.junit.Test;

import static org.junit.Assert.*;

public class RealQueueTest {
    @Test
    public void testRealQueueIsEmpty() {
        RealQueue realQueue = new RealQueue(5);
        assertTrue(realQueue.isEmpty());
    }

    @Test
    public void testRealQueueCanEnqueue() {
        RealQueue realQueue = new RealQueue(5);
        realQueue.enqueue("hauwa");
        assertFalse(realQueue.isEmpty());
    }
    @Test
    public void testRealQueueIsFull() {
        RealQueue realQueue = new RealQueue(5);
        realQueue.enqueue("harry");
        realQueue.enqueue("lawal");
        realQueue.enqueue("harry");
        realQueue.enqueue("harry");
        realQueue.enqueue("harry");
        assertTrue(realQueue.isFull());
    }
    @Test
    public void testRealQueueCanDequeue() {
        RealQueue realQueue = new RealQueue(5);
        realQueue.enqueue("harry");
        realQueue.enqueue("harry");
        realQueue.enqueue("harry");
        realQueue.enqueue("harry");
        realQueue.enqueue("harry");
        realQueue.dequeue();
        assertFalse(realQueue.isFull());
    }
    @Test
    public void testRealQueueCanGetSize() {
        RealQueue realQueue = new RealQueue(5);
        realQueue.enqueue("harry");
        realQueue.enqueue("harry");
        assertEquals(5, realQueue.getSize());
    }
    @Test
    public void testRealQueueCanEnqueueAndDequeue() {
        RealQueue realQueue = new RealQueue(5);
        realQueue.enqueue("harry");
        realQueue.enqueue("bode");
        realQueue.enqueue("harry");
        realQueue.dequeue();
        assertEquals("bode", realQueue.peek());
    }
    @Test
    public void testRealQueueCanDequeueAndEnqueue() {
        RealQueue realQueue = new RealQueue(5);
        realQueue.enqueue("harry");
        realQueue.enqueue("lawal");
        realQueue.enqueue("bode");
        realQueue.enqueue("majek");
        realQueue.dequeue();
        realQueue.dequeue();
        realQueue.dequeue();
        realQueue.dequeue();
        realQueue.enqueue("harry");
        realQueue.enqueue("bode");
        realQueue.dequeue();
        assertEquals("bode", realQueue.peek());

    }



}
