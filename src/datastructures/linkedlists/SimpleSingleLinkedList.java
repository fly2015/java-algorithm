/*
 * SimpleSingleLinkedList.java
 *
 * Copyright by Hien Ng
 * Da Nang

 */
package datastructures.linkedlists;


/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 * @param <T>
 */
public class SimpleSingleLinkedList<T>
{
    Node<T> head;
    static class Node<T>
    {
        Node< T > next;
        T data;
        
        public Node(T data)
        {
            this.next = null;
            this.data = data;
        }
    }
    
    
    public void add(T data)
    {
        Node<T> newNode = new Node<>(data);
        
        if (this.head == null)
        {
            this.head = newNode;
        }
        else
        {
            Node<T> lastNode = this.head;
            while(lastNode.next != null)
            {
                lastNode = lastNode.next;
            }
            
            lastNode.next = newNode;
        }
    }
    

    public void add(T data, int index)
    {
        if (index < 0 )
        {
            throw new IllegalArgumentException("Can not add to a negative index.");
        }
        
        Node<T> newNode = new Node<T>(data);
        Node<T> headNode = this.head;
        if (index == 0 && headNode == null)
        {
            this.head = newNode;
            return;
        }
        
        if (index == 0 && headNode != null)
        {
            newNode.next = headNode;
            this.head = newNode;
            return;
        }
        
        int targetIndex = 1;
        Node<T> currentNode = headNode;
        while (currentNode != null)
        {
            if (index == targetIndex)
            {
                newNode.next = currentNode.next;
                currentNode.next = newNode;
                return;
            }
            currentNode = currentNode.next;
            targetIndex++;
        }

        if (index > targetIndex)
        {
            throw new IllegalArgumentException("Index is out of bound of the current list.");
        }
    }
    
    public void print()
    {
        Node <T> currentNode = this.head;
        while(currentNode != null)
        {
            System.out.println(currentNode.data.toString());
            currentNode = currentNode.next;
        }
    }
    
    
    public static void main(String[] args)
    {
        SimpleSingleLinkedList<String>  linkedList = new SimpleSingleLinkedList<>();
        linkedList.add("AAA");
        linkedList.add("BBB");
        linkedList.add("XXXX", 0);
        
        linkedList.print();
        
        Object [] arrs = new Object[10];
        System.out.println(arrs.length);
    }
}



/*
 * Changes:
 * $Log: $
 */