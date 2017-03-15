public class Card
{
    private int value;
    private String faceType;
    private String suit;
    
    public Card()
    {
        value = 7;
        suit = "Spades";
        faceType = "none";
    }
    
    public Card(int newValue, String newSuit)
    {
        value = newValue;
        suit = newSuit;
        faceType = "Queen";
    }
    
    public String toString()
    {
        String output = new String();
        output = "Value: " + value + "\n" +
                 "Suit: " + suit;
                 
        if(!faceType.equals("none"))
        {
            output = output + "\n" +
                     "Face: " + faceType;
        }
        output = output + "\n";
        return output;
    }
}