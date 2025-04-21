public class Driver
{
    public static void main(String[] args) throws EmptyQueueException
    {
        // Create some car objects
        Car car1 = new Car("Order1", "John Doe", 50);
        Car car2 = new Car("Order2", "Jane Smith", 30);
        Car car3 = new Car("Order3", "Alice Brown", 20);
        Car car4 = new Car("Order4", "hi beet", 301);
        Car car5 = new Car("Order5", "dasdd Brwwwown", 25);
        
        DriveThruHandler driveThru = new DriveThruHandler();
        
        driveThru.carPullsIn(car1);
        driveThru.carPullsIn(car2);
        driveThru.carPullsIn(car3);
        driveThru.carPullsIn(car4);
        driveThru.carPullsIn(car5);
        
        String result = driveThru.toString();
        System.out.println(result);
        System.out.println("Lane 1 Size: " + driveThru.getLane1Size());
        System.out.println("Lane 2 Size: " + driveThru.getLane2Size());

        try
        {
            driveThru.serviceCar();
            
        }
        catch(EmptyQueueException eqe)
        {
            throw new EmptyQueueException("Can't service a drive thru with no cars!");
        }
    }
    
}
