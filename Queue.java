

public class Queue
{
    public Node<Car> head;
    private Node<Car> tail;
    
    public Queue()
    {
        this.head = null;
        this.tail = null;
    }
    
    //enqueue adds to the END of our queue so its pointer should be null until we enqueue another object!
    public void enqueue(Car x)
    {
        //create the node with no pointer because queues insert at back
        Node<Car> newNode = new Node(x, null);
        
        if (isEmpty())
        {
            //because the list is empty we need to set the head to the first insert
            head = newNode;
            tail = newNode;
        }
        else
        {
            //make the previous tail point to the new tail and then set it 
            tail.setNextNode(newNode);
            tail = newNode;
        }
    }
    
    public Node<Car> dequeue() throws EmptyQueueException
    {   
        if(isEmpty())
        {
           throw new EmptyQueueException("Cannot dequeue from an empty queue");
        }
        
        Node<Car> dequeuedNode = head;
        
        //if we dequeued the final node then this will set head to null
        head = head.getNextNode();
        
        //to also remove it from tail pointer
        if(head == null)
        {
            tail = null;
        }
        
        return dequeuedNode;
    }
    
    public Node<Car> peek() throws EmptyQueueException
    {
        if (head == null)
        {
            throw new EmptyQueueException("Can't peak at an empty queue");
        }
        return head; 
    }
    
    public boolean isEmpty() 
    {
        if(head == null)
        {
            return true;
        }
        
        return false;
    }
    
    public int size()   
    {
        int counter = 0;
        Node<Car> current = head;
        
        while(current != null)
        {
            counter++;
            current = current.getNextNode();
        }
        
        return counter;
    }
    
    public String toString()
    {
        String result = "";
        Node<Car> current = head;
        
        while( current != null)
        {
            result += current.getData().toString();
            current = current.getNextNode();
        }
        
        return result;
    }
}
