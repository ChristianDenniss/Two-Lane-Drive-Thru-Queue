
public class Car
{
    private int moneyOwed;
    private String name;
    private String order;
    
    //an int to say which # of car it was in the arrival 
    private int carArrivalNum;
    
    public Car(String order, String name, int moneyOwed)
    {
        this.name = name;
        this.order = order;
        this.moneyOwed = moneyOwed;
        this.carArrivalNum = 0;
    }
    
    public void setArrivalNum(int carArrivalNum)
    {
        this.carArrivalNum = carArrivalNum;
    }
    
    public int getArrivalNum()
    {
        return carArrivalNum;
    }
    
    public int getMoneyOwed()
    {
        return moneyOwed;
    }
    
    public String getName()
    {
        return name;
    }
    
    public String getOrder()
    {
        return order;
    }
    
    public String toString()
    {
        String result = " name: " + name + " order: " + order + " money owed: " + moneyOwed;
        return result;
    }
}
