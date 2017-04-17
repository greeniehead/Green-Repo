public class LED extends Television
{
    private int numPixels;
    
    public LED()
    {
        
    }
    
    public LED(String model, double cost, int pixelNum)
    {
        super(model, cost);
        numPixels = pixelNum;
    }
    
    public String toString()
    {
        String outStr = "";
        outStr = super.toString();
        outStr += "\n" + "This television has " + numPixels + " pixels.";
        return outStr;
    }
}