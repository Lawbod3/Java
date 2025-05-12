import org.junit.Test;

import static org.junit.Assert.*;

public class MyMapTest {
    @Test
    public void testMyMapIsEmpty() {
        MyMap<Integer, String> myMap = new MyMap<>();
        assertTrue(myMap.isEmpty());
    }

    @Test
    public void testMyMapIsNotEmpty() {
        MyMap<Integer, String> myMap = new MyMap<>();
        myMap.put(1, "1" );
        assertFalse(myMap.isEmpty());
    }

    @Test
    public void testMyMapCanGetValueWithKey() {
        MyMap<Integer,String> myMap = new MyMap<>();
        myMap.put(1, "1" );
        assertEquals("1",  myMap.get(1));
    }

    @Test
    public void testMyMapContainsKey() {
        MyMap<Integer, String> myMap = new MyMap<>();
        myMap.put(1, "1" );
        assertTrue(myMap.containsKey(1));
    }

    @Test
    public void testMyMapContainsValue() {
        MyMap<String, Integer> myMap = new MyMap<>();
        myMap.put("1", 1 );
        assertTrue(myMap.containsValue(1));

    }

    @Test
    public void testMyMapCanRemoveValueWithKey() {
        MyMap<Integer, String> myMap = new MyMap<>();
        myMap.put(1, "1" );
        myMap.put(2, "2" );
        myMap.remove(1);
        assertFalse(myMap.containsValue("1"));
    }

    @Test
    public void testMyMapCanClearAllKeyAndValue() {
        MyMap<Integer, String> myMap = new MyMap<>();
        myMap.put(1, "1" );
        myMap.put(2, "2" );
        myMap.clear();
        assertTrue(myMap.isEmpty());
    }

    @Test
    public void testMyMapIsIterable() {
        MyMap<Integer, String> myMap = new MyMap<>();
        myMap.put(1, "1" );
        myMap.put(2, "2" );
        myMap.put(3, "3" );
        for(int key : myMap.keySet()){
            if(key == 2){
                assertEquals("2", myMap.get(key));
              break;
            }
        }

    }

    @Test
    public void testMyMapIsEmptyIterable() {
        MyMap<String, String> myMap = new MyMap<>();
        for(String value : myMap.keySet()){
            assertFalse(myMap.containsKey(value));

        }
    }

    @Test
    public void testMyMapCanIterateValues() {
        MyMap<Integer, String> myMap = new MyMap<>();
        myMap.put(1, "1" );
        myMap.put(2, "2" );
        myMap.put(3, "3" );
        for(String value : myMap.values()){
            assertTrue(myMap.containsValue(value));
        }
    }





    


}