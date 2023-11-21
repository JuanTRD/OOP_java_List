package src;

import java.util.Arrays;

public class myList<E>{
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];
    public myList(){
        elements = new Object[DEFAULT_CAPACITY];
    }
    private void ensureCapa(){
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }
    public void add(E element){
        if(size == elements.length){
            ensureCapa();
        }
        elements[size++] = element;
    }
    public E get(int index){
        if (index>=size || index<0){
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + index);
        }
        return (E) elements[index];
    }

}
