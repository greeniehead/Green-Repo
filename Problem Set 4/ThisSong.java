public class ThisSong
{
    private String name;
    private String title;
    private double cost;

    public ThisSong()
    {
        this.name = "The Who";
        this.title = "Who Are You?";
        cost = 0.99;
    }
    
    public ThisSong(String name, String title)
    {
        this.name = name;
        this.title = title;
        cost = 0.99;
    }
    
    public ThisSong(String name, String title, double cost)
    {
        this.name = name;
        this.title = title;
        this.cost = cost;
    }   
    
    public String getName()
    {
        return this.name;
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
    
    public String toString()
    {
        String output = new String();
        output = "\n"+
                 "Artist: " + name + "\n" +
                 "Title: " + title + "\n" +
                 "Cost: " + cost + "\n" +
                 "----------------------------------";
                 
        return output;
    }
}