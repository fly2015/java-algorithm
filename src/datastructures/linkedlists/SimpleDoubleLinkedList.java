/*
 * SimpleDoubleLinkedList.java
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
 */
public class SimpleDoubleLinkedList<E>
{
    private Node head;
    private Node tail;
    
    public SimpleDoubleLinkedList()
    {
    }
    
    private class Node
    {
        private E data;
        private Node next;
        private Node pre;

        public Node(E data)
        {
            this.data = data;
            this.next = null;
            this.pre = null;
        }
        
        public Node(Node pre, E data, Node next)
        {
            this.data = data;
            this.next = next;
            this.pre = pre;
        }
    }
    
    public void addFirst(E data)
    {
        Node newNode = new Node(data);
        if (this.head == null)
        {
            this.head = newNode;
        }
        else
        {
            Node currentNode = head;
            while (currentNode.next != null)
            {
                currentNode = currentNode.next;
            }
            
            if (currentNode.next == null)
            {
                currentNode.next = newNode;
                newNode.pre = currentNode;
            }
        }
    }

    public void addLast(E data)
    {
        Node t = tail;
        Node newNode = new Node(tail, data, null);
        if (t == null)
        {
            this.head = newNode;
        }
        else
        {
            Node currentNode = head;
            while (currentNode.next != null)
            {
                currentNode = currentNode.next;
            }
            
            if (currentNode.next == null)
            {
                currentNode.next = newNode;
                newNode.pre = currentNode;
            }
        }
    }
    
    public void printFromTop()
    {
        Node currentNode = this.head;
        while (currentNode != null)
        {
            if (currentNode.pre != null && currentNode.next != null)
            {
                System.out.println(currentNode.pre.data +  " [" + currentNode.data + "] " +  currentNode.next.data); 
            }
            else
            {
                System.out.println(currentNode.data);
            }
            currentNode = currentNode.next;
        }
    }
    
    public void addLast()
    {
        
    }
    
    public static void main(String[] args)
    {
        SimpleDoubleLinkedList<String> simpleDoubleLinkedList = new SimpleDoubleLinkedList<>();
        simpleDoubleLinkedList.addFirst("A");
        simpleDoubleLinkedList.addFirst("B");
        simpleDoubleLinkedList.addFirst("C");
        
        simpleDoubleLinkedList.printFromTop();
    }
}



/*
 * Changes:
 * $Log: $
 */