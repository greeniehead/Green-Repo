public class FriedEggMan extends SuperHero
{
    public FriedEggMan()
    {
        this.setSuitColor("brown");
        this.setCape(true);
    }
    
    public String motto()
    {
        String output = "Something to do with Eggs!";
        return output;
    }
    
    public String toString()
    {
        String output;
        output = "Name: Fried Egg Man" + "\n" +
                 "Suit Color: " + this.getSuitColor() + "\n" +
                 "Cape: " + this.isCaped() + "\n" +
                 "Motto: " + this.motto();
        return output;
    }
}