public class Television
{
    private String model;
    private double price;

    public Television()
    {
        this.model = new String();
        this.price = 0.0;
    }
    
    public Television( String initialModel, double initialPrice )
    {
        this.model = new String( initialModel );
        this.price = initialPrice;
    }
    
    public void setModel( String newModel )
    {
        this.model = newModel;
    }
    
    public String getModel()
    {
        return this.model;
    }
    
    public void setPrice( double newPrice )
    {
        this.price = newPrice;
    }
    
    public double getPrice()
    {
        return this.price;
    }
    
    public String toString()
    {
        String output = new String();
        output = "The Model of this tv is: " + this.model +"\tPrice: " +
        this.price;
        return output;
    }
}