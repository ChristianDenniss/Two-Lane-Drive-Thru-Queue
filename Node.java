public class Node<T>
{
    //whatever integer data the node will contain
    //final because we want to prevent data mutation
    private final T data;
    
    //our pointer for the next node
    private Node<T> next;
    
    public Node(T data)
    {
        this.data = data;
        
        //set next to null, end our of linked list
        this.next = null;
    }
    
    //override constructor for a linked list with a next/not the end
    public Node(T data, Node<T> next)
    {
        this.data = data;
        this.next = next;
    }
    
    public T getData()
    {
        return data;
    }
    
    public Node<T> getNextNode()
    {
        return next;
    }
    
    public void setNextNode(Node<T> newNext)
    {
        this.next = newNext;
    }
    
    public String toString()
    {
        String node = "Node Data: " + data + " Next Node: " + next;
        return node;
    }
}
