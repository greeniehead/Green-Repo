public class LCD extends Television
{
    public LCD()
    {
        super();
    }
    
    public LCD(String model, double cost)
    {
        super(model, cost);
    }
    
    public String toString()
    {
        String output = new String("");
        output = super.toString();
        return output;
    }
}