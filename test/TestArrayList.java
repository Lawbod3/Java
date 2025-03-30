import MyArrayList.MyArrayList;
import org.junit.Test;

import java.util.NoSuchElementException;

import static org.junit.Assert.*;

public class TestArrayList {
    @Test
    public void testMyArrayListMethod_isEmpty() {
        MyArrayList list = new MyArrayList();
        assertTrue(list.isEmpty());
    }
    @Test
    public void testMyArrayListMethod_isNotEmpty() {
        MyArrayList list = new MyArrayList();
        list.add(2);
        assertFalse(list.isEmpty());
    }
    @Test
    public void testMyArrayListMethod_remove() {
        MyArrayList list = new MyArrayList();
        list.add(2);
        list.add(3);
        assertEquals(2,list.remove(2));
    }
    @Test
    public void testMYArrayListMethod_removeThrowException () {
        MyArrayList list = new MyArrayList();
        list.add(2);
        list.add(3);
        assertThrows(NoSuchElementException.class, () -> list.remove(1));
    }
    @Test
    public void testMYArrayListMethod_addToKeepOnAdding() {
        MyArrayList list = new MyArrayList();
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        assertEquals(4, list.size());
    }
    @Test
    public void testMYArrayListMethod_get () {
        MyArrayList list = new MyArrayList();
        list.add(2);
        list.add(3);
        list.add(4);
        assertEquals(4, list.get(2));

    }
    @Test
    public void testMYArrayListMethod_getThrowException () {
        MyArrayList list = new MyArrayList();
        list.add(2);
        list.add(3);
        assertThrows(IllegalArgumentException.class, () -> list.get(2));
    }
    @Test
    public void testMYArrayListMethod_contain() {
        MyArrayList list = new MyArrayList();
        list.add(2);
        list.add(3);
        list.add(4);
        assertTrue(list.contain(4));
    }
    @Test
    public void testMYArrayListMethod_clear () {
        MyArrayList list = new MyArrayList();
        list.add(2);
        list.add(3);
        list.clear();
        assertTrue(list.isEmpty());
    }
    @Test
    public void testMYArrayListMethod_Print() {
        MyArrayList list = new MyArrayList();
        list.add(2);
        list.add(3);
        assertEquals("[2,3]", list.print());
    }
    @Test
    public void testMYArrayListMethod_set() {
        MyArrayList list = new MyArrayList();
        list.add(2);
        list.add(3);
        list.add(4);
        list.set(1,5);
        assertEquals(5, list.get(1));
    }
    @Test
    public void testMYArrayListMethod_setThrowException() {
        MyArrayList list = new MyArrayList();
        list.add(2);
        list.add(3);
        assertThrows(IllegalArgumentException.class, () -> list.set(2,4));
    }
}
