public class MyComputer extends MyDevice
{
    private int RAM;
    private String graphicsCard;
    
    public MyComputer()
    {
        super();
        
        this.RAM = 8;
        this.graphicsCard = new String("nVidia");
    }
    
    public MyComputer(int memory, String color, int RAM, String graphicsCard)
    {
        super(memory, color);
        this.RAM = RAM;
        this.graphicsCard = graphicsCard;
    }
    
    public String getGraphics()
    {
        return graphicsCard;
    }
    
    public void setGraphics(String newGraphicsCard)
    {
        graphicsCard = newGraphicsCard;
    }
    
    public int getRAM()
    {
        return RAM;
    }
    
    public void setRAM(int newRAM)
    {
        RAM = newRAM;
    }
    
    public String toString()
    {
        String output = new String("");
        output = "Computer: " + super.toString() + "\n" +
                 "It has " + RAM + "gb of RAM.\n" +
                 "It uses a " + graphicsCard + " graphics card.";
        return output;
    }
}