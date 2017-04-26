public class MyChoice extends SuperHero
{
    public MyChoice()
    {
        this.setSuitColor("green");
        this.setCape(true);
    }
    
    public String getName()
    {
        String output = "My Choice Man";
        return output;
    }
    
    public String motto()
    {
        String output = "Something to do with My Choice!";
        return output;
    }
    
    public String giveName()
    {
        return this.getName();
    }
    
    public String toString()
    {
        String output;
        output = "Name: My Choice Man" + "\n" +
                 "Suit Color: " + this.getSuitColor() + "\n" +
                 "Cape: " + this.isCaped() + "\n" +
                 "Motto: " + this.motto();
        return output;
    }
}