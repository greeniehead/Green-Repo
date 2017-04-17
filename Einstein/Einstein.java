
/**
 * Einstein class to demonstrate 'static' keyword.
 * 
 * @author KAT 
 * @version 14Mar17
 */
public class Einstein
{
    // 1.   instance variables
    public static final double C = 3.0E8;
    private static final String[] QUOTES =
        { "A person who never made a mistake never tried anything new.",
          "We cannot solve problems with the same thinking we used when we created them.",
          "Insanity: Doing the same thing over and over again and expecting different results.",
          "Logic will get you from A to B, imagination will take you everywhere.",
          "Try not to become a man of success, but rather try to become a man of value.",
          "Education is what remains after one has forgotten what one has learned in school.",
          "The difference between stupidity and genius is that genius has its limits.",
          "If you can't explain it simply, you don't understand it well enough." };
          
    /**
     * calcEnergy  -- given a mass, calculates the engergy using the famous formula
     * 
     * @param  mass   mass to calculate the energy of.
     * @return        the energy of the provided mass 
     */
    public double calcEnergy(double mass)
    {
        return (mass * C * C);
    } //end calcEnergy
    
    /**
     * wordsOfWisdom  -- returns a random quote from QUOTES.
     * 
     * @return  Random Einstein quote.
     * */
     public String wordsOfWisdom()
     {
         int index = (int)( Math.random() * QUOTES.length);
         return QUOTES[index];
     } // end method wordOfWisdom
     
     
}  //end class Einstein
