/*
 * SimpleArrayList.java
 *
 * Copyright by CRIF AG
 * Zürich
 * All rights reserved.
 */
package datastructures.array;


/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class SimpleArrayList<E>
{
    private Object [] currentElems;
    private int currentIndex = 0;
    private final static int defaultSize = 3;
    public SimpleArrayList()
    {
        this.currentElems = new Object[defaultSize];
    }
    
    public boolean add(E e)
    {
        if (currentIndex > currentElems.length-1)
        {
            Object [] currentTemp =  currentElems;
            currentElems =  new Object[defaultSize * 2];
            copyArray(currentTemp);
        }
        
        this.currentElems[currentIndex] = e;
        this.currentIndex ++;
        return true;
    }

    private void copyArray(Object[] originalArrays)
    {
        for (int i = 0; i < originalArrays.length; i++)
        {
            this.currentElems[i] = originalArrays[i];
        }
    }    
    
    @SuppressWarnings("unchecked")
    public E get(int i)
    {
        return (E) this.currentElems[i];
    }
    
    public void print()
    {
        for (int i = 0; i < currentIndex; i++)
        {
            System.out.println(currentElems[i]);
        }
    }
    
    public int size()
    {
        return this.currentIndex;
    }
    
    public static void main(String[] args)
    {
        SimpleArrayList<String> simpleArrayList = new SimpleArrayList<>();
        simpleArrayList.add("AAA");
        simpleArrayList.add("BBB");
        simpleArrayList.add("CCC");
        simpleArrayList.add("DDD");
        simpleArrayList.add("EEE");
        
        simpleArrayList.print();
        System.out.println(simpleArrayList.size());
        
        
        System.out.println(simpleArrayList.get(100));
    }
}



/*
 * Changes:
 * $Log: $
 */