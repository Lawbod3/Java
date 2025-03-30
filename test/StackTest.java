import org.junit.Test;

import static org.junit.Assert.*;


public class StackTest {
    @Test
    public void testMYStackMethod_IsEmpty() {
        Stack MyStack = new Stack(5);
        assertTrue(MyStack.isEmpty());
    }
    @Test
    public void testMYStackMethodPush() {
        Stack MyStack = new Stack(5)  ;
        assertTrue(MyStack.isEmpty());
        MyStack.push("BODE");
        assertFalse(MyStack.isEmpty());

    }
    @Test
    public void testMYStackMethodPop() {
        Stack MyStack = new Stack(5);
        MyStack.push("BODE");
        assertFalse(MyStack.isEmpty());
        MyStack.pop();
        assertTrue(MyStack.isEmpty());
    }
    @Test
    public void testMYStackMethodPopThrowExceptionIfEmpty() {
        Stack MyStack = new Stack(5);
        MyStack.push("BODE");
        MyStack.pop();
        assertThrows(IllegalArgumentException.class,() ->{ MyStack.pop();} );
    }
    @Test
    public void testMYStackMethodFull() {
        Stack MyStack = new Stack(2);
        MyStack.push("BODE");
        MyStack.push("BODE");
        assertTrue(MyStack.full());
    }
    @Test
    public void testMYStackMethodFullThrowExceptionIfEmpty() {
        Stack MyStack = new Stack(2);
        MyStack.push("BODE");
        MyStack.push("BODE");
        assertTrue(MyStack.full());
        assertThrows(IllegalArgumentException.class,() ->{ MyStack.push("BODE");});
    }
    @Test
    public void testMYStackMethodPeek() {
       Stack MyStack = new Stack(3);
       MyStack.push("BODE");
       MyStack.push("BODE");
       MyStack.push("Lawal");
       assertEquals("Lawal", MyStack.peek());
    }
    @Test
    public void testMYStackMethodSize() {
        Stack MyStack = new Stack(3);
        assertEquals(0, MyStack.size());
        MyStack.push("BODE");
        MyStack.push("BODE");
        assertEquals(2, MyStack.size());
    }
    @Test
    public void testMYStackMethodClear() {
        Stack MyStack = new Stack(3);
        MyStack.push("BODE");
        MyStack.push("BODE");
        assertEquals(2, MyStack.size());
        MyStack.clear();
        assertEquals(0, MyStack.size());
    }



}
