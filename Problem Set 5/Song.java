public class Song
{
    private String name;
    private String title;
    private double cost;
    private int rating;
    public Song()
    {
        this.name = "The Who";
        this.title = "Who Are You?";
        cost = 0.99;
        this.rating = 5;
    }
    
    public Song(String title, int rating)
    {
        this.title = title;
        this.rating = rating;
    }
    public Song(String name, String title)
    {
        this.name = name;
        this.title = title;
        cost = 0.99;
        this.rating = rating;
    }
    
    public Song(String name, String title, double cost)
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
    
    public int getRating()
    {
        return rating;
    }
    
    public String toString()
    {
        String output = new String();
        output = "\n"+
                 "Title: " + title + "\n" +
                 "Rating: " + rating + "\n" +
                 "----------------------------------";
                 
        return output;
    }
}