
public class DriveThruHandler
{
    private int carsServiced;
    private Queue lane1;
    private Queue lane2;
    
    public DriveThruHandler()
    {
       this.carsServiced = 0;
       this.lane1 = new Queue();
       this.lane2 = new Queue();
    }
    
    public void carPullsIn(Car newCar)
    {
        carsServiced++;
        newCar.setArrivalNum(carsServiced);
        
        if (lane1.size() >= lane2.size())
        {
            System.out.println("Car pulls into lane 2 as its size is " + lane2.size() + " which is smaller than or equal to lane 1's: " + lane1.size());
            lane2.enqueue(newCar);
        }
        else
        {
            System.out.println("Car pulls into lane 1 as its size is " + lane1.size() + " which is smaller than lane 2's: " + lane2.size()); 
            lane1.enqueue(newCar);
        }
    }
    
    public void serviceCar() throws EmptyQueueException
    {
        try
        {
            if (!lane1.isEmpty() && !lane2.isEmpty())
            {
                int car1Arrival = lane1.peek().getData().getArrivalNum();
                int car2Arrival = lane2.peek().getData().getArrivalNum();
                
                if (car1Arrival < car2Arrival)
                {
                    System.out.println("Lane 1 services customer: " + lane1.peek().getData().getName() + " who had order: " + lane1.peek().getData().getOrder());
                    lane1.dequeue();
                }
                else
                {
                    System.out.println("Lane 2 services customer: " + lane2.peek().getData().getName() + " who had order: " + lane2.peek().getData().getOrder());
                    lane2.dequeue();
                } 
            }
            else if(!lane1.isEmpty())
            {
                System.out.println("Lane 2 is empty servicing lane 1");
                lane1.dequeue();
            }
            else
            {
                System.out.println("Lane 1 is empty servicing lane 1");
                lane2.dequeue();
            }
        }
        catch(EmptyQueueException eqe)
        {
            throw new EmptyQueueException("Both lanes are empty, nothing to service");
        }
    } 
    
    public int getLane1Size()
    {
        return lane1.size();
    }
    
    public int getLane2Size()
    {
        return lane2.size();
    }
    
    public String toString()
    {
        String result = "";
        
        result = "LANE 1: " + lane1.toString() + "\nLANE 2: " + lane2.toString();
        
        return result;
    }
}
