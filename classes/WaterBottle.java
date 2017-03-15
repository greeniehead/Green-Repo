public class WaterBottle
{
    private double capacity;
    private String color;
    private String brand;
    
    public WaterBottle(double newCapacity, String newBrand)
    {
        capacity = newCapacity;
        color = "Green";
        brand = newBrand;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public String toString()
    {
        String output = new String();
        
        output = "The capacity is " + capacity + " liters.\n" +
                 "The color is " + color + ".\n" +
                 "The brand is " + brand + ".";
                 
        return output;
    }
}
