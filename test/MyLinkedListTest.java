import org.junit.Test;
import static org.junit.Assert.*;

public class MyLinkedListTest {
    @Test
    public void testMyLinkedListIsEmpty(){
      MyLinkedList myLinkedList = new MyLinkedList();
      assertTrue(myLinkedList.isEmpty());
    }
    @Test
    public void testMyLinkedListIsNotEmpty(){
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.append(1);
        assertFalse(myLinkedList.isEmpty());
    }
    @Test
    public void testMyLinkedListIsCanAppendMoreNodes() {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.append(1);
        myLinkedList.append(2);
        myLinkedList.append(3);
        assertEquals(3, myLinkedList.size());
    }
    @Test
    public void testMyLinkedListIsCanGetDataByIndex() {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.append(1);
        myLinkedList.append(2);
        myLinkedList.append(3);
        assertEquals(3, myLinkedList.get(2));

    }
    @Test
    public void testMyLinkedListIsCanPrependNode() {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.append(1);
        myLinkedList.append(2);
        myLinkedList.append(3);
        myLinkedList.prepend(4);
        assertEquals(4, myLinkedList.get(0));
    }
    @Test
    public void testMyLinkedListIsCanRemoveNodeWithIndex() {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.append(1);
        myLinkedList.append(2);
        myLinkedList.append(3);
        myLinkedList.deleteAt(1);
        assertEquals(3, myLinkedList.get(1));
    }
    @Test
    public void testMyLinkedListIsCanRemoveNodeWithValue() {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.append(1);
        myLinkedList.append(2);
        myLinkedList.append(3);
        myLinkedList.delete(2);
        assertEquals(2, myLinkedList.size());
    }
    @Test
    public void testMyLinkedListIsCanThrowExceptionIfValueInDeleteNodeNotExist() {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.append(1);
        myLinkedList.append(2);
        myLinkedList.append(3);
        assertThrows(IllegalArgumentException.class,() -> myLinkedList.delete(4));
    }
    @Test
    public void testMyLinkedListCanVFindValueAndReturnIndexOfTheNode() {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.append(1);
        myLinkedList.append(2);
        myLinkedList.append(3);
        myLinkedList.append(4);
        assertEquals(2, myLinkedList.find(3));
    }
    @Test
    public void testMyLinkedListCanInsertANodeAtIndex() {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.append(1);
        myLinkedList.append(2);
        myLinkedList.append(3);
        myLinkedList.append(4);
        myLinkedList.insert(4, 2);
        assertEquals(4, myLinkedList.get(2));
        assertEquals(3, myLinkedList.get(3));


    }
}
