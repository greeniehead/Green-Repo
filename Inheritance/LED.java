public class LED extends Television
{
    public LED()
    {
        super();
    }
    
    public LED(String model, double cost)
    {
        super(model, cost);
    }
    
    public String toString()
    {
        String outStr = "";
        outStr = super.toString();
        return outStr;
    }
}