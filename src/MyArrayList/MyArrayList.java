package MyArrayList;

import java.util.ArrayList;
import java.util.NoSuchElementException;

public class MyArrayList {
    private int[] list;
    private int count;
    private int resize;

    public MyArrayList() {
        list = new int[3];
        count = 0;
         resize = 0;
    }


    public boolean isEmpty() {
        if (count == 0) return true;
        return false;
    }

    public void add(int element) {
        reSize();
       list[count++] = element ;
    }

    public int remove(int element) {
        int index =  - 1;

        for(int counter = 0; counter < count; counter++) {
            if(list[counter] == element) {
                index = counter;
                break;
            }
            if(index == -1) throw new NoSuchElementException("Element " + element + " not found");
        }
        for(int counter = index; counter < count; counter++) {
            list[counter] = list[counter + 1 ];
        }

        count--;
        return element;
    }

    public int size() {
        return count;
    }
    public void reSize() {
        resize = list.length * 2;
        int[] newList = new int[resize];
        for (int counter = 0; counter < count; counter++) {
            newList[counter] = list[counter];
        }
        list = newList;
    }

    public int get(int index) {
        if (index < 0 || index >= count || count == 0) throw new IllegalArgumentException("NO Such Index: " + index + ",MyArrayList Size: " + count);
        return list[index];
    }

    public boolean contain(int element) {
        for(int num : list) {
            if(num == element) return true;
        }
        return false;
    }

    public void clear() {
        count = 0;
        resize = 0;
        list = new int[3];
    }

    public String print() {
        String result = "[";
        for (int counter = 0; counter < count; counter++) {
            result += list[counter];
            if(counter != count-1) result += ",";
        }
        result += "]";
        return result;

    }

    public void set(int index, int element) {
        if(index < 0 || index >= count) throw new IllegalArgumentException("NO Such Index: " + index + ",MyArrayList Size: " + count);
        list[index] = element;
    }
}
