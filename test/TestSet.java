import org.junit.Test;

import static org.junit.Assert.*;

public class TestSet {
    @Test
    public void testMYSetMethod_isEmpty() {
        Set MySet = new Set(5);
        assertTrue(MySet.isEmpty());
    }
    @Test
    public void testMYSetMethod_isNotEmpty() {
        Set MySet = new Set(5);
        MySet.add(1);
        assertFalse(MySet.isEmpty());
    }
    @Test
    public void testMYSetMethodRemove() {
        Set MySet = new Set(5);
        MySet.add(1);
        assertFalse(MySet.isEmpty());
        MySet.remove(1);
        assertTrue(MySet.isEmpty());
    }
    @Test
    public void testMYSetMethodRemoveAndReturnValue() {
        Set MySet = new Set(5);
        MySet.add(1);
        MySet.add(2);
        assertEquals(2, MySet.remove(2));
    }
    @Test
    public void testMYSetMethodAddThrowExceptionWhenItFull() {
        Set MySet = new Set(2);
        MySet.add(1);
        MySet.add(2);
        assertThrows(IllegalArgumentException.class, () -> MySet.add(3));
    }
    @Test
    public void testMYSetMethodRemoveThrowExceptionWhenItEmpty() {
        Set MySet = new Set(2);
        assertThrows(IllegalArgumentException.class, () -> MySet.remove(2));
    }
    @Test
    public void testMYSetMethodSize() {
        Set MySet = new Set(2);
        MySet.add(1);
        assertEquals(1, MySet.size());
    }
    @Test
    public void testMYSetMethodContains() {
        Set MySet = new Set(2);
        MySet.add(1);
        assertTrue(String.valueOf(1),MySet.contain(1));
    }
    @Test
    public void testMYSetMethodelementAreUnique() {
        Set MySet = new Set(2);
        MySet.add(1);
        MySet.add(1);
        assertEquals(1, MySet.size());
        MySet.add(2);
        assertEquals(2, MySet.size());
    }
    @Test
    public void testMYSetMethodeClear() {
        Set MySet = new Set(2);
        MySet.add(1);
        MySet.add(2);
        MySet.clear();
        assertEquals(0, MySet.size());
    }
    @Test
    public void testMYSetMethodePrintDisplay() {
        Set MySet = new Set(2);
        MySet.add(1);
        MySet.add(2);
        assertEquals("[1,2]", MySet.printSet());

    }




}
