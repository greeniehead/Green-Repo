public class CRT extends Television
{
    private double weight;
    
    public CRT()
    {
        
    }
    
    public CRT(String model, double cost, double w)
    {
        super(model, cost);
        weight = w;
    }
    
    public String toString()
    {
        String outStr = "";
        outStr = super.toString();
        outStr += "\n" + "This television weighs " + weight + " pounds.";
        return outStr;
    }
}