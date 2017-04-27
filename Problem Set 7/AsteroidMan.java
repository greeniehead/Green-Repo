public class AsteroidMan extends SuperHero
{
    public AsteroidMan()
    {
        this.setSuitColor("green");
        this.setCape(false);
    }
    
    public String getName()
    {
        String output = "Asteroid Man";
        return output;
    }
    
    public String motto()
    {
        String output = "Something to do with Asteroids!";
        return output;
    }
    
    public String toString()
    {
        String output;
        output = "Name: Asteroid Man" + "\n" +
                 "Suit Color: " + this.getSuitColor() + "\n" +
                 "Cape: " + this.isCaped() + "\n" +
                 "Motto: " + this.motto();
        return output;
    }
}